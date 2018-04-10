package ee.ttu.idk0071.financehelpers;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class EntityTest {
    private Listing testListing;
    private User testUser;

    private void setupListing(){
        if(testListing == null){
            testListing = new Listing();
            testListing.listingCategory ="Category";
        }
    }

    private void setupUser(){
        if(testUser == null){
            testUser = new User();
        }
    }
    @Test
    public void isListingTest(){
    setupListing();
    assertNotNull(testListing);
    }

    @Test
    public void isUserTest(){
        setupUser();
        assertNotNull(testUser);
    }
}
