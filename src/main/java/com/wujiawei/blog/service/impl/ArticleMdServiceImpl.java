package com.wujiawei.blog.service.impl;

import com.wujiawei.blog.entity.custom.ArticlemdCustom;
import com.wujiawei.blog.mapper.custom.ArticlemdMapperCustom;
import com.wujiawei.blog.service.ArticleMdService;
import org.springframework.beans.factory.annotation.Autowired;

public class ArticleMdServiceImpl implements ArticleMdService {

    @Autowired
    private ArticlemdMapperCustom articlemdMapperCustom;
    @Override
    public ArticlemdCustom getArticleById(Integer status, Integer id) throws Exception {
        return articlemdMapperCustom.getArticleById(status,id);
    }
}
