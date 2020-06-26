package com.atguigu.gulimail.gulimailmembe.fegin;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("gulimail-coupon")
@Component
public interface couponFeginService{
    @RequestMapping("/coupon/coupon/list1")
     public R test();
}
