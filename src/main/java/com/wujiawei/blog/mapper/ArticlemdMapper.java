package com.wujiawei.blog.mapper;

import com.wujiawei.blog.entity.Articlemd;

public interface ArticlemdMapper {
    int deleteByPrimaryKey(Integer articleId);

    int insert(Articlemd record);

    int insertSelective(Articlemd record);

    Articlemd selectByPrimaryKey(Integer articleId);

    int updateByPrimaryKeySelective(Articlemd record);

    int updateByPrimaryKeyWithBLOBs(Articlemd record);

    int updateByPrimaryKey(Articlemd record);
}