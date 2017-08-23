package org.eop.spring.mvc.mybatis.interceptor;

import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * @author lixinjie
 * @since 2017-08-23
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {

	private Set<String> noNeedLoginSet;
	
	public void setNoNeedLoginSet(Set<String> noNeedLoginSet) {
		this.noNeedLoginSet = noNeedLoginSet;
	}



	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		return super.preHandle(request, response, handler);
	}
}
