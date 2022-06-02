package com.springcore.springapp.SpringPrimitiveTypeSetterInjection;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


//Life cycle using Annotations
public class Employee {
	 private int id;
	   private String name;
	   public int getId() {
		return id;
	   }
	   public void setId(int id) {
		System.out.println("In setter method");
		this.id = id;
	   }
	   public String getName() {
		return name;
	   }
	   public void setName(String name) {
		this.name = name;
	   }
	    @PostConstruct
	    public void hi() {
	    	System.out.println("In Hi method");
	    }
	    
	    @PreDestroy
	    //need to enable hook for the destroy method to be invoked.
	    public void bye() {
	    	System.out.println("In Bye method");
	    }
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + "]";
		}
		
	    
}



//Life cycle using spring interfaces
//public class Employee implements  InitializingBean,DisposableBean{
//	 private int id;
//	   private String name;
//	   public int getId() {
//		return id;
//	   }
//	   public void setId(int id) {
//		System.out.println("In setter method");
//		this.id = id;
//	   }
//	   public String getName() {
//		return name;
//	   }
//	   public void setName(String name) {
//		this.name = name;
//	   }
//	    
//		@Override
//		public String toString() {
//			return "Employee [id=" + id + ", name=" + name + "]";
//		}
//		@Override
//		public void afterPropertiesSet() throws Exception {
//			// TODO Auto-generated method stub
//			System.out.println("In afterPropertiesSet method");
//		}
//		@Override
//		public void destroy() throws Exception {
//			// TODO Auto-generated method stub
//			System.out.println("In destroy method");
//		}
//	    
//}

//Life cycle using  Xml Configuration

//public class Employee {
//	 private int id;
//	   private String name;
//	   public int getId() {
//		return id;
//	   }
//	   public void setId(int id) {
//		System.out.println("In setter method");
//		this.id = id;
//	   }
//	   public String getName() {
//		return name;
//	   }
//	   public void setName(String name) {
//		this.name = name;
//	   }
//	    public void hi() {
//	    	System.out.println("In Hi method");
//	    }
//	    //need to enable hook for the destroy method to be invoked.
//	    public void bye() {
//	    	System.out.println("In Bye method");
//	    }
//		@Override
//		public String toString() {
//			return "Employee [id=" + id + ", name=" + name + "]";
//		}
//	    
//}
