package haagahelia.f1app.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Lap {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer lapId;
    private double lapTime; 


        // Lap ManyToOne Race kisalla on monta kierrosta
    @ManyToOne
    @JsonIgnoreProperties ("laps") // estää JSON infinite loop
    @JoinColumn(name = "raceId") // ForeignKey
    private Race race;

        // Lap ManyToOne Driver kuskilla on monta kisaa
    @ManyToOne
    @JsonIgnoreProperties ("laps") // estää JSON infinite loop
    @JoinColumn(name = "driverId") // ForeignKey
    private Driver driver;


    public Lap() {
    };
    

  

    public Lap( double lapTime, Race race, Driver driver) {
        this.lapTime = lapTime;
        this.race = race;
        this.driver = driver;
    }




    public Integer getLapId() {
        return lapId;
    }


    public void setLapId(Integer lapId) {
        this.lapId = lapId;
    }


    public double getLapTime() {
        return lapTime;
    }


    public void setLapTime(double lapTime) {
        this.lapTime = lapTime;
    }


    public Race getRace() {
        return race;
    }


    public void setRace(Race race) {
        this.race = race;
    }


    public Driver getDriver() {
        return driver;
    }


    public void setDriver(Driver driver) {
        this.driver = driver;
    }


    @Override
    public String toString() {
        return "Lap [lapId=" + lapId + ", lapTime=" + lapTime + ", race=" + race + ", driver=" + driver + "]";
    }

    
    
}
