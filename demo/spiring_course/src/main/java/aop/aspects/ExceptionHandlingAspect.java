package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {
    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddExceptionHandlingAdvice()
    {
        System.out.println("beforeAddExceptionHandlingAdvice: catching and handling exceptions while trying to add book/magazine ");
        System.out.println("----------------------------------------------------");
    }
}
