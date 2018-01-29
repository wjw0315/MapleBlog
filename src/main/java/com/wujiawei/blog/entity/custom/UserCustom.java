package com.wujiawei.blog.entity.custom;

import com.wujiawei.blog.entity.User;

/**
 * 用户信息的扩展
 * Created by wjw
 */
public class UserCustom extends User {
    //用户的文章数
    private Integer articleCount;

    public Integer getArticleCount() {
        return articleCount;
    }

    public void setArticleCount(Integer articleCount) {
        this.articleCount = articleCount;
    }
}
