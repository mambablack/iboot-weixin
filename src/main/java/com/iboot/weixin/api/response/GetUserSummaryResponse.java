package com.iboot.weixin.api.response;

import com.iboot.weixin.api.entity.UserSummary;

import java.util.List;

/**
 * @author iwangwm
 */
public class GetUserSummaryResponse extends BaseResponse {

    private List<UserSummary> list;

    public List<UserSummary> getList() {
        return list;
    }

    public void setList(List<UserSummary> list) {
        this.list = list;
    }
}
