package ee.ttu.idk0071.financehelpers;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue
    private long id;
    private String userName;
    private String firstName;
    private String email;
}
