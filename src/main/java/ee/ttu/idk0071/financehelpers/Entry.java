package ee.ttu.idk0071.financehelpers;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class Entry {
    @Id
    @GeneratedValue
   private int ID;
    private String EntryName;
    private String Username;
    private Date InsertDate;
    private double Amount;
   // @OneToOne()
   @OneToOne(cascade=CascadeType.ALL)
    User User;
}
