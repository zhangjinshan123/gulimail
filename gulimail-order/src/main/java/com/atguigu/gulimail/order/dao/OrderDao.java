package com.atguigu.gulimail.order.dao;

import com.atguigu.gulimail.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * ����
 * 
 * @author zhangjins
 * @email 1376418632@qq.com
 * @date 2020-06-23 21:55:14
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
