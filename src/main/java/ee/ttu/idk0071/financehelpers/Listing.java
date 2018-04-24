package ee.ttu.idk0071.financehelpers;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@Getter
@Setter
public class Listing {
	@Id
	@GeneratedValue
	private Long id;
	private Date transactionDate;
	private String listingCategory;
	private int listingAmount;
}
