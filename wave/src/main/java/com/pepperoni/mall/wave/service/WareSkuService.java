package com.pepperoni.mall.wave.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pepperoni.common.utils.PageUtils;
import com.pepperoni.mall.wave.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author pepperoni
 * @email pepperonibo@gmail.com
 * @date 2020-06-01 11:09:55
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

