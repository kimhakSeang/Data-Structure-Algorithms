package practice;

public class HashTableCustomize {

    private Entity[] table;
    private int capacity = 10;
    private int size = 0;

    HashTableCustomize(){
        table = new Entity[capacity];
    }

    void insert(String key,String value){
        if(capacity == size){
            throw new RuntimeException("Reach capacity!");
        }
        

    };

    String get(String key){


        return "";
    }

    String remove(String key){

        return "";
    };

    boolean contains(String key){

        return true;
    };



















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
    }
}
