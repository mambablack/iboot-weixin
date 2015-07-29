package com.iboot.weixin.api.response;

import com.iboot.weixin.api.entity.UpstreamMsgWeek;

import java.util.List;

/**
 * @author iwangwm
 */
public class GetUpstreamMsgWeekResponse extends BaseResponse {

    private List<UpstreamMsgWeek> list;

    public List<UpstreamMsgWeek> getList() {
        return list;
    }

    public void setList(List<UpstreamMsgWeek> list) {
        this.list = list;
    }
}
