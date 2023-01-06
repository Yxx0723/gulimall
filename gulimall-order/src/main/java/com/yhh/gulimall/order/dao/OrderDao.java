package com.yhh.gulimall.order.dao;

import com.yhh.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author yhh
 * @email yhh@gmail.com
 * @date 2022-12-14 20:54:11
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
