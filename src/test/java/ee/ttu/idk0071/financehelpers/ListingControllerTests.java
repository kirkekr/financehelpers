package ee.ttu.idk0071.financehelpers;

import org.apache.catalina.filters.CorsFilter;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(ListingController.class)
public class ListingControllerTests {
    private static final long testID = 1L;
    private static final long testID2 = 2L;
 @Autowired
 private MockMvc mockMvc;
 @MockBean
    private ListingService listingService;
 @InjectMocks
    private ListingController listingController;
    private Listing testListing;
    private Listing testListing2;
    private List<Listing> testListArray;

@Before
    public void setup(){

    testListing = new Listing();
    testListing.setId(testID);
    testListing.setListingAmount(11);
    testListing.setListingCategory("Category");

    testListing2 = new Listing();
    testListing2.setId(testID2);
    testListing2.setListingAmount(22);
    testListing2.setListingCategory("Category2");

    testListArray = new ArrayList<>();
    testListArray.add(testListing);
    testListArray.add(testListing2);

given(listingService.getAllListings()).willReturn(testListArray);
    MockitoAnnotations.initMocks(this);
    mockMvc = MockMvcBuilders
            .standaloneSetup(listingController)
            .addFilters(new CorsFilter())
            .build();
}

@Test
    public void getAllListingTest() throws Exception {
  Mockito.when(listingService.getAllListings()).thenReturn(testListArray);
    mockMvc.perform(get("/listings", RequestMethod.GET))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$", hasSize(2)))
            .andExpect(jsonPath("$[0].id", Matchers.is(1)))
            .andExpect(jsonPath("$[0].listingAmount", Matchers.is(11)))
            .andExpect(jsonPath("$[0].listingCategory", Matchers.is("Category")))
            .andExpect(jsonPath("$[1].id", Matchers.is(2)))
            .andExpect(jsonPath("$[1].listingAmount", Matchers.is(22)))
            .andExpect(jsonPath("$[1].listingCategory", Matchers.is("Category2")));
          Mockito.verify(listingService, Mockito.times(1)).getAllListings();
          verifyNoMoreInteractions(listingService);
    Assert.assertEquals(listingService.getAllListings(), testListArray);
}
}
