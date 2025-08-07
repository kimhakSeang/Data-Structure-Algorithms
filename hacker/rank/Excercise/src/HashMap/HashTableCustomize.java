package HashMap;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashTableCustomize {

    private Entity[] table;
    private int CAPACITY = 3;
    private int SIZE = 0;

    private final Entity DELETED = new Entity("DELETED", null);

    HashTableCustomize(){
        table = new Entity[CAPACITY];
    }

    void insert(String key,String value){
        if(CAPACITY * 0.7  < SIZE){
            resizeCapacity();
        }
        Entity newItem = new Entity(key, value);

        int index = hashCode(key);
        while ( ! (table[index] == null ) && !(table[index].key == "DELETED")){
            index = (index+1) % CAPACITY;
        }
        table[index]= newItem;
        SIZE += 1;
    }

    void insert(Entity newItem){
        if(CAPACITY * 0.7  < SIZE){
            resizeCapacity();
        }
        if (newItem == null){
            return;
        }

        int index = hashCode(newItem.key);
        while ( ! (table[index] == null ) && !(table[index].key == "DELETED")){
            index = (index+1) % CAPACITY;
        }
        table[index]= newItem;
        SIZE += 1;
    };

    Entity get(String key){
        int index = hashCode(key);

        if(table[index] == null) return null;

        while ( table[index] != null){
            if(table[index].key.equals(key)){
                return table[index];
            } else if (table[index].key.equals("DELETED")){
                return DELETED;
            }
            index = (index +1) % CAPACITY;
        }
        return null;
    }

    void remove(String key){
        int index = hashCode(key);

        if(table[index] == null || table[index] == DELETED) {
            throw new RuntimeException(key + "is not found or deleted");
        };

        while ( table[index] != null){
            if(table[index].key.equals(key)){
                table[index] = DELETED;
                return;
            } else if (table[index].key.equals("DELETED")){
                throw new RuntimeException(key + " is not found or deleted");
            }
            index = (index +1) % CAPACITY;
        }
        throw new RuntimeException(key + " is not found or deleted");
    };

    private int hashCode(String key){
        return Math.abs(key.hashCode()) % CAPACITY;
    }

    private void resizeCapacity(){
        CAPACITY *= 10;
        Entity[] newList = new Entity[CAPACITY];

        Entity[] temp = table;
        table = newList;
        for (Entity table : temp){
            insert(table);
        }
    }

    private List<Entity> getList(){
         Set<Entity> setList = new HashSet<>();
         for(Entity tb : table){
             if (tb == null || tb == DELETED) continue;
             setList.add(tb);
         }
         return setList.stream().toList();
    }


    public static void main(String[] args) {
        HashTableCustomize tableCustomize = new HashTableCustomize();
        tableCustomize.insert("username", "dara");
        tableCustomize.insert("age", "25");
        tableCustomize.insert("gender", "M");
        tableCustomize.insert("job", "Lawyer");

//        System.out.println(tableCustomize.get("username"));
//        System.out.println(tableCustomize.get("age"));
//        System.out.println(tableCustomize.get("gender"));
//        System.out.println(tableCustomize.get("job"));
//        System.out.println(tableCustomize.get("hobbies"));

//        tableCustomize.remove("username");
//        System.out.println(tableCustomize.get("username"));

        for (Entity table : tableCustomize.getList()){
            System.out.println(table);
        }

    }



















    public static class Entity{
        String key;
        String value;

        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }


        public void setValue(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return key + " : " + value;
        }
    }
}
