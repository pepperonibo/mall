package com.pepperoni.mall.order.dao;

import com.pepperoni.mall.order.entity.OrderReturnApplyEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单退货申请
 * 
 * @author pepperoni
 * @email pepperonibo@gmail.com
 * @date 2020-05-31 23:08:13
 */
@Mapper
public interface OrderReturnApplyDao extends BaseMapper<OrderReturnApplyEntity> {
	
}
