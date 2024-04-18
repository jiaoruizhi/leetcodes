package utils.annotation;

import java.util.UUID;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j//日志
@Aspect//标记这是切面类
@Component//交给spring管理
public class MyAop {

  @Around("@annotation(calcCostTime)")
  public Object around(ProceedingJoinPoint point, CalcCostTime calcCostTime) throws Throwable {
    //获取目标 class 对象  point.getTarget() 获取目标对象
    Class<?> aClass = point.getTarget().getClass();

    //获取类名
    String className = aClass.getName();

    //获取目标方法名称
    String methodName = point.getSignature().getName();

    //方法参数
    Object[] args = point.getArgs();
    StringBuffer stringBuffer = new StringBuffer();
    for (Object arg : args) {
      stringBuffer.append(arg).append("\\");
    }
    UUID uuid = UUID.randomUUID();
    log.info("uuid{},类名[{}],方法名[{}],方法参数[{}]",uuid,className,methodName,stringBuffer);
    long begin = System.currentTimeMillis();
    Object proceed = point.proceed();
    long end = System.currentTimeMillis();
    log.info("uuid{},类名[{}],方法名[{}],返回值[{}],方法耗[{}]",uuid,className,methodName,proceed,(end-begin));
    return proceed;
  }

}
