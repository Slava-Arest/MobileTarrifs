package mobileTarrifs;

import java.util.Objects;

public class Success extends Tariff {

    public Success(Double cost, Integer numberOfSubscribers) {
        super(cost, numberOfSubscribers);
    }

    private Integer freeMinutes;
    private Integer internetTraffic;

    public Success(Double cost, Integer numberOfSubscribers, Integer freeMinutes, Integer internetTraffic) {
        super(cost, numberOfSubscribers);
        this.freeMinutes = freeMinutes;
        this.internetTraffic = internetTraffic;
    }

    public Success() {

    }

    public Integer getFreeMinutes() {
        return freeMinutes;
    }

    public void setFreeMinutes(Integer freeMinutes) {
        this.freeMinutes = freeMinutes;
    }

    public Integer getInternetTraffic() {
        return internetTraffic;
    }

    public void setInternetTraffic(Integer internetTraffic) {
        this.internetTraffic = internetTraffic;
    }

    @Override
    public String toString() {
        return "Success{" +
                "freeMinutes=" + freeMinutes +
                ", internetTraffic=" + internetTraffic +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Success success = (Success) o;
        return Objects.equals(freeMinutes, success.freeMinutes) && Objects.equals(internetTraffic, success.internetTraffic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), freeMinutes, internetTraffic);
    }
}
