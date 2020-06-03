package com.pepperoni.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pepperoni.common.utils.PageUtils;
import com.pepperoni.mall.coupon.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author pepperoni
 * @email pepperonibo@gmail.com
 * @date 2020-05-31 23:11:04
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

