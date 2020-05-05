package user;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@RequestMapping("/userservicejson")
	public User useService() {
		User u = uService.createUser();
		return u;
	}
	
	@RequestMapping("/allusers")
	public Iterable<User> getAllUser(){
		return uService.getAllUser();
	}
	

}
