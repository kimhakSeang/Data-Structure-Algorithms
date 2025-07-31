package exercise1;

//    សរសេរ method ដើម្បីពិនិត្យថា String Valid ឬទេ។
//    ឧទាហរណ៍ "()[{}]" Valid
//    ចំណែកឯ "([]()", ")()[]{}", "([)]", and "[{})" មិន valid ទេ

import java.util.*;

public class StringChecker {
    private static final Map<String, String[]> VALID_PATTERN = Map.of(
        "parentheses", new String[]{"(", ")"},
        "brackets", new String[]{"[", "]"},
        "braces", new String[]{"{", "}"}
    );

    private static boolean isValidPatternV2(String value){
        if(value.length() == 0 || value.length()%2 != 0){
            return false;
        }

        String[] arrValue = value.split("");
        for (int i = 0; i<arrValue.length; i++){
            int count = 1;

            // CASE: ()
            if( arrValue[i].equals(VALID_PATTERN.get("parentheses")[0])){
                for (int j = i+1; j<arrValue.length; j++){
                    count += 1;
                    if(arrValue[j].equals(VALID_PATTERN.get("parentheses")[1])){
                        arrValue[i] = "";
                        arrValue[j] = "";
                        if(count%2!=0) return false;
                        break;
                    }
                }
            }
            // CASE: []
            else if (arrValue[i].equals(VALID_PATTERN.get("brackets")[0])){
                for (int j = i+1; j<arrValue.length; j++){
                    count += 1;
                    if(arrValue[j].equals(VALID_PATTERN.get("brackets")[1])){
                        arrValue[i] = "";
                        arrValue[j] = "";
                        if(count%2!=0) return false;
                        break;
                    }
                }
            }
            // CASE: {}
            else if (arrValue[i].equals(VALID_PATTERN.get("braces")[0])){
                for (int j = i+1; j<arrValue.length; j++){
                    count += 1;
                    if(arrValue[j].equals(VALID_PATTERN.get("braces")[1])){
                        arrValue[i] = "";
                        arrValue[j] = "";
                        if(count%2!=0) return false;
                        break;
                    }
                }
            }
        }

        for (int i = 0; i<arrValue.length; i++){
            if(!arrValue[i].equals("")) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        String value1 = "()[{}]";
        String value2 = "([]()";
        String value3 = ")()[]{}";
        String value4 = "[{})";
        String value5 = "()([{])";
        String value6 = "(())({})[";
        String value7 = "({)})[]";

        System.out.println(value1 + " : "+ isValidPatternV2(value1));
        System.out.println(value2 + " : "+ isValidPatternV2(value2));
        System.out.println(value3 + " : "+ isValidPatternV2(value3));
        System.out.println(value4 + " : "+ isValidPatternV2(value4));
        System.out.println(value5 + " : "+ isValidPatternV2(value5));
        System.out.println(value6 + " : "+ isValidPatternV2(value6));
        System.out.println(value7 + " : "+ isValidPatternV2(value7));
    }

}
