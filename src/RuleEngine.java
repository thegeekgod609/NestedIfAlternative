import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Purpose of this class is to tie up the rules with the processing logic
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RuleEngine {

    // Use LinkedHashMap as it maintains the insertion order of the rules
    private static Map<Predicate, Function> ruleMatrix = new LinkedHashMap<>();

    static{
        ruleMatrix.put(FilteringCondition.THRESHOLD1,ProcessingLogic.PROCESSING_LOGIC_THRSHOLD_1);
        ruleMatrix.put(FilteringCondition.THRESHOLD2,ProcessingLogic.PROCESSING_LOGIC_THRSHOLD_2);
        ruleMatrix.put(FilteringCondition.THRESHOLD3,ProcessingLogic.PROCESSING_LOGIC_THRSHOLD_3);
    }

    public static Function getRule(Params params){
        return ruleMatrix.entrySet().stream()
                .filter(entry -> entry.getKey().test(params))
                .map(entry->entry.getValue())
                .findFirst()
                .orElse(ProcessingLogic.DEFAULT);
    }

}
