package com.bins.gateway.filter;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by songrongbin on 2017/7/27.
 */
// public class AccessFilter extends ZuulFilter {
public class AccessFilter {
    private static Logger logger = LoggerFactory.getLogger(AccessFilter.class);
//    @Override
//    public String filterType() {
//        return "pre";
//    }
//    @Override
//    public int filterOrder() {
//        return 0;
//    }
//    @Override
//    public boolean shouldFilter() {
//        return true;
//    }
//    @Override
//        public Object run() {
//        RequestContext ctx = RequestContext.getCurrentContext();
//        HttpServletRequest request = ctx.getRequest();
//        log.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));
//        Object accessToken = request.getParameter("accessToken");
//        if(accessToken == null) {
//            log.warn("access token is empty");
//            ctx.setSendZuulResponse(false);
//            ctx.setResponseStatusCode(401);
//            return null;
//        }
//        log.info("access token ok");
//        return null;
//    }

}
