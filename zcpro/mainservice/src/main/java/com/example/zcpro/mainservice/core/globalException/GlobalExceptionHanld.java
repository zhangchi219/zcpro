package com.example.zcpro.mainservice.core.globalException;

import com.example.zcpro.mainservice.controller.Hello_boot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHanld {
    public final static Logger logger = LoggerFactory.getLogger(Hello_boot.class);
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Object getGlobalRunTimeException(RuntimeException exception){
        Map map = new HashMap();
        StackTraceElement except = exception.getStackTrace()[0];
        String content = "filename: "+except.getFileName()+";"+"methodName: "+except.getMethodName()+"; lineNum:"+
        except.getLineNumber()+" ; errorMessage:"+exception.toString();
        map.put("errorCode","500");
        map.put("errorMessage", content);
        logger.error(content);
        return map;
    }
}
