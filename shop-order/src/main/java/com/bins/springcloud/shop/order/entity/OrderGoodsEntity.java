package com.bins.springcloud.shop.order.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class OrderGoodsEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;

	private String orderId;

	private String orderCode;

	private Integer goodsId;

	private String goodsCode;
	
	private String goodsName;
	
	private String goodsPrice;

	private Integer goodsNumber;

	private String goodsAmount;
	
	private Integer couponAmount;
	
	private Integer discountAmount;
	
	private Integer shoppingAmount;
	
	private String picUrl;
	
	private Integer status;
	
	private Integer isDel;
	
	private Long createBy;
	
	private LocalDateTime createTime;
	
	private LocalDateTime updateTime;

}
