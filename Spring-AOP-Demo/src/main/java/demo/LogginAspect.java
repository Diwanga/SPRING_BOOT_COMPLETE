package demo;

import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class LogginAspect {

    @Pointcut("execution(* demo.ShoppingCart.calTotal(..))")  // pointCut declaration
    public void afterReturningPointCut(){}

    @Before("execution(* demo.ShoppingCart.checkout(..))")
    public void beforeLogger(){
        System.out.println("before logging");
    }


    @After("execution(* *.*.*(.." +
            "" +
            "" +
            "))")
    public void afterLogger(){
        System.out.println("after logger");
    }

    @AfterReturning(pointcut = "afterReturningPointCut()",returning = "returnVal")
    public void afterReturing(int returnVal){
        System.out.println("This is Return Val : " + returnVal);
    }




}




