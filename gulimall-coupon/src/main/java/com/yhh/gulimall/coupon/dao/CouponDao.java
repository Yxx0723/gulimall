package com.yhh.gulimall.coupon.dao;

import com.yhh.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author yhh
 * @email yhh@gmail.com
 * @date 2022-12-13 00:22:05
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
