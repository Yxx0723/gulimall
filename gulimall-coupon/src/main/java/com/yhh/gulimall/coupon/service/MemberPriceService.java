package com.yhh.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yhh.common.utils.PageUtils;
import com.yhh.gulimall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author yhh
 * @email yhh@gmail.com
 * @date 2022-12-13 00:22:05
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

