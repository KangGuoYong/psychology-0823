package controller;

import org.junit.Test;
import org.springframework.http.ResponseEntity;
import test.ServiceFactory;

import java.util.List;

import static org.junit.Assert.*;

public class UsersControllerTest {

	@Test
	public void queryById() {
		ResponseEntity<List> listResponseEntity = ServiceFactory.getBean(UsersController.class).queryAll();
		System.out.println(listResponseEntity);

	}
}