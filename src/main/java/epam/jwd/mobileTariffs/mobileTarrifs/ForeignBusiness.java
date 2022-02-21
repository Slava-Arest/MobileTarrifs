package epam.jwd.mobileTariffs.mobileTarrifs;

import java.util.Objects;

public class ForeignBusiness extends Tariff {
    public ForeignBusiness(Double cost, Integer numberOfSubscribers) {
        super(cost, numberOfSubscribers);
    }

    private Integer freeMinutes;
    private Integer internetTraffic;
    private Integer roamingMinutes;

    public ForeignBusiness(Double cost, Integer numberOfSubscribers, Integer freeMinutes, Integer internetTraffic, Integer roamingMinutes) {
        super(cost, numberOfSubscribers);
        this.freeMinutes = freeMinutes;
        this.internetTraffic = internetTraffic;
        this.roamingMinutes = roamingMinutes;
    }

    public ForeignBusiness() {

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

    public Integer getRoamingMinutes() {
        return roamingMinutes;
    }

    public void setRoamingMinutes(Integer roamingMinutes) {
        this.roamingMinutes = roamingMinutes;
    }

    @Override
    public String toString() {
        return "ForeignBusiness{" +
                "freeMinutes=" + freeMinutes +
                ", internetTraffic=" + internetTraffic +
                ", roamingMinutes=" + roamingMinutes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ForeignBusiness that = (ForeignBusiness) o;
        return Objects.equals(freeMinutes, that.freeMinutes) && Objects.equals(internetTraffic, that.internetTraffic) && Objects.equals(roamingMinutes, that.roamingMinutes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), freeMinutes, internetTraffic, roamingMinutes);
    }
}
