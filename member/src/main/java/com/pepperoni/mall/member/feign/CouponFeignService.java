package com.pepperoni.mall.member.feign;

import com.pepperoni.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("mall-coupon")
public interface CouponFeignService {

    @RequestMapping("coupon/coupon/member/list")
    public R member_coupon();
}
