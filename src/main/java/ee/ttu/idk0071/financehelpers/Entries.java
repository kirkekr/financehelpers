package ee.ttu.idk0071.financehelpers;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Entries {

    @Id
   private int ID;
    private String EntryName;
    private String Username;
    private Date InsertDate;
    private double Amount;

}
