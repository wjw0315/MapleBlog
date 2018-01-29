package com.wujiawei.blog.mapper.custom;

import com.wujiawei.blog.entity.custom.LinkCustom;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by wjw
 */
public interface LinkMapperCustom {
	
	//获得链接总数
	public Integer countLink(@Param(value = "status") Integer status) throws Exception;
	
	//获得链接列表
	public List<LinkCustom> listLink(@Param(value = "status") Integer status) throws Exception;
	

}
