package com.iboot.weixin.api.response;

import com.iboot.weixin.api.entity.UpstreamMsgHour;

import java.util.List;

/**
 * @author iwangwm
 */
public class GetUpstreamMsgHourResponse extends BaseResponse {

    private List<UpstreamMsgHour> list;

    public List<UpstreamMsgHour> getList() {
        return list;
    }

    public void setList(List<UpstreamMsgHour> list) {
        this.list = list;
    }
}
