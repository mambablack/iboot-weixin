package com.iboot.weixin.util;

import java.util.Map;
import java.util.UUID;

import com.alibaba.fastjson.JSON;
import com.iboot.weixin.bean.pay.PayJsRequest;
import com.iboot.weixin.bean.pay.PayNativeReply;
import com.iboot.weixin.bean.pay.PayNativeRequest;
import com.iboot.weixin.bean.pay.PayPackage;
import com.iboot.weixin.bean.paymch.MchPayNativeReply;

public class PayUtil {

	/**
	 * 生成支付JS请求JSON
	 * 
	 * @param payPackage
	 * @param appId
	 * @param paternerKey
	 * @param paySignkey
	 *            appkey
	 * @return
	 */
	public static String generatePayJsRequestJson(PayPackage payPackage, String appId, String paternerKey, String paySignkey) {
		Map<String, String> mapP = MapUtil.objectToMap(payPackage);
		String package_ = SignatureUtil.generatePackage(mapP, paternerKey);// stringA带sign
		PayJsRequest payJsRequest = new PayJsRequest();
		payJsRequest.setAppId(appId);
		payJsRequest.setNonceStr(getNonceStr());
		payJsRequest.setPackage_(package_);
		payJsRequest.setSignType("MD5");
		payJsRequest.setTimeStamp(System.currentTimeMillis() / 1000 + "");
		Map<String, String> mapS = MapUtil.objectToMap(payJsRequest, "signType", "paySign");
		String paySign = SignatureUtil.generatePaySign(mapS, paySignkey);
		payJsRequest.setPaySign(paySign);
		return JSONUtil.toJson(payJsRequest);
	}

	public static String generatePayJsRequestJson(String prePayId, String appId, String paternerKey, String paySignkey) {
		String package_ = "prepay_id=" + prePayId;
		PayJsRequest payJsRequest = new PayJsRequest();
		payJsRequest.setAppId(appId);
		payJsRequest.setNonceStr(UUID.randomUUID().toString());
		payJsRequest.setPackage_(package_);
		payJsRequest.setSignType("MD5");
		payJsRequest.setTimeStamp(System.currentTimeMillis() / 1000 + "");
		Map<String, String> mapS = MapUtil.objectToMap(payJsRequest, "signType", "paySign");
		String paySign = SignatureUtil.generatePaySign(mapS, paySignkey);
		payJsRequest.setPaySign(paySign);
		return JSON.toJSONString(payJsRequest,false);
//		return JSONUtil.toJson(payJsRequest);
	}

	/**
	 * 生成Native支付JS请求URL
	 * 
	 * @param appid
	 * @param productid
	 * @param paySignkey
	 * @return
	 */
	public static String generatePayNativeRequestURL(String appid, String productid, String paySignkey) {

		PayNativeRequest payNativeRequest = new PayNativeRequest();
		payNativeRequest.setAppid(appid);
		payNativeRequest.setNoncestr(UUID.randomUUID().toString());
		payNativeRequest.setProductid(productid);
		payNativeRequest.setTimestamp(System.currentTimeMillis() / 1000 + "");
		Map<String, String> mapS = MapUtil.objectToMap(payNativeRequest, "sign");
		String sign = SignatureUtil.generatePaySign(mapS, paySignkey);
		payNativeRequest.setSign(sign);

		Map<String, String> map = MapUtil.objectToMap(payNativeRequest);
		return "weixin://wxpay/bizpayurl?" + MapUtil.mapJoin(map, false, false);
	}
	public static String getNonceStr() {
		// 随机数
		String currTime = TenpayUtil.getCurrTime();
		// 8位日期
		String strTime = currTime.substring(8, currTime.length());
		// 四位随机数
		String strRandom = TenpayUtil.buildRandom(4) + "";
		// 10位序列号,可以自行调整。
		return strTime + strRandom;
	}
	/**
	 * 生成 native 支付回复XML
	 * 
	 * @param payPackage
	 * @param appId
	 * @param retCode
	 *            0 正确
	 * @param retErrMsg
	 * @param paternerKey
	 * @return
	 */
	public static String generatePayNativeReplyXML(PayPackage payPackage, String appId, String retCode, String retErrMsg, String paternerKey) {

		PayNativeReply payNativeReply = new PayNativeReply();
		payNativeReply.setAppid(appId);
		payNativeReply.setNoncestr(UUID.randomUUID().toString());
		payNativeReply.setRetcode(retCode);
		payNativeReply.setReterrmsg(retErrMsg);
		payNativeReply.setTimestamp(System.currentTimeMillis() + "");
		String package_ = SignatureUtil.generatePackage(MapUtil.objectToMap(payPackage), paternerKey);
		payNativeReply.setPackage_(package_);
		payNativeReply.setSignmethod("sha1");
		String appSignature = SignatureUtil.generatePackage(MapUtil.objectToMap(payNativeReply, "appsignature", "signmethod"), paternerKey);
		payNativeReply.setAppsignature(appSignature);

		return XMLConverUtil.convertToXML(payNativeReply);
	}

