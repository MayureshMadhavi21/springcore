package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpelMain {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/springcore/spel/spelConfig.xml");
		Demo demo = applicationContext.getBean("demo",Demo.class);
		System.out.println(demo);
	    ((AbstractApplicationContext)applicationContext).close();
	    
	    SpelExpressionParser temp = new SpelExpressionParser();
	    Expression expression = temp.parseExpression("21+21");
	    System.out.println(expression.getValue());
	}
}
