package com.yhh.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yhh.common.utils.PageUtils;
import com.yhh.gulimall.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author yhh
 * @email yhh@gmail.com
 * @date 2022-12-13 00:22:05
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

