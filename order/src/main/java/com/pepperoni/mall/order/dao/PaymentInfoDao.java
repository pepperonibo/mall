package com.pepperoni.mall.order.dao;

import com.pepperoni.mall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author pepperoni
 * @email pepperonibo@gmail.com
 * @date 2020-05-31 23:08:12
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
