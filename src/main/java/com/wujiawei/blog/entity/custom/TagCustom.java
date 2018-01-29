package com.wujiawei.blog.entity.custom;

import com.wujiawei.blog.entity.Tag;

/**
 * 文章标签的信息的扩展
 * Created by wjw
 */
public class TagCustom extends Tag {
	//标签对应的文章数目
	private Integer articleCount;

	public Integer getArticleCount() {
		return articleCount;
	}

	public void setArticleCount(Integer articleCount) {
		this.articleCount = articleCount;
	}
}
