package com.iboot.weixin.api.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * @author iwangwm
 */
public class BaseDataCube extends BaseModel {

    @JSONField(name = "ref_date", format = "yyyy-MM-dd")
    private Date refDate;

    public Date getRefDate() {
        return refDate;
    }

    public void setRefDate(Date refDate) {
        this.refDate = refDate;
    }
}
