package com.amor.market.amormarketcore.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * controller 增强器
 * 自定义异常自己添加
 * @author dxt
 * @since 2019年12月20日14:40:15
 */

@Slf4j
@RestControllerAdvice
public class MyControllerAdvice {


    /**
     * 全局异常捕捉处理
     *
     * @param ex
     * @return
     */

    @ExceptionHandler(value = { Exception.class })
    public Map errorHandler(Exception ex, HttpServletRequest request) {
        log.error("接口{} 异常msg： " ,
                request.getRequestURI(),
                ex);
        Map<String,Object> map = new HashMap<>();
        if(ex instanceof MethodArgumentNotValidException){
            MethodArgumentNotValidException e = (MethodArgumentNotValidException)ex;
            map.put("code","4044");
            map.put("message",e.getBindingResult().getFieldError().getDefaultMessage());
        }else if(ex instanceof HttpMessageNotReadableException){
            map.put("code","9999");
            map.put("message","传入参数JSON格式错误 ");
        }else {
            map.put("code","9999");
            map.put("message","系统异常" );
        }
        return map;
    }
}
