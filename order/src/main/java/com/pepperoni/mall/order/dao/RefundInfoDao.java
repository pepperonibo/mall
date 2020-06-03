package com.pepperoni.mall.order.dao;

import com.pepperoni.mall.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author pepperoni
 * @email pepperonibo@gmail.com
 * @date 2020-05-31 23:08:12
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
