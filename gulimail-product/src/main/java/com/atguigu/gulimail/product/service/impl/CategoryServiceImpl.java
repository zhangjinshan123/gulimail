package com.atguigu.gulimail.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimail.product.dao.CategoryDao;
import com.atguigu.gulimail.product.entity.CategoryEntity;
import com.atguigu.gulimail.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Autowired
    CategoryDao categoryDao;
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> categoryEntities = categoryDao.selectList(null);
        List<CategoryEntity> level1 = categoryEntities.stream().filter(categoryEntity ->
             categoryEntity.getParentCid() == 0
        ).map((menu) -> {

            menu.setChildern(getChildern(menu, categoryEntities ));
                return menu;
        }) .collect(Collectors.toList());
        return level1;
    }
    private List<CategoryEntity> getChildern(CategoryEntity root ,List<CategoryEntity> all){
        List<CategoryEntity> childern = all.stream().filter((categoryEntity) -> {
            return categoryEntity.getParentCid() == root.getCatId();
        }).map((menu)->{
           menu.setChildern(getChildern(menu,all));
           return menu;
        }).sorted((menu1,menu2) -> {
           return (menu1.getSort()==null?0:menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());
//        System.out.println("chuildersize:"+childern.size());


        return  childern;
    }

}