package epam.jwd.mobileTariffs.logic;

import epam.jwd.mobileTariffs.mobileTarrifs.Tariff;
import epam.jwd.mobileTariffs.mobileTarrifs.ForeignBusiness;
import epam.jwd.mobileTariffs.mobileTarrifs.ForeignBusinessPlus;
import epam.jwd.mobileTariffs.mobileTarrifs.Success;

/**
 * Logical class for counting subscribers of all tariffs
 * @author - Viachaslau Arestau
 * @version - 1.0
 */

public class SubscribersCounter {

    Tariff success = new Success();
    Tariff foreignBusiness = new ForeignBusiness();
    Tariff foreignBusinessPlus = new ForeignBusinessPlus();

    /*
    Here we set variable values from List of Tariffs which located in TariffRepository interface.
     */

    public Integer subscribersCount(){
        success.setNumberOfSubscribers(43567);
        foreignBusiness.setNumberOfSubscribers(15687);
        foreignBusinessPlus.setNumberOfSubscribers(9874);

        return success.getNumberOfSubscribers() + foreignBusiness.getNumberOfSubscribers() + foreignBusinessPlus.getNumberOfSubscribers();
    }
}
