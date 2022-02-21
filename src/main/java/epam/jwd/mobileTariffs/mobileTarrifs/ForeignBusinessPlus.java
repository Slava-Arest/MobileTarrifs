package epam.jwd.mobileTariffs.mobileTarrifs;


import java.util.Objects;

public class ForeignBusinessPlus extends ForeignBusiness {

    private Integer freeRoamingSMS;

    public ForeignBusinessPlus(Double cost, Integer numberOfSubscribers, Integer freeMinutes, Integer internetTraffic, Integer roamingMinutes, Integer freeRoamingSMS) {
        super(cost, numberOfSubscribers, freeMinutes, internetTraffic, roamingMinutes);
        this.freeRoamingSMS = freeRoamingSMS;
    }

    public ForeignBusinessPlus(Integer freeRoamingSMS) {
        this.freeRoamingSMS = freeRoamingSMS;
    }

    public ForeignBusinessPlus() {
        
    }

    public Integer getFreeRoamingSMS() {
        return freeRoamingSMS;
    }

    public void setFreeRoamingSMS(Integer freeRoamingSMS) {
        this.freeRoamingSMS = freeRoamingSMS;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ForeignBusinessPlus that = (ForeignBusinessPlus) o;
        return Objects.equals(freeRoamingSMS, that.freeRoamingSMS);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), freeRoamingSMS);
    }

    @Override
    public String toString() {
        return "ForeignBusinessPlus{" +
                "freeRoamingSMS=" + freeRoamingSMS +
                '}';
    }
}
