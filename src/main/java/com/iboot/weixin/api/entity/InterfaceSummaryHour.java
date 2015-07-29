package com.iboot.weixin.api.entity;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author iwangwm
 */
public class InterfaceSummaryHour extends InterfaceSummary {

    @JSONField(name = "ref_hour")
    private Integer refHour;

    public Integer getRefHour() {
        return refHour;
    }

    public void setRefHour(Integer refHour) {
        this.refHour = refHour;
    }
}
