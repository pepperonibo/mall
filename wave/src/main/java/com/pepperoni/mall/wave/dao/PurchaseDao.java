package com.pepperoni.mall.wave.dao;

import com.pepperoni.mall.wave.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author pepperoni
 * @email pepperonibo@gmail.com
 * @date 2020-06-01 11:09:55
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
