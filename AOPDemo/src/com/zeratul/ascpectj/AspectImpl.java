package com.zeratul.ascpectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectImpl {
	
	@Pointcut(value="execution(* com.zeratul.PlayService.Play(java.lang.String)) && args(param) ")
	public void playPointCut(String param){
		
	}
	@Pointcut(value="execution(* com.zeratul.PlayService.Pause(java.lang.String)) && args(param)")
	public void pausePointCut(String param){
		
	}
	@Pointcut(value="execution(* com.zeratul.PlayService.seek(int)) && args(position)")
	public void seekPointCut(int position){
		
	}
	@Pointcut(value="execution(* com.zeratul.PlayService.feedback(java.lang.String)) && args(msg)")
	public void feedbackPointCut(String msg){
		
	}
	
	@Pointcut(value="execution(* com.zeratul.PlayService.Play(..))")
	public void playPointCutNoParam(){
		
	}
	
	@Before(value="playPointCutNoParam()")
	public void beforeAdviceNoParam(){
		System.out.println("aspectj before no param :--------now :"+System.currentTimeMillis());
	}
	
	@Before(value="playPointCut(param)",argNames="param")
	public void beforeAdvice(String param){
		System.out.println("aspectj before:"+param+"--------now :"+System.currentTimeMillis());
	}
	@After(value="playPointCut(param)",argNames="param")
	public void afterFinallyAdvice(String param) {
		System.out.println("aspectj after:"+param+"--------now :"+System.currentTimeMillis());
	}
	@AfterReturning(value="pausePointCut(param)",returning="retVal",argNames="retVal,param")
	public void afterReturningAdvice(Object retVal,String param) {
		System.out.println("aspectj afterReturning:"+retVal+"----the param:"+param+"--------now :"+System.currentTimeMillis());
	}
	
	@AfterThrowing(value="seekPointCut(position)",throwing="exception",argNames="exception,position")
	public void afterExceptionAdvice(Exception exception,int  position) {
		System.out.println("aspectj afterThrowing:"+exception+"----the param:"+position+"--------now :"+System.currentTimeMillis());
	}
	
	@Around(value = "feedbackPointCut(msg)",argNames="pjp,msg")
	public Object aroundAdvice(ProceedingJoinPoint pjp,String msg) throws Throwable{
		System.out.println(msg);
		System.out.println("===========around before advice");  
	    Object retVal = pjp.proceed(new Object[] {"replace"});  
//	    Object retVal = pjp.proceed();  
	    System.out.println("===========around after advice");  
	    return retVal; 
	}

}
