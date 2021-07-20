package eu.romania.india.TaxiGaetani.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "TX_USER_DRIVER")
//@MappedSuperclass
@Inheritance(
        strategy = InheritanceType.SINGLE_TABLE
)

@DiscriminatorColumn(
        discriminatorType = DiscriminatorType.STRING,
        name = "USR_TYPE"
)
@Data
@EqualsAndHashCode
@ToString
public abstract class UserAbstract {

    @Id
    @Column(name = "USR_ID")
    @SequenceGenerator(sequenceName = "SEQ_TX_USER_DRIVER", name = "SEQ_TX_USER_DRIVER")
    @GeneratedValue(generator = "SEQ_TX_USER_DRIVER")
    private Integer id;

    @Column(name = "USR_FIRST_NAME")
    private String firstName;

    @Column(name = "USR_LAST_NAME")
    private String lastName;

    @Column(name = "USR_USER_NAME")
    private String userName;

    @Column(name = "USR_PASSWORD")
    private String password;

}
