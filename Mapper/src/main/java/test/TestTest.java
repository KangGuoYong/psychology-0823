package test;

import entity.Users;
import kgy.mapper.UsersMapper;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

/** 
* Test Tester. 
* 
* @author <Authors name> 
* @since <pre>8�� 22, 2022</pre> 
* @version 1.0 
*/ 
public class TestTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: add(String name, String value) 
* 
*/ 
@Test
public void testAdd() throws Exception {
	UsersMapper bean = ServiceFactory.getBean(UsersMapper.class);
	Users users = bean.queryById(1);
	System.out.println(users);
} 


} 
