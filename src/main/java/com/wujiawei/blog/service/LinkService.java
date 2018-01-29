package com.wujiawei.blog.service;

import com.wujiawei.blog.entity.Link;
import com.wujiawei.blog.entity.custom.LinkCustom;

import java.util.List;

/**
 * Created by wjw
 */
public interface LinkService {
	
	//获得链接总数
	public Integer countLink(Integer status) throws Exception;

	//获得链接列表
	public List<LinkCustom> listLink(Integer status) throws Exception;

	//添加链接
	public void insertLink(Link link) throws Exception;

	//删除链接
	public void deleteLink(Integer id) throws Exception;

	//更新链接
	public void updateLink(Link link) throws Exception;

	//根据id查询链接
	public LinkCustom getLinkById(Integer id) throws Exception;


}
