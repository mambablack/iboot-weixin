package com.iboot.weixin.api.response;

import com.iboot.weixin.api.entity.UserShare;

import java.util.List;

/**
 * @author iwangwm
 */
public class GetUserShareResponse extends BaseResponse {

    private List<UserShare> list;

    public List<UserShare> getList() {
        return list;
    }

    public void setList(List<UserShare> list) {
        this.list = list;
    }
}
