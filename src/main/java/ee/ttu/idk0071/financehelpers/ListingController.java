package ee.ttu.idk0071.financehelpers;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ListingController {
	
	private ListingService listingService;
	
	public ListingController(ListingService listingService) {
		this.listingService = listingService;
	}
	
	@RequestMapping(value="/listing", method=RequestMethod.POST, consumes="application/json")
	public Listing addListing(@RequestBody Listing listing) {
		return listingService.addListing(listing);
	}
	@RequestMapping(value="/listings", method=RequestMethod.GET)
	public List<Listing> getAllListings(){
		return listingService.getAllListings();
	}

	@RequestMapping(value="/stats/search/{searchStr}", method = RequestMethod.GET)
	public List<Listing> searchCategory(@PathVariable("searchStr") String searchStr){
		return listingService.searchByCategory(searchStr);
	}
}
