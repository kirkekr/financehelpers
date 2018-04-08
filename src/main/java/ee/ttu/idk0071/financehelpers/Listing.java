package ee.ttu.idk0071.financehelpers;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Listing {
	@Id
	@GeneratedValue
	long id;
	Date transactionDate;
	String listingCategory;
	int listingAmount;
}
