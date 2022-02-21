package epam.jwd.mobileTariffs.app;

import epam.jwd.mobileTariffs.logic.SubscribersCounter;
import epam.jwd.mobileTariffs.logic.TariffSearcher;

import java.util.Collections;

import static epam.jwd.mobileTariffs.repository.TariffRepository.TARIFF_LIST;


public class App {

    public static void main(String[] args) {
        Collections.sort(TARIFF_LIST);
        System.out.println(TARIFF_LIST);

        SubscribersCounter subscribersCounter = new SubscribersCounter();
        System.out.println(subscribersCounter.subscribersCount());

        TariffSearcher tariffSearcher = new TariffSearcher();
        System.out.println(tariffSearcher.searchByCost());
    }
}
