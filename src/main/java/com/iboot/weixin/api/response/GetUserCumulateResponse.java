package com.iboot.weixin.api.response;

import com.iboot.weixin.api.entity.UserCumulate;

import java.util.List;

/**
 * @author iwangwm
 */
public class GetUserCumulateResponse extends BaseResponse {

    private List<UserCumulate> list;

    public List<UserCumulate> getList() {
        return list;
    }

    public void setList(List<UserCumulate> list) {
        this.list = list;
    }
}
