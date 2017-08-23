package org.eop.spring.mvc.mybatis.bean;

import java.util.Date;

/**
 * @author lixinjie
 * @since 2017-08-19
 */
public class Tag {

	private Long id;
	private String name;
	private Date createTime;
	private Long blogId;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Long getBlogId() {
		return blogId;
	}
	public void setBlogId(Long blogId) {
		this.blogId = blogId;
	}
}
