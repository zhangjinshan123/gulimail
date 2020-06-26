package com.atguigu.gulimail.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * �ֿ���Ϣ
 * 
 * @author zhangjins
 * @email 1376418632@qq.com
 * @date 2020-06-23 22:03:41
 */
@Data
@TableName("wms_ware_info")
public class WareInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * �ֿ���
	 */
	private String name;
	/**
	 * �ֿ��ַ
	 */
	private String address;
	/**
	 * �������
	 */
	private String areacode;

}
