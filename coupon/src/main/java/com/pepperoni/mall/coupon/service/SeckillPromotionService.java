package com.pepperoni.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pepperoni.common.utils.PageUtils;
import com.pepperoni.mall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author pepperoni
 * @email pepperonibo@gmail.com
 * @date 2020-05-31 23:11:04
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

