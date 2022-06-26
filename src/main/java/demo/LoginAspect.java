package demo;
//import org.aspectj.lang.annotation.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect // Aspect
@Component // To read from as component from beanConfig
public class LoginAspect {

    //Befroe execution of demo.ShoppingChart.shoppingChart(..) with any return type and any parameters
    @Before("execution(* demo.ShoppingChart.shoppingChart(..))")
    public void logger(JoinPoint jp){ // JoinPoint to get the details of the method OBJECT
                                    // from where it's calling

        //System.out.println(jp.getSignature());
        String arg = jp.getArgs()[0].toString();
        System.out.println("Befor Logger "+ arg);
    }


    @After("execution(* *.*.shoppingChart(..))")
    public void afterLogger(){
        System.out.println("After logger");
    }

//    @AfterReturning("execution(* *.*.quantity())")
//    public void afterReturningPointCut(){
//        System.out.println("After returning ");
//    }

    @Pointcut("execution(* demo.ShoppingChart.quantity(..))")// WHERE TO EXECUTE THE POINT CUT
    public void afterReturningPointCut(){

    }

    @AfterReturning(pointcut = "afterReturningPointCut()",
    returning = "retVal") // Returning value from the pointcut to this method and execute this after retuning
    public void afterReturning(int retVal){
        System.out.println("After Returning: "+ retVal);
    }
}
