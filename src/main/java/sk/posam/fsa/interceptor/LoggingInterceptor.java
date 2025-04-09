package sk.posam.fsa.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import static org.slf4j.LoggerFactory.getLogger;


@Component

public class LoggingInterceptor implements HandlerInterceptor {
    private static final Logger LOGGER = getLogger(LoggingInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        LOGGER.info("Before handle request: {} {} " , request.getMethod() , request.getRequestURI());
        return true;
    }
}
