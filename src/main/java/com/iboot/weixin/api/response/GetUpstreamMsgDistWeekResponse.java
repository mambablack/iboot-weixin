package com.iboot.weixin.api.response;

import com.iboot.weixin.api.entity.UpstreamMsgDistWeek;

import java.util.List;

/**
 * @author iwangwm
 */
public class GetUpstreamMsgDistWeekResponse extends BaseResponse {

    private List<UpstreamMsgDistWeek> list;

    public List<UpstreamMsgDistWeek> getList() {
        return list;
    }

    public void setList(List<UpstreamMsgDistWeek> list) {
        this.list = list;
    }
}
