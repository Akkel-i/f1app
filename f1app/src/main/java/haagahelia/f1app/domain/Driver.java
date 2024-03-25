package haagahelia.f1app.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Driver {



    // atribuuti
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer DriverId;
/*     private User guessMaker;  vasta kun kunnnon database */
    private String name;
    private Integer realPosition;
    private String constructor;




    // constructor

    public Driver() {
        super();
        this.DriverId = null;
        this.name = null;
        this.realPosition = null;
        this.constructor = null;
    }

    public Driver(Integer DriverId, String name, Integer realPosition, String constructor) {
        this.DriverId = DriverId;
        this.name = name;
        this.realPosition = realPosition;
        this.constructor = constructor;
    }

    // get


    public Integer getId() {
        return DriverId;
    }

    public String getName() {
        return name;
    }

    public Integer getRealPosition() {
        return realPosition;
    }

    public String getConstructor() {
        return constructor;
    }

    // set

    public void setId(Integer DriverId) {
        this.DriverId = DriverId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRealPosition(Integer realPosition) {
        this.realPosition = realPosition;
    }

    public void setConstructor(String constructor) {
        this.constructor = constructor;
    }



    @Override
    public String toString() {
        return "Driver [id=" + DriverId + ", name=" + name + ", realPosition=" + realPosition + ", constructor=" + constructor
                + "]";
    }



}
