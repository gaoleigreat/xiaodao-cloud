package com.xiaodao.system.resolver;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import com.xiaodao.common.annotation.LoginUser;
import com.xiaodao.common.constant.Constants;
import com.xiaodao.system.domain.SysUser;
import com.xiaodao.system.service.ISysUserService;

/**
 * 有@LoginUser注解的方法参数，注入当前登录用户
 */

@Configuration
public class LoginUserHandlerResolver implements HandlerMethodArgumentResolver
{
    @Autowired
    private ISysUserService userService;

    @Override
    public boolean supportsParameter(MethodParameter parameter)
    {
        return parameter.getParameterType().isAssignableFrom(SysUser.class)
                && parameter.hasParameterAnnotation(LoginUser.class);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer container, NativeWebRequest nativeWebRequest,
            WebDataBinderFactory factory) throws Exception
    {
        HttpServletRequest request = nativeWebRequest.getNativeRequest(HttpServletRequest.class);
        // 获取用户ID
        Long userid = Long.valueOf(request.getHeader(Constants.USER_KEY));
        if (userid == null)
        {
            return null;
        }
        return userService.selectUserById(userid);
    }
}