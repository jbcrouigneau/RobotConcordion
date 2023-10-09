package robot;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

import java.util.Random;

@RunWith(ConcordionRunner.class)
public class EnergieFixture {
    private Battery cells = new Battery();

    public String chargeAfterLanding() {
        return String.valueOf(cells.getChargeLevel());
    }

    public String chargeRecovered(String delai) {
        Float initialCharge = cells.getChargeLevel();
        try {
            cells.recharger(Long.parseLong(delai));
        } catch (InterruptedException e) {
            return e.getMessage();
        }
        return String.valueOf(cells.getChargeLevel() - initialCharge);
    }
}
