package com.atguigu.gulimail.product;

import com.atguigu.gulimail.product.entity.BrandEntity;
import com.atguigu.gulimail.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimailProductApplicationTests {

	@Autowired
	BrandService brandService;
	@Test
	void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("历史");
        brandEntity.setSort(45);

        brandService.save(brandEntity);
	}

	@Test
	void  search(){
        BrandEntity byId = brandService.getById(1);
        byId.setDescript("这是描retre述信息");
        brandService.updateById(byId);
    }

}
