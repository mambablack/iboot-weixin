package com.iboot.weixin.api.response;

import com.iboot.weixin.api.entity.ArticleTotal;

import java.util.List;

/**
 * @author iwangwm
 */
public class GetArticleTotalResponse extends BaseResponse {

    private List<ArticleTotal> list;

    public List<ArticleTotal> getList() {
        return list;
    }

    public void setList(List<ArticleTotal> list) {
        this.list = list;
    }
}
