package com.atguigu.gulimail.gulimailmembe.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimail.gulimailmembe.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * ��Ա��¼��¼
 *
 * @author zhangjins
 * @email 1376418632@qq.com
 * @date 2020-06-23 22:38:27
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

