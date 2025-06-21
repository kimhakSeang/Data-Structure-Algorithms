package exercise;

public class TestStringChecker {
    private static final String[] LIST_VALID_PATTERN = {"A"};

    private static void isValid(String value){
        String[] arrValue = value.split("");
        for(int i =0; i < LIST_VALID_PATTERN.length ; i++){

            System.out.println("==========================");
            System.out.print(LIST_VALID_PATTERN[i]);
            System.out.print(" is equal to ");
            System.out.print(arrValue[i]);

            if(LIST_VALID_PATTERN[i] == arrValue[i]){
                System.out.println(" -> yes ");
            }else {
                System.out.println(" -> no ");
            }
        }
    }

    public static void main(String[] args) {
        isValid("A");
    }

}
