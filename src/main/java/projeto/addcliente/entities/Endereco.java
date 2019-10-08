package projeto.addcliente.entities;

import javax.persistence.*;

@Entity
@Table(name = "Endereco")

public class Endereco {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "postal_code")
    private Integer postalCode;

    @Column(name = "street_address")
    private String streetAddress;

    @Column(name = "country_user")
    private String countryUser;

    @OneToOne
    @MapsId  /* significa que a chave ID será executada como chave primaria e estrangeira*/
    private Clientes clientes;

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