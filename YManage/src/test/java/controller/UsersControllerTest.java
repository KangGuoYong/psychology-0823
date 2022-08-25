package controller;

import entity.Users;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import test.ServiceFactory;

import java.util.List;

public class UsersControllerTest {
	Users users;
	@Before
	public void setUp() throws Exception {
		users = new Users();
		users.setUserName("康国勇");
		users.setPwd("1");
	}

	@After
	public void tearDown() throws Exception {
	}
	@Test
	public void queryById() {
		ResponseEntity<List> listResponseEntity = ServiceFactory.getBean(UsersController.class).queryAll();
		System.out.println(listResponseEntity);

	}

	@Test
	public void queryAll() {
	}

	@Test
	public void queryUser() {
		UsersController bean = ServiceFactory.getBean(UsersController.class);
		String s = bean.queryUser(users);
		System.out.println(s);

	}



	@Test
	public void testQueryAll() {
	}

	@Test
	public void testQueryById() {
	}

	@Test
	public void testQueryUser() {
	}

	@Test
	public void add() {
	}

	@Test
	public void edit() {
	}

	@Test
	public void deleteById() {
	}
}