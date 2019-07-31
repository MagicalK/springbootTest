package com.atguigu.springboot.component;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * 可以在连接上携带区域信息
 * 当在连接上添加区域信息之后，自动配置类中的区域解析失效，会自动调用我们自己定义的这个区域解析类
 */
public class MyLocaleResolver implements LocaleResolver {
    
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        //首先获取到请求中的变量l所携带的信息
        String l = request.getParameter("l");
        //首先使用locale中默认的
        Locale locale = Locale.getDefault();
        //当l不为空的时候，我们就根据获取到的请求中的参数l的值进行字符串分割操作
        if(!StringUtils.isEmpty(l)){
            String[] split = l.split("_");
            //locale类支持的构造方法（第个参数代表语言，第二个参数代表国家信息）
            locale = new Locale(split[0],split[1]);
        }
        //返回区域对象locale
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
