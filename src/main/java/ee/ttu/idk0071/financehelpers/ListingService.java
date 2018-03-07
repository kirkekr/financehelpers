package ee.ttu.idk0071.financehelpers;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ListingService {
	
	private ListingRepository listingRepository;
	public ListingService(ListingRepository listingRepository) {
		this.listingRepository = listingRepository;
	}
	
	public Listing addListing(Listing listing) {
		
		return listingRepository.save(listing);
	}

	List<Listing> getAllListings() {
		return listingRepository.findAll();
	}
}
