package com.wujiawei.blog.service;

import com.wujiawei.blog.entity.Options;
import com.wujiawei.blog.entity.custom.OptionsCustom;


/**
 * Created by wjw
 */
public interface OptionsService {
	//获得基本信息
	public OptionsCustom getOptions() throws Exception;

	//新建基本信息
	public void insertOptions(Options options) throws Exception;

	//更新基本信息
	public void updateOptions(Options options) throws Exception;
}
