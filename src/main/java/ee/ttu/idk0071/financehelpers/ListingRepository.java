package ee.ttu.idk0071.financehelpers;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ListingRepository extends CrudRepository<Listing, Long> {
	@Override
	public List<Listing> findAll();

	public List<Listing> findByListingCategory(String searchStr);
}
