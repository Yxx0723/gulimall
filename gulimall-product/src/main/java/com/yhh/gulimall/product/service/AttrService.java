package com.yhh.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yhh.common.utils.PageUtils;
import com.yhh.gulimall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author yhh
 * @email yhh@gmail.com
 * @date 2022-12-12 19:29:41
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

