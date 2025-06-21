package exercise;

//    សរសេរ method ដើម្បីពិនិត្យថា String Valid ឬទេ។
//    ឧទាហរណ៍ "()[{}]" Valid
//    ចំណែកឯ "([]()", ")()[]{}", "([)]", and "[{})" មិន valid ទេ

public class StringChecker {
    private static final String[] LIST_VALID_PATTERN = {"(",")","[","{","}","]"};

    private static boolean isValid(String value){
        if(value.length() != LIST_VALID_PATTERN.length){
            return false;
        }
        String[] arrValue = value.split("");
        for(int i =0; i < LIST_VALID_PATTERN.length ; i++){
            if(LIST_VALID_PATTERN[i] != arrValue[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String value1 = "()[{}]";
        String value2 = "([]()";
        String value3 = ")()[]{}";
        String value4 = "[{})";
        String value5 = "[{})";

        System.out.println("Value 1: "+ isValid(value1));
        System.out.println("Value 2: "+ isValid(value2));
        System.out.println("Value 3: "+ isValid(value3));
        System.out.println("Value 4: "+ isValid(value4));
        System.out.println("Value 5: "+ isValid(value5));
    }

}
