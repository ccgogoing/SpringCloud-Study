package com.ccgogoing.microservice.gateway.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * 描述:
 * 打印日志请求  pre过滤器
 *
 * @outhor chong
 * @create 2018-10-27 18:53
 */
public class PreRequestLogFilter extends ZuulFilter {

    private static final Logger LOGGER = LoggerFactory.getLogger(PreRequestLogFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();

        HttpServletRequest request = ctx.getRequest();
        PreRequestLogFilter.LOGGER.info(String.format("send %s request to %s",request.getMethod(),request.getRequestURL().toString()));
        return null;
    }
}
