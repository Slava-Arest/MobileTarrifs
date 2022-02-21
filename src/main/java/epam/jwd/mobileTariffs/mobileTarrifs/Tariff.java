package epam.jwd.mobileTariffs.mobileTarrifs;

import java.util.Objects;

/**
 * Entity superclass that extended by child classes.
 * @author - Viachaslau Arestau
 * @version - 1.0
 */

public class Tariff implements Comparable<Tariff> {

    private Double cost;
    private Integer numberOfSubscribers;

    public Tariff(Double cost, Integer numberOfSubscribers) {
        this.cost = cost;
        this.numberOfSubscribers = numberOfSubscribers;
    }

    public Tariff() {

    }

    public Integer getNumberOfSubscribers() {
        return numberOfSubscribers;
    }

    public void setNumberOfSubscribers(Integer numberOfSubscribers) {
        this.numberOfSubscribers = numberOfSubscribers;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "tarriff{" +
                "cost=" + cost +
                ", numberOfSubscribers=" + numberOfSubscribers +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tariff tariff = (Tariff) o;
        return Objects.equals(cost, tariff.cost) && Objects.equals(numberOfSubscribers, tariff.numberOfSubscribers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cost, numberOfSubscribers);
    }

    /*
     I set the parameters for comparison. In accordance with the terms of reference I compared costs of all tariffs.
     I used implementation of Comparable interface to solve this matter. We need no use any special class for sorting in this case.
     The only thing we need now for sorting is Collections.sort method in App.class.
     */

    @Override
    public int compareTo(Tariff o) {
        return (int) (this.getCost() - o.getCost());
    }
}

