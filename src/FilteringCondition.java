import java.util.function.Predicate;

/**
 * Purpose of this class to define all the conditions used inside if clause
 */
public class FilteringCondition {

    public static final Predicate<Params> THRESHOLD1 = params -> params.input1 > params.getThreshold1();
    public static final Predicate<Params> THRESHOLD2 = params ->
            params.input2 * 100 / params.getTotalInput2() > params.getThreshold3();
    public static final Predicate<Params> THRESHOLD3 = params -> params.input3 > params.getThreshold3();
}
