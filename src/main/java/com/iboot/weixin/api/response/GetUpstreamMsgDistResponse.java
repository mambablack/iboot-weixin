package com.iboot.weixin.api.response;

import com.iboot.weixin.api.entity.UpstreamMsgDist;

import java.util.List;

/**
 * @author iwangwm
 */
public class GetUpstreamMsgDistResponse extends BaseResponse {

    private List<UpstreamMsgDist> list;

    public List<UpstreamMsgDist> getList() {
        return list;
    }

    public void setList(List<UpstreamMsgDist> list) {
        this.list = list;
    }
}
