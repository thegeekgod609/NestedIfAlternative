public class Main {
    public static void main(String[] args) {

        //Traditional Approach
        int threshold1 = 100;
        int input1 = 50;
        Double threshold2 = 10.0;
        Double input2 = 50.0;
        Double totalInput2 = 100.0;
        Float threshold3 = 2F;
        Float input3 = 1.5F;

        Integer ruleApplied;

        if(input1 > threshold1){
            System.out.println("Threshold 1 value "+ threshold1 +" was violated");
            ruleApplied = 1;
        }else if(input2*100/totalInput2 > threshold2){
            System.out.println("Threshold 2 value "+ threshold2 +" was violated");
            ruleApplied = 2;
        } else if (input3>threshold3) {
            System.out.println("Threshold 3 value "+ threshold3 +" was violated");
            ruleApplied = 3;
        }else{
            System.out.println("Default");
            ruleApplied = 0;
        }

        System.out.println("Rule Applied : "+ruleApplied);

       //Functional Program Approach
        Params params = new Params(threshold1,input1,threshold2,input2,totalInput2,threshold3,input3);
        ruleApplied = (Integer) RuleEngine.getRule(params).apply(params);
        System.out.println("Rule Applied : "+ruleApplied);
    }
}