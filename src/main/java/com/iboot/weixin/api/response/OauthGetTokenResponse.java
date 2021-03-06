package com.iboot.weixin.api.response;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Oauth授权获取token接口响应对象
 * @author iwangwm
 */
public class OauthGetTokenResponse extends GetTokenResponse {

    @JSONField(name = "refresh_token")
    private String refreshToken;

    private String openid;

    private String scope;

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
}
