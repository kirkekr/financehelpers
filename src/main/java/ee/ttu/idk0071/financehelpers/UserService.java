package ee.ttu.idk0071.financehelpers;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	private UserRepository userRepository;
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
public User addUser(User user) {
		
		return userRepository.save(user);
	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

}
