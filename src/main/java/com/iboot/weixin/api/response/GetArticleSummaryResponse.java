package com.iboot.weixin.api.response;

import com.iboot.weixin.api.entity.ArticleSummary;

import java.util.List;

/**
 * @author iwangwm
 */
public class GetArticleSummaryResponse extends BaseResponse {

    private List<ArticleSummary> list;

    public List<ArticleSummary> getList() {
        return list;
    }

    public void setList(List<ArticleSummary> list) {
        this.list = list;
    }
}
