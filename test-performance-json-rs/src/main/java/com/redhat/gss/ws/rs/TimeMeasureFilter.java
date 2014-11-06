package com.redhat.gss.ws.rs;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter("/rest/model/do/*")
public class TimeMeasureFilter implements Filter {

	public void destroy() {
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		Date d = new Date();
		long currentTime = System.currentTimeMillis();
		chain.doFilter(request, response);
		System.out.printf("Request started at %s in %d miliseconds\n", d, System.currentTimeMillis() - currentTime);
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
