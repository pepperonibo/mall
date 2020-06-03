package com.pepperoni.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.pepperoni.mall.product.entity.BrandEntity;
import com.pepperoni.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("xiaomi");
//        brandService.save(brandEntity);

//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("小米");
//        brandService.updateById((brandEntity));
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id",1L));
        list.forEach((item)->{
            System.out.println(item);
        });
        System.out.println("save successfully");
    }

}
