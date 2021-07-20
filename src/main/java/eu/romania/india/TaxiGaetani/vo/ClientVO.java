package eu.romania.india.TaxiGaetani.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode
@ToString
public class ClientVO {
    Integer id;
    String firstName;
    String lastName;
    String userName;
    String password;
}
