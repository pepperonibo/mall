package com.pepperoni.mall.wave.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pepperoni.common.utils.PageUtils;
import com.pepperoni.mall.wave.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author pepperoni
 * @email pepperonibo@gmail.com
 * @date 2020-06-01 11:09:55
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

