package com.pepperoni.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pepperoni.common.utils.PageUtils;
import com.pepperoni.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author pepperoni
 * @email pepperonibo@gmail.com
 * @date 2020-05-31 15:19:19
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

