package com.iboot.weixin.api.response;

import com.iboot.weixin.api.entity.InterfaceSummaryHour;

import java.util.List;

/**
 * @author iwangwm
 */
public class GetInterfaceSummaryHourResponse extends BaseResponse {

    private List<InterfaceSummaryHour> list;

    public List<InterfaceSummaryHour> getList() {
        return list;
    }

    public void setList(List<InterfaceSummaryHour> list) {
        this.list = list;
    }
}
