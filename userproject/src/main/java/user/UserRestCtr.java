package user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestCtr {
	
	@Autowired
	UserService uService;
	
	@RequestMapping("/caboum")
	public String CaBoum() {
		return "Ca boum ?";
	}
	
//	@RequestMapping("/testuserobj")
//	public User testUserObj(){
//		User u = new User();
//		u.setName("lucie");
//		u.setSurname("limace44");
//		u.setPassword("psw");
//		return u;
//	}
	
	@PostMapping("/create-user")
	public User userService(@RequestBody User newUser) {
		try {
			User u = uService.createUser(newUser);
			return u;
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@GetMapping("/user-info/{userId}")
	public User getUserInfo(@PathVariable("userId") Integer userId) {
		try {
			User u = uService.getUserInfo(userId);
			return u;
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@RequestMapping("/allusers")
	public Iterable<User> getAllUser(){
		return uService.getAllUser();
	}
	

}
