package com.pepperoni.mall.member.dao;

import com.pepperoni.mall.member.entity.MemberCollectSpuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员收藏的商品
 * 
 * @author pepperoni
 * @email pepperonibo@gmail.com
 * @date 2020-06-01 10:36:59
 */
@Mapper
public interface MemberCollectSpuDao extends BaseMapper<MemberCollectSpuEntity> {
	
}
