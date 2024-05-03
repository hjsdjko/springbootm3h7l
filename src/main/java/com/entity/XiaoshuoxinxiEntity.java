package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 小说信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-08 15:02:29
 */
@TableName("xiaoshuoxinxi")
public class XiaoshuoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XiaoshuoxinxiEntity() {
		
	}
	
	public XiaoshuoxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 小说编号
	 */
					
	private String xiaoshuobianhao;
	
	/**
	 * 小说名称
	 */
					
	private String xiaoshuomingcheng;
	
	/**
	 * 小说分类
	 */
					
	private String xiaoshuofenlei;
	
	/**
	 * 小说封面
	 */
					
	private String xiaoshuofengmian;
	
	/**
	 * 小说章节
	 */
					
	private String xiaoshuozhangjie;
	
	/**
	 * 小说简介
	 */
					
	private String xiaoshuojianjie;
	
	/**
	 * 小说链接
	 */
					
	private String xiaoshuolianjie;
	
	/**
	 * 小说内容
	 */
					
	private String xiaoshuoneirong;
	
	/**
	 * 评分
	 */
					
	private Float pingfen;
	
	/**
	 * 小说详情
	 */
					
	private String xiaoshuoxiangqing;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：小说编号
	 */
	public void setXiaoshuobianhao(String xiaoshuobianhao) {
		this.xiaoshuobianhao = xiaoshuobianhao;
	}
	/**
	 * 获取：小说编号
	 */
	public String getXiaoshuobianhao() {
		return xiaoshuobianhao;
	}
	/**
	 * 设置：小说名称
	 */
	public void setXiaoshuomingcheng(String xiaoshuomingcheng) {
		this.xiaoshuomingcheng = xiaoshuomingcheng;
	}
	/**
	 * 获取：小说名称
	 */
	public String getXiaoshuomingcheng() {
		return xiaoshuomingcheng;
	}
	/**
	 * 设置：小说分类
	 */
	public void setXiaoshuofenlei(String xiaoshuofenlei) {
		this.xiaoshuofenlei = xiaoshuofenlei;
	}
	/**
	 * 获取：小说分类
	 */
	public String getXiaoshuofenlei() {
		return xiaoshuofenlei;
	}
	/**
	 * 设置：小说封面
	 */
	public void setXiaoshuofengmian(String xiaoshuofengmian) {
		this.xiaoshuofengmian = xiaoshuofengmian;
	}
	/**
	 * 获取：小说封面
	 */
	public String getXiaoshuofengmian() {
		return xiaoshuofengmian;
	}
	/**
	 * 设置：小说章节
	 */
	public void setXiaoshuozhangjie(String xiaoshuozhangjie) {
		this.xiaoshuozhangjie = xiaoshuozhangjie;
	}
	/**
	 * 获取：小说章节
	 */
	public String getXiaoshuozhangjie() {
		return xiaoshuozhangjie;
	}
	/**
	 * 设置：小说简介
	 */
	public void setXiaoshuojianjie(String xiaoshuojianjie) {
		this.xiaoshuojianjie = xiaoshuojianjie;
	}
	/**
	 * 获取：小说简介
	 */
	public String getXiaoshuojianjie() {
		return xiaoshuojianjie;
	}
	/**
	 * 设置：小说链接
	 */
	public void setXiaoshuolianjie(String xiaoshuolianjie) {
		this.xiaoshuolianjie = xiaoshuolianjie;
	}
	/**
	 * 获取：小说链接
	 */
	public String getXiaoshuolianjie() {
		return xiaoshuolianjie;
	}
	/**
	 * 设置：小说内容
	 */
	public void setXiaoshuoneirong(String xiaoshuoneirong) {
		this.xiaoshuoneirong = xiaoshuoneirong;
	}
	/**
	 * 获取：小说内容
	 */
	public String getXiaoshuoneirong() {
		return xiaoshuoneirong;
	}
	/**
	 * 设置：评分
	 */
	public void setPingfen(Float pingfen) {
		this.pingfen = pingfen;
	}
	/**
	 * 获取：评分
	 */
	public Float getPingfen() {
		return pingfen;
	}
	/**
	 * 设置：小说详情
	 */
	public void setXiaoshuoxiangqing(String xiaoshuoxiangqing) {
		this.xiaoshuoxiangqing = xiaoshuoxiangqing;
	}
	/**
	 * 获取：小说详情
	 */
	public String getXiaoshuoxiangqing() {
		return xiaoshuoxiangqing;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}

}
