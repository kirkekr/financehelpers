package ee.ttu.idk0071.financehelpers;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListingRepository extends CrudRepository<Listing, Long> {
	@Override
	public List<Listing> findAll();
}
