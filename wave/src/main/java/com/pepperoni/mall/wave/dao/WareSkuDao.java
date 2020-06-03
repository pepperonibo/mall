package com.pepperoni.mall.wave.dao;

import com.pepperoni.mall.wave.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author pepperoni
 * @email pepperonibo@gmail.com
 * @date 2020-06-01 11:09:55
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
