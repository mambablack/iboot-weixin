package com.iboot.weixin.handle;

import com.iboot.weixin.message.BaseMsg;
import com.iboot.weixin.message.req.BaseEvent;

/**
 * 微信事件处理器接口
 *
 * @author iwangwm
 * @since 1.1
 */
public interface EventHandle<E extends BaseEvent> {
    /**
     * 处理微信事件
     *
     * @param event 微信事件
     * @return 回复用户的消息
     */
    BaseMsg handle(E event);

    /**
     * 在处理之前，判断本事件是否符合处理的条件
     *
     * @param event 事件
     * @return 是否需要处理
     */
    boolean beforeHandle(E event);
}
