package com.iboot.weixin.api.response;

import com.iboot.weixin.api.entity.Menu;

/**
 * @author iwangwm
 */
public class GetMenuResponse extends BaseResponse {

    private Menu menu;

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
