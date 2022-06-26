package demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

    @Pointcut("within(demo..*)") // point cut for this package's of All classes
    public void authenticatingPointCut(){

    }

    @Pointcut("within(demo..*)") // point cut for this package's of All classes
    public void authorizationPointCut(){

    }

    //call this methods before those pointcuts
    @Before("authenticatingPointCut() && authorizationPointCut()")
    public void authenticate(){
        System.out.println("Authenticating the Request");
    }
}
