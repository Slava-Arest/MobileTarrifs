package app;

import logic.CountOfSubscribers;
import logic.TariffSearch;

import java.util.Collections;
import static repository.TariffRepo.TARIFF_LIST;


public class App {

    public static void main(String[] args) {
        Collections.sort(TARIFF_LIST);
        System.out.println(TARIFF_LIST);

        CountOfSubscribers countOfSubscribers = new CountOfSubscribers();
        System.out.println(countOfSubscribers.subscribersCount());

        TariffSearch tariffSearch = new TariffSearch();
        System.out.println(tariffSearch.searchByCost());
    }
}
