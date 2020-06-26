package com.atguigu.gulimail.gulimailmembe.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ��Ա��¼��¼
 * 
 * @author zhangjins
 * @email 1376418632@qq.com
 * @date 2020-06-23 22:38:27
 */
@Data
@TableName("ums_member_login_log")
public class MemberLoginLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * member_id
	 */
	private Long memberId;
	/**
	 * ����ʱ��
	 */
	private Date createTime;
	/**
	 * ip
	 */
	private String ip;
	/**
	 * city
	 */
	private String city;
	/**
	 * ��¼����[1-web��2-app]
	 */
	private Integer loginType;

}
