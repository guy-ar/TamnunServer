package com.backend.tamnun;

import static org.junit.Assert.assertTrue;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.backend.tamnun.entities.User;
import com.backend.tamnun.repos.UserRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TamnonBackebdApplicationTests {

	// Spring should auto inject in runtime the implementation
	@Autowired
	private UserRepository userRepository;
	
	@Test
	public void testCreateUser() {
		User user = new User();
		user.setRole("Admin");
		user.setUserName("guyar");
		user.setPassword("12345");
		user.setEmail("guy@guy.com");
		user.setSiteId(1);
		
		
		userRepository.save(user);
	}

	
	@Test
	public void testFindUserById() {
		Optional<User> user = userRepository.findById(3l);
		System.out.println(user);
		
		
	}
	
	@Test
	public void testUpdateUserById() {
		Optional<User> userOption = userRepository.findById(3l);
		User userUpdated;
		assertTrue(userOption.isPresent());
		if (userOption.isPresent())
		{
			userUpdated = userOption.get();
			userUpdated.setSiteId(2);
			userRepository.save(userUpdated);
			
		}	
		
	}

	@Test
	public void testDeleteUserById() {
		User userToDelete = new User();
		userToDelete.setId(2L);
		userRepository.delete(userToDelete);
			
	}
}


