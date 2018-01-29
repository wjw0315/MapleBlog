package com.wujiawei.blog.mapper.custom;


import com.wujiawei.blog.entity.Tag;
import com.wujiawei.blog.entity.custom.ArticleCustom;
import com.wujiawei.blog.entity.custom.TagCustom;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by wjw
 */
public interface TagMapperCustom {
	//获得标签总数
	public Integer countTag(@Param(value = "status") Integer status) throws Exception;
	
	//获得标签列表
	public List<TagCustom> listTag(@Param(value = "status")Integer status) throws Exception;

	//获得带有该标签的文章列表
	public List<ArticleCustom> listArticleWithTagByPage(@Param(value = "status") Integer status, @Param(value = "tagId") Integer tagId, @Param(value="startPos") Integer startPos, @Param(value="pageSize") Integer pageSize) throws Exception;

	//根据标签名获取标签
	public Tag getTagByName(String name) throws Exception;

}
