package com.pepperoni.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pepperoni.common.utils.PageUtils;
import com.pepperoni.mall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author pepperoni
 * @email pepperonibo@gmail.com
 * @date 2020-06-01 10:36:59
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

