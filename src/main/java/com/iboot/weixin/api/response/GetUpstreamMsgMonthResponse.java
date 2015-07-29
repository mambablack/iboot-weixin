package com.iboot.weixin.api.response;

import com.iboot.weixin.api.entity.UpstreamMsgMonth;

import java.util.List;

/**
 * @author iwangwm
 */
public class GetUpstreamMsgMonthResponse extends BaseResponse {

    private List<UpstreamMsgMonth> list;

    public List<UpstreamMsgMonth> getList() {
        return list;
    }

    public void setList(List<UpstreamMsgMonth> list) {
        this.list = list;
    }
}
