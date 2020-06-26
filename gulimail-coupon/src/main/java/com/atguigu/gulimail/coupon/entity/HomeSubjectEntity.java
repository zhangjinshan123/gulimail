package com.atguigu.gulimail.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ��ҳר���jd��ҳ����ܶ�ר�⣬ÿ��ר�������µ�ҳ�棬չʾר����Ʒ��Ϣ��
 * 
 * @author zhangjins
 * @email 1376418632@qq.com
 * @date 2020-06-23 21:13:36
 */
@Data
@TableName("sms_home_subject")
public class HomeSubjectEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ר������
	 */
	private String name;
	/**
	 * ר�����
	 */
	private String title;
	/**
	 * ר�⸱����
	 */
	private String subTitle;
	/**
	 * ��ʾ״̬
	 */
	private Integer status;
	/**
	 * ��������
	 */
	private String url;
	/**
	 * ����
	 */
	private Integer sort;
	/**
	 * ר��ͼƬ��ַ
	 */
	private String img;

}
