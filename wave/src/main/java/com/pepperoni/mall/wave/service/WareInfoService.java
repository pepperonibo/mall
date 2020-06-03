package com.pepperoni.mall.wave.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pepperoni.common.utils.PageUtils;
import com.pepperoni.mall.wave.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author pepperoni
 * @email pepperonibo@gmail.com
 * @date 2020-06-01 11:09:55
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

