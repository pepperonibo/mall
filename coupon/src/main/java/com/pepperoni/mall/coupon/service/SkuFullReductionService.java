package com.pepperoni.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pepperoni.common.utils.PageUtils;
import com.pepperoni.mall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author pepperoni
 * @email pepperonibo@gmail.com
 * @date 2020-05-31 23:11:04
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

