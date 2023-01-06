package com.yhh.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yhh.common.utils.PageUtils;
import com.yhh.gulimall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author yhh
 * @email yhh@gmail.com
 * @date 2022-12-12 19:29:41
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

