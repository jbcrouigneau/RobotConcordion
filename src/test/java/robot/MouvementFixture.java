package robot;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@RunWith(ConcordionRunner.class)
public class MouvementFixture {
    private Robot wallE = new Robot(0 , new Battery(), new RoadBookCalculator());

}
