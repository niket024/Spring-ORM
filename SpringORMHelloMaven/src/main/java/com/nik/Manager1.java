package com.nik;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manager1
{
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"config.xml");

		PersonDao dao = context.getBean("persondao", PersonDao.class);
		Person p1 = new Person();
		p1.setId(234);
		p1.setFname("abc");
		p1.setLname("xyz");
		p1.setAge(23);
		dao.save(p1);
		System.out.println("done");
		context.close();
	}
}
