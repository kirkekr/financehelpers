package ee.ttu.idk0071.financehelpers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListingController {
	
	private ListingService listingService;
	
	public ListingController(ListingService listingService) {
		this.listingService = listingService;
	}
	
	@RequestMapping(value="/listings/add", method=RequestMethod.POST, consumes="application/json")
	public Listing addListing(@RequestBody Listing listing) {
		return listingService.addListing(listing);
	}
	@RequestMapping(value="/listings", method=RequestMethod.GET)
	public List<Listing> getAllListings(){
		return listingService.getAllListings();
	}
}
