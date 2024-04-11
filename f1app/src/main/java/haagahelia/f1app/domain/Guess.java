package haagahelia.f1app.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
// import jakarta.validation.constraints.Size;  jos olisi vaikka viesti niin voisi rajata kokoa 
import jakarta.validation.constraints.Size;

@Entity
public class Guess {

    // atribuuti
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "guessId")
    private Integer id;
/*     private User guessMaker;  Tämän voisi nyt liittää, mutta tässä on validation niin pysyy string */
    @Size(min=3, max=25)
    @NotNull
    private String guessMaker;

    private Integer verGuess;
    private Integer perGuess;
    private Integer lecGuess;
    private Integer saiGuess;
    private Integer piaGuess;
    private Integer norGuess;
    private Integer rusGuess;
    private Integer hamGuess;
    private Integer aloGuess;
    private Integer strGuess;
    private Integer tsuGuess;
    private Integer ricGuess;
    private Integer hulGuess;
    private Integer magGuess;
    private Integer albGuess;
    private Integer sarGuess;
    private Integer botGuess;
    private Integer zhoGuess;
    private Integer gasGuess;
    private Integer ocoGuess;



    // constructor

    public Guess() {
        /* super(); */
        this.guessMaker = null;
        this.verGuess = null;
        this.perGuess = null;
        this.lecGuess = null;
        this.saiGuess = null;
        this.hulGuess = null;
        this.botGuess = null;
        this.ocoGuess = null;
        this.gasGuess = null;
        this.zhoGuess = null;
        this.sarGuess = null;
        this.sarGuess = null;
        this.albGuess = null;
        this.magGuess = null;
        this.ricGuess = null;
        this.tsuGuess = null;
        this.strGuess = null;
        this.piaGuess = null;
        this.norGuess = null;
        this.rusGuess = null;
        this.hamGuess = null;

    }

    public Guess(String guessMaker, Integer verGuess, Integer perGuess, Integer lecGuess,
            Integer saiGuess, Integer piaGuess, Integer norGuess, Integer rusGuess, Integer hamGuess, Integer aloGuess,
            Integer strGuess, Integer tsuGuess, Integer ricGuess, Integer hulGuess, Integer magGuess, Integer albGuess,
            Integer sarGuess, Integer botGuess, Integer zhoGuess, Integer gasGuess, Integer ocoGuess) {
        this.guessMaker = guessMaker;
        this.verGuess = verGuess;
        this.perGuess = perGuess;
        this.lecGuess = lecGuess;
        this.saiGuess = saiGuess;
        this.piaGuess = piaGuess;
        this.norGuess = norGuess;
        this.rusGuess = rusGuess;
        this.hamGuess = hamGuess;
        this.aloGuess = aloGuess;
        this.strGuess = strGuess;
        this.tsuGuess = tsuGuess;
        this.ricGuess = ricGuess;
        this.hulGuess = hulGuess;
        this.magGuess = magGuess;
        this.albGuess = albGuess;
        this.sarGuess = sarGuess;
        this.botGuess = botGuess;
        this.zhoGuess = zhoGuess;
        this.gasGuess = gasGuess;
        this.ocoGuess = ocoGuess;
    }

    public Integer getPiaGuess() {
        return piaGuess;
    }

    public void setPiaGuess(Integer piaGuess) {
        this.piaGuess = piaGuess;
    }

    public void setNorGuess(Integer norGuess) {
        this.norGuess = norGuess;
    }

    public void setRusGuess(Integer rusGuess) {
        this.rusGuess = rusGuess;
    }

    public void setHamGuess(Integer hamGuess) {
        this.hamGuess = hamGuess;
    }

    public void setAloGuess(Integer aloGuess) {
        this.aloGuess = aloGuess;
    }

    public void setStrGuess(Integer strGuess) {
        this.strGuess = strGuess;
    }

    public void setTsuGuess(Integer tsuGuess) {
        this.tsuGuess = tsuGuess;
    }

    public void setRicGuess(Integer ricGuess) {
        this.ricGuess = ricGuess;
    }

    public void setMagGuess(Integer magGuess) {
        this.magGuess = magGuess;
    }

    public void setAlbGuess(Integer albGuess) {
        this.albGuess = albGuess;
    }

    public void setSarGuess(Integer sarGuess) {
        this.sarGuess = sarGuess;
    }

    public void setZhoGuess(Integer zhoGuess) {
        this.zhoGuess = zhoGuess;
    }

    public void setGasGuess(Integer gasGuess) {
        this.gasGuess = gasGuess;
    }

    public void setOcoGuess(Integer ocoGuess) {
        this.ocoGuess = ocoGuess;
    }

    public Integer getNorGuess() {
        return norGuess;
    }

    public Integer getRusGuess() {
        return rusGuess;
    }

    public Integer getHamGuess() {
        return hamGuess;
    }

    public Integer getAloGuess() {
        return aloGuess;
    }

    public Integer getStrGuess() {
        return strGuess;
    }

    public Integer getTsuGuess() {
        return tsuGuess;
    }

    public Integer getRicGuess() {
        return ricGuess;
    }

    public Integer getMagGuess() {
        return magGuess;
    }

    public Integer getAlbGuess() {
        return albGuess;
    }

    public Integer getSarGuess() {
        return sarGuess;
    }

    public Integer getZhoGuess() {
        return zhoGuess;
    }

    public Integer getGasGuess() {
        return gasGuess;
    }

    public Integer getOcoGuess() {
        return ocoGuess;
    }


    public Integer getVerGuess() {
        return verGuess;
    }

    public void setMaxGuess(Integer verGuess) {
        this.verGuess = verGuess;
    }

    public Integer getPerGuess() {
        return perGuess;
    }

    public void setPerGuess(Integer perGuess) {
        this.perGuess = perGuess;
    }

    public Integer getLecGuess() {
        return lecGuess;
    }

    public void setLecGuess(Integer lecGuess) {
        this.lecGuess = lecGuess;
    }

    public Integer getSaiGuess() {
        return saiGuess;
    }

    public void setSaiGuess(Integer saiGuess) {
        this.saiGuess = saiGuess;
    }

    public Integer getHulGuess() {
        return hulGuess;
    }

    public void setHulGuess(Integer hulGuess) {
        this.hulGuess = hulGuess;
    }

    public Integer getBotGuess() {
        return botGuess;
    }

    public void setBotGuess(Integer botGuess) {
        this.botGuess = botGuess;
    }



    public Integer getId() {
        return id;
    }

    public String getGuessMaker() {
        return guessMaker;
    }


 

    public void setGuess(String guessMaker) {
        this.guessMaker = guessMaker;
    }



    @Override
    public String toString() {
        return "Guess [guessId=" + id + ", guessMaker=" + guessMaker + ", verGuess=" + verGuess + ", perGuess="
                + perGuess + ", lecGuess=" + lecGuess + ", saiGuess=" + saiGuess + ", piaGuess=" + piaGuess
                + ", norGuess=" + norGuess + ", rusGuess=" + rusGuess + ", hamGuess=" + hamGuess + ", aloGuess="
                + aloGuess + ", strGuess=" + strGuess + ", tsuGuess=" + tsuGuess + ", ricGuess=" + ricGuess
                + ", hulGuess=" + hulGuess + ", magGuess=" + magGuess + ", albGuess=" + albGuess + ", sarGuess="
                + sarGuess + ", botGuess=" + botGuess + ", zhoGuess=" + zhoGuess + ", gasGuess=" + gasGuess
                + ", ocoGuess=" + ocoGuess + "]";
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setGuessMaker(String guessMaker) {
        this.guessMaker = guessMaker;
    }

    public void setVerGuess(Integer verGuess) {
        this.verGuess = verGuess;
    }


    
  
    






}
