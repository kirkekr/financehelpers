package ee.ttu.idk0071.financehelpers;

import javax.persistence.*;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue
    long id;
    String userName;
    String firstName;
    String email;
}
