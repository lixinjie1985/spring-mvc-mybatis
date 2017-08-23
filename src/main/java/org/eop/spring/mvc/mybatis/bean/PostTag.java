package org.eop.spring.mvc.mybatis.bean;

import java.util.Date;

/**
 * @author lixinjie
 * @since 2017-08-20
 */
public class PostTag {

	private Long id;
	private Long postId;
	private Long tagId;
	private Date createTime;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getPostId() {
		return postId;
	}
	public void setPostId(Long postId) {
		this.postId = postId;
	}
	public Long getTagId() {
		return tagId;
	}
	public void setTagId(Long tagId) {
		this.tagId = tagId;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
