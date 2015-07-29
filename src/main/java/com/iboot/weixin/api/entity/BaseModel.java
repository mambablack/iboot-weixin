package com.iboot.weixin.api.entity;

import com.iboot.weixin.util.JSONUtil;

/**
 * 抽象实体类
 *
 * @author iwangwm
 */
public abstract class BaseModel implements Model {
    @Override
    public String toJsonString() {
        return JSONUtil.toJson(this);
    }
}
