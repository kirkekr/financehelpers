package ee.ttu.idk0071.financehelpers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
	
	private UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping(value="/user/add", method=RequestMethod.POST, consumes="application/json")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	@RequestMapping(value="/users", method=RequestMethod.GET)
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
}
