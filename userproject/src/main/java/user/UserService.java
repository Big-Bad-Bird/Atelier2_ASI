package user;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	UserRepository uRepo;
	
	public User createUser(User newUser) {
		User u = new User();
		u.setName(newUser.getName());
		u.setSurname(newUser.getUsername());
		u.setPassword(newUser.getPassword());
		u.setArgent(10000);
//		
		uRepo.save(u);
		
		return u;		
	}
	
	public User getUserInfo(Integer userId) {
		if(uRepo.findById(userId).isPresent()) {
			User userToFind = uRepo.findById(userId).get();
			System.out.println("\nUSER TO FIND => "+userToFind);
			return userToFind;
		}
		return null;
	}
	
	public Iterable<User> getAllUser(){
		ArrayList<User> uList = new ArrayList<User>();
		Iterable<User> uIter = uRepo.findAll();
		return uIter;
	}
	
	

}
