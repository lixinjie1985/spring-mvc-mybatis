package org.eop.spring.mvc.mybatis.service.impl;

import java.util.List;

import org.eop.spring.mvc.mybatis.bean.Comment;
import org.eop.spring.mvc.mybatis.mapper.CommentMapper;
import org.eop.spring.mvc.mybatis.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author lixinjie
 * @since 2017-08-23
 */
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentMapper commentMapper;
	
	@Override
	public Long saveComment(Comment comment) {
		return null;
	}

	@Override
	public Long updateComment(Comment comment) {
		return null;
	}

	@Override
	public Long removeComment(Long id) {
		return null;
	}

	@Override
	public Comment getComment(Long id) {
		return null;
	}

	@Override
	public List<Comment> listAllComments() {
		return null;
	}

	@Override
	public List<Comment> listCommentsByPost(Long postId) {
		return null;
	}

	@Override
	public List<Comment> listCommentsByBlog(Long blogId) {
		return null;
	}

}
