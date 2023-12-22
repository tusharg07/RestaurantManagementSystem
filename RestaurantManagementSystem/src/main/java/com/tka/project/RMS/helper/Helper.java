package com.tka.project.RMS.helper;

import java.time.LocalDateTime;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component 
public class Helper {
	
	@Before("execution(* com.tka.project.RMS.controller.ManagerController.getAllManager())")
	public void checkAuthorization() {
		System.out.println("User  uthorization started" + LocalDateTime.now());
	}
	
	@After("execution(* com.tka.project.RMS.controller.ManagerController.getAllManager())")
	public void checkAuthorization1() {
		System.out.println("User in authorized after method complition");
	}

}
