package com.iboot.weixin.api.response;

import com.iboot.weixin.api.entity.UserShareHour;

import java.util.List;

/**
 * @author iwangwm
 */
public class GetUserShareHourResponse extends BaseResponse {

    private List<UserShareHour> list;

    public List<UserShareHour> getList() {
        return list;
    }

    public void setList(List<UserShareHour> list) {
        this.list = list;
    }
}
