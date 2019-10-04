package projeto.addcliente.entities;

import javax.persistence.*;

@Entity
@Table(name = "Endereco")

public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "postal_code")
    private Integer postalCode;

    @Column(name = "street_address")
    private String streetAddress;

    @Column(name = "country_user")
    private String countryUser;

    public Endereco(){

    }
    public Endereco(Integer postalCode, String streetAddress, String countryUser) {
        this.postalCode = postalCode;
        this.streetAddress = streetAddress;
        this.countryUser = countryUser;
    }

    public Integer getPostalCode(){
        return postalCode;
    }

    public void setPostalCode(String firstName){
        this.postalCode = postalCode;
    }
    public String getStreetAddress(){
        return streetAddress;
    }

    public void setStreetAddress(String lastName){
        this.streetAddress = streetAddress;
    }
    public String getCountryUser(){
        return countryUser;
    }

    public void setCountryUser(String careerUser){
        this.countryUser = countryUser;
    }
}