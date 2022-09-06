package com.app.dto;

import java.io.Serializable;

/**
 * @author: ljp
 * @description: 分页初始化对象
 * @date: 2022年8月12日 上午11:21:42
 */
public class PageDto implements Serializable {

	private static final long serialVersionUID = 5172649115384573373L;
	/**
	 * 默认每页显示数
	 */
	private static final Integer ROW = 10;
	/**
	 * 默认页码
	 */
	private static final Integer NUM = 1;
	/**
	 * 0
	 */
	private static final Integer ZERO = 0;

	/**
	 * 每页显示条数
	 */
	private Integer limit = ROW;

	/**
	 * 页码
	 */
	private Integer page = NUM;

	/**
	 * sql分页起始位置
	 */
	private Integer dataNum = ZERO;

	/**
	 * 排序 desc降序 asc升序
	 */
	private String sort;

	/**
	 * 状态
	 */
	private Integer state;

	/**
	 * 名称
	 */
	private String name;

	public PageDto() {
	}

	/**
	 *
	 * @param page 页码
	 * @param limit 每页显示数
	 */
	public PageDto(Integer page, Integer limit) {
		if (page != null && page > ZERO) {
			this.page = page;
		}
		if (limit != null && limit > ZERO) {
			this.limit = limit;
		}
		this.dataNum = (this.page - NUM) * this.limit;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		if (limit == null || limit <NUM) {
			return;
		}
		this.limit = limit;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		if (page == null || page <NUM) {
			return;
		}
		this.page = page;
	}

	public Integer getDataNum() {
		return page.equals(NUM)  ? dataNum : (this.getPage() - NUM) * this.getLimit();
	}

	public void setDataNum(Integer dataNum) {
		this.dataNum = dataNum;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
