package com.pepperoni.mall.product.dao;

import com.pepperoni.mall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author pepperoni
 * @email pepperonibo@gmail.com
 * @date 2020-05-31 15:19:19
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
