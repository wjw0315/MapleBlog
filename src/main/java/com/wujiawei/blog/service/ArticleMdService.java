package com.wujiawei.blog.service;

import com.wujiawei.blog.entity.custom.ArticlemdCustom;

public interface ArticleMdService {
    //后台根据ID查询文章进行重新编辑
    public ArticlemdCustom getArticleById(Integer status, Integer id) throws Exception;
}
