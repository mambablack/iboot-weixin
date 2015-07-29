package com.iboot.weixin.api.response;

import com.iboot.weixin.api.entity.BaseModel;
import com.iboot.weixin.api.enums.ResultType;
import com.iboot.weixin.util.StrUtil;

/**
 * 微信API响应报文对象基类
 *
 * @author iwangwm
 */
public class BaseResponse extends BaseModel {

    private String errcode;
    private String errmsg;

    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        //将接口返回的错误信息转换成中文，方便提示用户出错原因
        if (StrUtil.isNotBlank(this.errcode) && !ResultType.SUCCESS.getCode().toString().equals(this.errcode)) {
            return ResultType.get(this.errcode).getDescription();
        }
        return this.errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }
}
