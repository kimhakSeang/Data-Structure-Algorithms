package exercise1;

public class StackStorageApp {


    //ចូរ Design class មួយដែលមាន operation push, pop, top និង getMin ដែលមានល្បឿនលឿនបំផុត O(1)។
    //        +push  ប្រើពេលO(1)  ដាក់ធាតុថ្មីនៅខាងលើបំផុតនៃ stack
    //+pop ប្រើពេលO(1) ដកធាតុខាងលើបំផុតចេញ
    //+top ប្រើពេលO(1) read ធាតុខាងលើបំផុតចេញ
    //+getMin ប្រើពេលO(1) read ធាតុដែលតូចបំផុតដោយមិនបាច់ search
    public static void main(String[] args) {
        StackStorage<Integer> storage = new StackStorage<>();
        System.out.println("************* ITEMS *************");
        storage.push(10);
        storage.push(20);
        storage.push(30);
        storage.push(40);
        storage.print();
        System.out.println("************* POP *************");
        storage.pop();
        storage.print();
        System.out.println("************* TOP *************");
        Integer top = storage.top();
        System.out.println(top);
        System.out.println("************* FIND MIN VALUE *************");
        Integer minvalue = storage.getMin();
        System.out.println(minvalue);

    }
}
