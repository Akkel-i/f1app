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
public class Race {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer raceId;
    private String name;
    private String country;
    private Integer lapCount;


// Relaatio yhellä kisalla on monta kierrosta
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "race")
    @JsonIgnoreProperties("race")  // one way to avoid infinite loop during JSON serialization/deserialization

    private List<Lap> laps;

    public Race() {
    };


    public Race(String name, String country, Integer lapCount) {
        this.name = name;
        this.country = country;
        this.lapCount = lapCount;
    }

    public Integer getRaceId() {
        return raceId;
    }
    public void setRaceId(Integer raceId) {
        this.raceId = raceId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public Integer getLapCount() {
        return lapCount;
    }
    public void setLapCount(Integer lapCount) {
        this.lapCount = lapCount;
    }

    @Override
    public String toString() {
        return "Race [raceId=" + raceId + ", name=" + name + ", country=" + country + ", lapCount=" + lapCount
                + "]";
    }

    

}
