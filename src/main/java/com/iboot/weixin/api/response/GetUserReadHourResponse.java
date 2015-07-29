package com.iboot.weixin.api.response;

import com.iboot.weixin.api.entity.UserReadHour;

import java.util.List;

/**
 * @author iwangwm
 */
public class GetUserReadHourResponse extends BaseResponse {

    private List<UserReadHour> list;

    public List<UserReadHour> getList() {
        return list;
    }

    public void setList(List<UserReadHour> list) {
        this.list = list;
    }
}
