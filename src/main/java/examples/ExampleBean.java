package examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExampleBean {
	private AnotherBean beanOne;
	private YetAnotherBean beanTwo;
	
	 private int i;

	    public void setBeanOne(AnotherBean beanOne) {
	        this.beanOne = beanOne;
	    }

	    public void setBeanTwo(YetAnotherBean beanTwo) {
	        this.beanTwo = beanTwo;
	    }

	    public void setIntegerProperty(int i) {
	        this.i = i;
	    }
	    
	    
	    
	    
	    
	    public void add() {
	    	System.out.println("aaaaaaaaaaaaa");
	    	beanOne.ffuucckk();
	    	System.out.println(i);
	    }
	    
	  
}