	// MCH -------------------------------------------------

	/**
	 * (MCH)生成支付JS请求对象
	 * 
	 * @param prepay_id
	 *            预支付订单号
	 * @param appId
	 * @param key
	 *            商户支付密钥
	 * @return
	 */
	public static String generateMchPayJsRequestJson(String prepay_id, String appId, String key) {
		String package_ = "prepay_id=" + prepay_id;
		PayJsRequest payJsRequest = new PayJsRequest();
		payJsRequest.setAppId(appId);
		payJsRequest.setNonceStr(getNonceStr());
		payJsRequest.setPackage_(package_);
		payJsRequest.setSignType("MD5");
		payJsRequest.setTimeStamp(System.currentTimeMillis() / 1000 + "");
		// @fantycool 提交修正bug
		// Map<String, String> mapS =
		// MapUtil.objectToMap(payJsRequest,"signType","paySign");
		Map<String, String> mapS = MapUtil.objectToMap(payJsRequest);
		String paySign = SignatureUtil.generateSign(mapS, key);
		payJsRequest.setPaySign(paySign);
		return JSON.toJSONString(payJsRequest,false);
//		return JSONUtil.toJson(payJsRequest);
	}

	/**
	 * (MCH)生成Native支付JS请求URL
	 * 
	 * @param appid
	 * @param mch_id
	 * @param productid
	 * @param key
	 * @return
	 */
	public static String generateMchPayNativeRequestURL(String appid, String mch_id, String productid, String key) {

		PayNativeRequest payNativeRequest = new PayNativeRequest();
		payNativeRequest.setAppid(appid);
		payNativeRequest.setNoncestr(UUID.randomUUID().toString());
		payNativeRequest.setProductid(productid);
		payNativeRequest.setTimestamp(System.currentTimeMillis() / 1000 + "");
		Map<String, String> mapS = MapUtil.objectToMap(payNativeRequest, "sign");
		mapS.put("mch_id", mch_id);
		String sign = SignatureUtil.generatePaySign(mapS, key);
		payNativeRequest.setSign(sign);

		Map<String, String> map = MapUtil.objectToMap(payNativeRequest);
		return "weixin://wxpay/bizpayurl?" + MapUtil.mapJoin(map, false, false);
	}

	/**
	 * (MCH)生成 native 支付回复XML
	 * 
	 * @param mchPayNativeReply
	 * @param key
	 * @return
	 */
	public static String generateMchPayNativeReplyXML(MchPayNativeReply mchPayNativeReply, String key) {
		Map<String, String> map = MapUtil.objectToMap(mchPayNativeReply);
		String sign = SignatureUtil.generateSign(map, key);
		mchPayNativeReply.setSign(sign);
		return XMLConverUtil.convertToXML(mchPayNativeReply);
	}

}