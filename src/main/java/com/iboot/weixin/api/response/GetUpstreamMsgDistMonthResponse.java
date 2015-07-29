package com.iboot.weixin.api.response;

import com.iboot.weixin.api.entity.UpstreamMsgDistMonth;

import java.util.List;

/**
 * @author iwangwm
 */
public class GetUpstreamMsgDistMonthResponse extends BaseResponse {

    private List<UpstreamMsgDistMonth> list;

    public List<UpstreamMsgDistMonth> getList() {
        return list;
    }

    public void setList(List<UpstreamMsgDistMonth> list) {
        this.list = list;
    }
}
