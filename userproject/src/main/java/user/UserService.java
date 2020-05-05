package user;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	UserRepository uRepo;
	
	public User createUser() {
		User u = new User();
		u.setName("lucie");
		u.setSurname("limace44");
		u.setPassword("psw");
		
		uRepo.save(u);
		
		return u;		
	}
	
	public Iterable<User> getAllUser(){
		ArrayList<User> uList = new ArrayList<User>();
		Iterable<User> uIter = uRepo.findAll();
		return uIter;
	}
	
	

}
