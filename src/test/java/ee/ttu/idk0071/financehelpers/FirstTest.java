package ee.ttu.idk0071.financehelpers;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class FirstTest {
    Listing testListing;

    private void setup(){
        if(testListing == null){
            testListing = new Listing();
        }
    }
    @Test
    public void addListingTest(){
    setup();
    assertNotNull(testListing);
    }
}
