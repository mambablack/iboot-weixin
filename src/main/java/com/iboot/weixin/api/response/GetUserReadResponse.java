package com.iboot.weixin.api.response;

import com.iboot.weixin.api.entity.UserRead;

import java.util.List;

/**
 * @author iwangwm
 */
public class GetUserReadResponse extends BaseResponse {

    private List<UserRead> list;

    public List<UserRead> getList() {
        return list;
    }

    public void setList(List<UserRead> list) {
        this.list = list;
    }
}
