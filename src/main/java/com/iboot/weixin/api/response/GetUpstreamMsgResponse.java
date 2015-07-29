package com.iboot.weixin.api.response;

import com.iboot.weixin.api.entity.UpstreamMsg;

import java.util.List;

/**
 * @author iwangwm
 */
public class GetUpstreamMsgResponse extends BaseResponse {

    private List<UpstreamMsg> list;

    public List<UpstreamMsg> getList() {
        return list;
    }

    public void setList(List<UpstreamMsg> list) {
        this.list = list;
    }
}
