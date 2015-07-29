package com.iboot.weixin.api.response;

import com.iboot.weixin.api.entity.InterfaceSummary;

import java.util.List;

/**
 * @author iwangwm
 */
public class GetInterfaceSummaryResponse extends BaseResponse {

    private List<InterfaceSummary> list;

    public List<InterfaceSummary> getList() {
        return list;
    }

    public void setList(List<InterfaceSummary> list) {
        this.list = list;
    }
}
