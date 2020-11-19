import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class NumberSorter {

    public static Collection<BigDecimal> filter(Collection<BigDecimal> numbers) throws MyException {
        BigDecimal division = Collections.max(numbers).divide(Collections.min(numbers));
        Collection<BigDecimal> resultCollection = new ArrayList<BigDecimal>();
        try {
            for (BigDecimal number : numbers) {
                if (number.compareTo(division) > 0) {
                    resultCollection.add(number);
                }
            }
        } catch (Exception e) {
            System.err.println(e + "error in method filter");
        }
        return resultCollection;
    }
}
