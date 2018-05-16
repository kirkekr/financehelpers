package ee.ttu.idk0071.financehelpers;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends CrudRepository<User, Long> {
	@Override
	public List<User> findAll();
}
