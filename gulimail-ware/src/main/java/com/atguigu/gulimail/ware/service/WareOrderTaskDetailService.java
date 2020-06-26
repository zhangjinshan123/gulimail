package com.atguigu.gulimail.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimail.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * ��湤����
 *
 * @author zhangjins
 * @email 1376418632@qq.com
 * @date 2020-06-23 22:03:41
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

