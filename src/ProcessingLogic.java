import java.util.function.Function;

/**
 * Purpose of this class, is to transfer the logic executed inside the if Block into FUNCTION
 * And apply that logic on demand when if clause (defined in FilteringCondition) is true
 */
public class ProcessingLogic {

    public static final Function<Params, Integer> PROCESSING_LOGIC_THRSHOLD_1 = params -> {
        System.out.println("Threshold 1 value "+ params.threshold1 +" was violated");
        return  1;};
    public static final Function<Params, Integer> PROCESSING_LOGIC_THRSHOLD_2 = params -> {
        System.out.println("Threshold 2 value "+ params.threshold2 +" was violated");
        return  2;
    };
    public static final Function<Params, Integer> PROCESSING_LOGIC_THRSHOLD_3 = params -> {
        System.out.println("Threshold 3 value "+ params.threshold2 +" was violated");
        return  3;
    };
    public static final Function<Params, Integer> DEFAULT = params -> {
        System.out.println("Threshold 1 value"+ params.threshold2 +" was violated");
        return  0;
    };
}
