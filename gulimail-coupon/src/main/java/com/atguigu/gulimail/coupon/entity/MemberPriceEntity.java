package com.atguigu.gulimail.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ��Ʒ��Ա�۸�
 * 
 * @author zhangjins
 * @email 1376418632@qq.com
 * @date 2020-06-23 21:13:36
 */
@Data
@TableName("sms_member_price")
public class MemberPriceEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * sku_id
	 */
	private Long skuId;
	/**
	 * ��Ա�ȼ�id
	 */
	private Long memberLevelId;
	/**
	 * ��Ա�ȼ���
	 */
	private String memberLevelName;
	/**
	 * ��Ա��Ӧ�۸�
	 */
	private BigDecimal memberPrice;
	/**
	 * �ɷ���������Ż�[0-���ɵ����Żݣ�1-�ɵ���]
	 */
	private Integer addOther;

}
