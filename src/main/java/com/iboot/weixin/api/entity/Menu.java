package com.iboot.weixin.api.entity;

import com.iboot.weixin.exception.WeixinException;

import java.util.List;

/**
 * 菜单对象，包含所有菜单按钮
 *
 * @author iwangwm
 */
public class Menu extends BaseModel {

    /**
     * 一级菜单列表，最多3个
     */
    private List<MenuButton> button;

    public List<MenuButton> getButton() {
        return button;
    }

    public void setButton(List<MenuButton> button) {
        if (null == button || button.size() > 3) {
            throw new WeixinException("主菜单最多3个");
        }
        this.button = button;
    }
}
