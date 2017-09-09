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
		commentMapper.insertComment(comment);
		return comment.getId();
	}

	@Override
	public Long updateComment(Comment comment) {
		commentMapper.updateComment(comment);
		return comment.getId();
	}

	@Override
	public Long removeComment(Long id) {
		commentMapper.deleteComment(id);
		return id;
	}

	@Override
	public Comment getComment(Long id) {
		return commentMapper.selectComment(id);
	}

	@Override
	public List<Comment> listAllComments() {
		return commentMapper.selectComments();
	}

	@Override
	public List<Comment> listCommentsByPost(Long postId) {
		return commentMapper.selectCommentsByPost(postId);
	}

	@Override
	public List<Comment> listCommentsByBlog(Long blogId) {
		return commentMapper.selectCommentsByBlog(blogId);
	}

}
