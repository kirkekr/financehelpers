package ee.ttu.idk0071.financehelpers;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.Date;


@Data
@Entity
@Getter
@Setter
public class Entries {

   private int ID;
    private String EntryName;
    private String Username;
    private Date InsertDate;
    private double Amount;

}
