package netcracker;

import javax.persistence.*;
import java.util.Set;
import java.util.StringTokenizer;

@Entity
@Table(name = "address")
public class Address {
    @Id

    @GeneratedValue
    private Long id;

    @Column(name = "country")
    private String country;

    @Column(name = "city")
    private String city;

    @Column(name = "street")
    private String street;

    @Column(name = "houseNumber")
    private String houseNumber;

    @Column(name = "corpsNumber")
    private String corpsNumber;

    @Column(name = "flatNumber")
    private String flatNumber;

    /*@OneToMany
    private Set<Human> humans;*/

    Address(String country, String city, String street, String houseNumber, String corpsNumber, String flatNumber){
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.corpsNumber = corpsNumber;
        this.flatNumber = flatNumber;
    }

    public static Address addressCommaToken(String address){
        String[] add = address.split(",");
        return new Address(add[0].trim(), add[1].trim(), add[2].trim(), add[3].trim(), add[4].trim(), add[5].trim());
    }

    public static Address addressOtherToken(String address){
        StringTokenizer add = new StringTokenizer(address, ",-;.");
        return new Address(add.nextToken().trim(),
                add.nextToken().trim(),
                add.nextToken().trim(),
                add.nextToken().trim(),
                add.nextToken().trim(),
                add.nextToken().trim());
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }
    /*
      Возвращает полный адрес в string
    */
    public String getFullAddress(){
        String result = getCountry() + "," + getCity() + "," + getStreet() + "," + getHouseNumber() + "," + getFlatNumber() + "," + getCorpsNumber();
        return result;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public String getCorpsNumber() {
        return corpsNumber;
    }
}
