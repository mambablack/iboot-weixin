package com.iboot.weixin.api.enums;

/**
 * @author iwangwm
 */
public enum MediaType {

    /**
     * 图片
     */
    IMAGE("image"),

    /**
     * 语音
     */
    VOICE("voice"),

    /**
     * 视频
     */
    VIDEO("video"),

    /**
     * 缩略图
     */
    THUMB("thumb");

    String value;

    private MediaType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
