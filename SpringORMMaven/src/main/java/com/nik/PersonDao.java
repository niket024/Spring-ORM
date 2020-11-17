package com.nik;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class PersonDao
{
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void save(Person p1)
	{
		hibernateTemplate.save(p1);
	}
}
