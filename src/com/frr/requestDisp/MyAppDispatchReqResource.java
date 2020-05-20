package com.frr.requestDisp;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.frr.resource.PlanResource;

/*@ApplicationPath("/api/")                                                                                                                                                                                                                                                                                                                                                         )*/
public class MyAppDispatchReqResource extends Application {
	private Set<Object> singleton;
	
	public MyAppDispatchReqResource() {
		singleton=new HashSet<Object>();
		singleton.add(new PlanResource());
		System.out.println("\n MyApp-->constructor");
	}

	@Override
	public Set<Class<?>> getClasses() {
		System.out.println("\n getClasses()");
		return super.getClasses();
	}

	@Override
	public Set<Object> getSingletons() {
		System.out.println("\n \n getSingletons()");
		return singleton;
	}

}
