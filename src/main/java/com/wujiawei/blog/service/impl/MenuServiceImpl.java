package com.wujiawei.blog.service.impl;

import com.wujiawei.blog.entity.Menu;
import com.wujiawei.blog.entity.custom.MenuCustom;
import com.wujiawei.blog.mapper.MenuMapper;
import com.wujiawei.blog.mapper.custom.MenuMapperCustom;
import com.wujiawei.blog.service.MenuService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MenuServiceImpl implements MenuService {


    @Autowired
    private MenuMapperCustom menuMapperCustom;

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<MenuCustom> listMenu(Integer status) throws Exception {
        List<MenuCustom> menuCustomList = menuMapperCustom.listMenu(status);
        return menuCustomList;
    }

    @Override
    public void insertMenu(Menu menu) throws Exception {
        menuMapper.insertSelective(menu);
    }

    @Override
    public void deleteMenu(Integer id) throws Exception {
        menuMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateMenu(Menu menu) throws Exception {
        menuMapper.updateByPrimaryKeySelective(menu);
    }

    @Override
    public MenuCustom getMenuById(Integer id) throws Exception {
        MenuCustom menuCustom = new MenuCustom();
        Menu menu = menuMapper.selectByPrimaryKey(id);
        BeanUtils.copyProperties(menu,menuCustom);
        return menuCustom;
    }
}
