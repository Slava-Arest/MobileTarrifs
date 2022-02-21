package epam.jwd.mobileTariffs.repository;

import epam.jwd.mobileTariffs.mobileTarrifs.Tariff;
import epam.jwd.mobileTariffs.mobileTarrifs.ForeignBusiness;
import epam.jwd.mobileTariffs.mobileTarrifs.ForeignBusinessPlus;
import epam.jwd.mobileTariffs.mobileTarrifs.Success;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Repository class which contains list of tariffs.
 * @author - Viachaslau Arestau
 * @version - 1.0
 */

public interface TariffRepository {
    List<Tariff> TARIFF_LIST = new ArrayList<>(Arrays.asList(new Success(15.0, 43567, 500, 2000),
            new ForeignBusiness(28.50, 15687, 600, 2500, 300),
            new ForeignBusinessPlus(35.0, 9874, 700, 3000, 450, 30)));
}
