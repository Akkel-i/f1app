package haagahelia.f1app.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Driver {



    // atribuuti
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    /* @Column(name = "driverId") */
    private Integer driverId; 
/*     private User guessMaker;  vasta kun kunnnon database */
    private String firstName;
    private String lastName;
    private Integer driverNumber;

    // Relaatio yhellä kuskilla monta kierrosta
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "driver")
    @JsonIgnoreProperties("driver")  // one way to avoid infinite loop during JSON serialization/deserialization

    private List<Lap> laps;


    // Driver ManyToOne Driver kuskilla on monta kisaa
    @ManyToOne
    @JsonIgnoreProperties ("drivers") // estää JSON infinite loop
    @JoinColumn(name = "ConstructorId") // ForeignKey
    private Constructor constructor;


    // constructor

    public Driver() {
        super();
        this.firstName = null;
        this.lastName = null;
        this.driverNumber = null;
        this.constructor = null;
    }

    public Driver(String firstName, String lastName, Integer driverNumber, Constructor constructor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.driverNumber = driverNumber;
        this.constructor = constructor;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getDriverNumber() {
        return driverNumber;
    }

    public void setDriverNumber(Integer driverNumber) {
        this.driverNumber = driverNumber;
    }

    public Constructor getConstructor() {
        return constructor;
    }

    public void setConstructor(Constructor constructor) {
        this.constructor = constructor;
    }

    public List<Lap> getLaps() {
        return laps;
    }

    public void setLaps(List<Lap> laps) {
        this.laps = laps;
    }

    @Override
    public String toString() {
        return "Driver [firstName=" + firstName + ", lastName=" + lastName + ", driverNumber=" + driverNumber
                + ", constructor=" + constructor + ", laps=" + laps + "]";
    }

 
}
