package demo;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class AuthenticatingAspect {

//    @Pointcut("within(demo..*)")
    @Pointcut("execution(* demo.ShoppingCart.checkout(..))")
    public void authnticatingPointCut(){} //declaration

//    @Pointcut("execution(* demo.ShoppingCart.checkout(..))")
//    public void  authorizationPointCut(){}


//    @Before("authnticatingPointCut() && authorizationPointCut()")  // before(POINTCUT EXPRESSION)
    @Before("authnticatingPointCut()")  // before(POINTCUT EXPRESSION)
    public void authenticate(JoinPoint theJointPoint){                      // JointPoint
        System.out.println("Authenticating");
        System.out.println(theJointPoint.getSignature());
        System.out.println(theJointPoint.getArgs()[0]);
        System.out.println("Authenticating");
    }
}
