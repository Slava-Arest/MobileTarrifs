package epam.jwd.mobileTariffs.logic;

import epam.jwd.mobileTariffs.mobileTarrifs.Tariff;
import static epam.jwd.mobileTariffs.repository.TariffRepository.TARIFF_LIST;

/**
 * Here we search tariff by parameters according to the technical assignment. I chose a cost parameter for searching.
 I set specific price range. Only one tariff from collection matches this parameters.
 * @author - Viachaslau Arestau.
 * @version - 1.0
 */

public class TariffSearcher {

    public Tariff searchByCost(){
        for (Tariff searching:TARIFF_LIST) {
            if (searching.getCost() <= 30.0 && searching.getCost() >= 20.0){
                return searching;
            }
        }
        return searchByCost();
    }
}
