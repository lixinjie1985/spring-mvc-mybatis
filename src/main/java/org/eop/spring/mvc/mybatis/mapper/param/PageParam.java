package org.eop.spring.mvc.mybatis.mapper.param;

/**
 * @author lixinjie
 * @since 2017-09-09
 */
public class PageParam {

	private int pageNum;
	private int pageSize;
	
	public PageParam() {
		
	}
	
	public PageParam(int pageNum, int pageSize) {
		this.pageNum = pageNum;
		this.pageSize = pageSize;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
}
