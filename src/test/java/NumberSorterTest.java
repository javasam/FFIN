import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.*;

public class NumberSorterTest {

    @org.junit.Test
    public void filterTest() throws MyException {
        NumberSorter numberSorter = new NumberSorter();
        Collection<BigDecimal> incomeCollection = new ArrayList<BigDecimal>();
        Collection<BigDecimal> resultCollection = new ArrayList<BigDecimal>();
        incomeCollection.add(new BigDecimal(2));
        incomeCollection.add(new BigDecimal(3));
        incomeCollection.add(new BigDecimal(4));
        incomeCollection.add(new BigDecimal(5));
        incomeCollection.add(new BigDecimal(6));
        resultCollection = numberSorter.filter(incomeCollection);
        assertEquals(resultCollection.toString(), "[4, 5, 6]");
    }
}