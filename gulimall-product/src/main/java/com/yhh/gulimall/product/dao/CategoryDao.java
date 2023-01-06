package com.yhh.gulimall.product.dao;

import com.yhh.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author yhh
 * @email yhh@gmail.com
 * @date 2022-12-12 19:29:41
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
