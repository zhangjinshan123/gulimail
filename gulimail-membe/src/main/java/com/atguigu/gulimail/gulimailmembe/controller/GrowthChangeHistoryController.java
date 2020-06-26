package com.atguigu.gulimail.gulimailmembe.controller;

import java.util.Arrays;
import java.util.Map;

import com.atguigu.gulimail.gulimailmembe.entity.MemberEntity;
import com.atguigu.gulimail.gulimailmembe.fegin.couponFeginService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.atguigu.gulimail.gulimailmembe.entity.GrowthChangeHistoryEntity;
import com.atguigu.gulimail.gulimailmembe.service.GrowthChangeHistoryService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * �ɳ�ֵ�仯��ʷ��¼
 *
 * @author zhangjins
 * @email 1376418632@qq.com
 * @date 2020-06-23 22:38:28
 */
@RestController
@RequestMapping("gulimailmembe/growthchangehistory")
public class GrowthChangeHistoryController {
    @Autowired
    private GrowthChangeHistoryService growthChangeHistoryService;

    @Autowired
    couponFeginService feginService;
    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = growthChangeHistoryService.queryPage(params);

        return R.ok().put("page", page);
    }
    @GetMapping("/tests")
    public  R  reTest(){
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setNickname("张珊");
        R test = feginService.test();
        return R.ok().put("menber", memberEntity).
                put("coupon", test.get("coupon"));


    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		GrowthChangeHistoryEntity growthChangeHistory = growthChangeHistoryService.getById(id);

        return R.ok().put("growthChangeHistory", growthChangeHistory);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GrowthChangeHistoryEntity growthChangeHistory){
		growthChangeHistoryService.save(growthChangeHistory);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody GrowthChangeHistoryEntity growthChangeHistory){
		growthChangeHistoryService.updateById(growthChangeHistory);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		growthChangeHistoryService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
