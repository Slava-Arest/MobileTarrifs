package repository;

import mobileTarrifs.Tariff;
import mobileTarrifs.ForeignBusiness;
import mobileTarrifs.ForeignBusinessPlus;
import mobileTarrifs.Success;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Repository class which contains list of tariffs.
 * @author - Viachaslau Arestau
 * @version - 1.0
 */

public interface TariffRepo {
    List<Tariff> TARIFF_LIST = new ArrayList<>(Arrays.asList(new Success(15.0, 43567, 500, 2000),
            new ForeignBusiness(28.50, 15687, 600, 2500, 300),
            new ForeignBusinessPlus(35.0, 9874, 700, 3000, 450, 30)));
}
