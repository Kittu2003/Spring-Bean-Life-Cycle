  //Bean Life Cycle using XML Approach


/*package in.alam.beans;

public class Motor {
  
	public Motor() {
		System.out.println("Motor:: Constructor");
	}
	
	public void start() {
		System.out.println("Motor:: started" );
	}
	
	public void dowork() {
		System.out.println("Motor :: pulling the water ");
	}
	 
	
	public void stop() {
		System.out.println("Motor stopped");
	}
}
*/
      

     //Bean Life Cycle using Programmatic Approach

package in.alam.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Motor implements InitializingBean ,DisposableBean{
  
	public Motor() {
		System.out.println("Motor:: Constructor");
	}
	
	public void dowork() {
		System.out.println("Motor :: pulling the waters ");
	}
         //    3 Using Annotation Approach
	     //@PostConstruct
	     //public void m1() throws Exception {
	     //System.out.println("Motor:: started" );
	     //}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Motor:: started" );
		
	}
	
          //   3 Using Annotation Approach
          //@Predestroy
          //public void m1() throws Exception {
          //System.out.println("Motor:: started" );
          //}
	@Override
	public void destroy() throws Exception {
		System.out.println("Motor stopped");
		
	}
}
