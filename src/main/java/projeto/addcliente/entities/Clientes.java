package projeto.addcliente.entities;

import javax.persistence.*;

@Entity
@Table(name = "Clientes")

public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "career")
    private String careerUser;

    @OneToOne(mappedBy = "clientes", cascade = CascadeType.ALL)
    private Endereco endereco;

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getCareerUser(){
        return careerUser;
    }

    public void setCareerUser(String careerUser){
        this.careerUser = firstName;
    }
}

