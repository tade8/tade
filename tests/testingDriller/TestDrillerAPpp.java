package testingDriller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class TestDrillerAPpp {
    @Test
            void toTestThatObjectExist() {
        TestDrillerApplication testDriller = new TestDrillerApplication();
        assertNotNull(testDriller);

    }

    @Test
    void toCalculateForThreeQuantityOfTestDriller(){
        TestDrillerApplication testDriller = new TestDrillerApplication();
        testDriller.calcAmount(3);
        assertEquals(6000 , testDriller.getAmount());
    }

}
