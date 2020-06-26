package com.atguigu.gulimail.gulimailmembe.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimail.gulimailmembe.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * ���ֱ仯��ʷ��¼
 *
 * @author zhangjins
 * @email 1376418632@qq.com
 * @date 2020-06-23 22:38:28
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

