package ee.ttu.idk0071.financehelpers;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListingService {
	
	private ListingRepository listingRepository;
	public ListingService(ListingRepository listingRepository) {
		this.listingRepository = listingRepository;
	}
	
	public Listing addListing(Listing listing) {
		
		return listingRepository.save(listing);
	}

	public List<Listing> getAllListings() {
		return listingRepository.findAll();
	}
}
