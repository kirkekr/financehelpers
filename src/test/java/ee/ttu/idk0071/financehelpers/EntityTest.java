package ee.ttu.idk0071.financehelpers;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class EntityTest {
    private Listing testListing;
    private User testUser;
    private static final long testID = 1L;
    private void setupListing(){
        if(testListing == null){
            testListing = new Listing();
            testListing.setListingCategory("Category");
            testListing.setListingAmount(111);
            testListing.setId(testID);
        }
    }

    private void setupUser(){
        if(testUser == null){
            testUser = new User();
            testUser.setEmail("email");
            testUser.setFirstName("Name");
            testUser.setUserName("USerName");
            testUser.setId(testID);
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
