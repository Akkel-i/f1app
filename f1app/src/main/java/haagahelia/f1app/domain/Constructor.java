package haagahelia.f1app.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Constructor {


    // atribuuti

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ConstructorId;
/*     private User guessMaker;  vasta kun kunnnon database */
    private String name;




    // Relaatio, yhellä tallilla monta kuskia
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "constructor")
    @JsonIgnoreProperties("constructor")  // one way to avoid infinite loop during JSON serialization/deserialization

    private List<Driver> drivers;


    // constructor

    public Constructor() {
    }

    public Constructor(String name) {
        this.name = name;
    }


    public Integer getConstructorId() {
        return ConstructorId;
    }


    public void setConstructorId(Integer constructorId) {
        ConstructorId = constructorId;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public List<Driver> getDrivers() {
        return drivers;
    }


    public void setDrivers(List<Driver> drivers) {
        this.drivers = drivers;
    }


    @Override
    public String toString() {
        return "Constructor [ConstructorId=" + ConstructorId + ", name=" + name + ", drivers=" + drivers + "]";
    }




}
