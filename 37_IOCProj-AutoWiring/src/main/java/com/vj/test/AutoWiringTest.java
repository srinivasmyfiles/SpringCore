package com.vj.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.vj.beans.TravelAgent;


public class AutoWiringTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		TravelAgent agent=null,agent1=null;
		
	   //create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get Bean class object
		agent=factory.getBean("agent",TravelAgent.class);
		System.out.println(agent.tourBudgeting());
		/*System.out.println("============================");
		agent1=factory.getBean("agent1",TravelAgent.class);
		System.out.println(agent1.tourBudgeting());*/
		
		
				

	}

}
