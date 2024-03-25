package haagahelia.f1app.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Constructor {


    // atribuuti

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ConstructorId;
/*     private User guessMaker;  vasta kun kunnnon database */
    private String name;
    private Integer realPosition;
    private String driver1;
    private String driver2;



    // constructor

    public Constructor() {
        super();
        this.ConstructorId = null;
        this.name = null;
        this.realPosition = null;
        this.driver1 = null;
        this.driver2 = null;

    }

    public Constructor(Integer ConstructorId, String name, Integer realPosition, String driver1, String driver2) {
        this.ConstructorId = ConstructorId;
        this.name = name;
        this.realPosition = realPosition;
        this.driver1 = driver1;
        this.driver2 = driver2;
    }

    // get

    public Integer getId() {
        return ConstructorId;
    }

    public String getName() {
        return name;
    }

    public Integer getRealPosition() {
        return realPosition;
    }

    public String getDriver1() {
        return driver1;
    }

    public String getDriver2() {
        return driver2;
    }

    // set

    public void setId(Integer ConstructorId) {
        this.ConstructorId = ConstructorId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRealPosition(Integer realPosition) {
        this.realPosition = realPosition;
    }

    public void setDriver1(String driver1) {
        this.driver1 = driver1;
    }

    public void setDriver2(String driver2) {
        this.driver2 = driver2;
    }


    
    @Override
    public String toString() {
        return "Constructor [id=" + ConstructorId + ", name=" + name + ", realPosition=" + realPosition + ", driver1=" + driver1
                + ", driver2=" + driver2 + "]";
    }






}
