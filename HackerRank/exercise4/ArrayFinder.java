package exercise4;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayFinder {
//    លំហាត់ទី៤ ពីក្រុមហ៊ុន Google។
//    គេអោយ Array នៃ Integer ដែលមិនទទេរ។ ចូរទាញយកធាតុដែលមានចំនួនច្រើនជាងគេ k ធាតុ។
//    ឧទាហរណ៍៖  [3,2,3,1,1,6,4,5,3]
//    k=2 =>  Output : [3,1]

    private static Integer[] findKMultiValue(Integer[] items, int k){

        // Group Item
        Map<Integer, Integer> collect = new HashMap<>();
        for (Integer item : items){
            if(collect.isEmpty() || collect.get(item) == null){
                collect.put(item, 1);
            }else {
                collect.put(item, collect.get(item)+1);
            }
        }

        // Sort by Item count
        for (int i = 0; i < items.length; i++){
            for (int j = i+1; j < items.length; j++){
                if(items[i] == items[j]) continue;
                if( collect.get(items[i]) < collect.get(items[j]) ){
                    int temp = items[i];
                    items[i] = items[j];
                    items[j] = temp;
                }
            }
        }

        // Find multi value of k items
        Set<Integer> kItem = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < items.length; i++){
            if(result.size() == k) break;
            if(!kItem.contains(items[i])){
                result.add(items[i]);
                kItem.add(items[i]);
            }
        }
        return result.toArray(Integer[]::new);
    }

    private static Integer[] findKMultiValueV2(Integer[] items, int k){

        // Group Item
        Map<Integer, Integer> collect = new HashMap<>();
        for (Integer item : items){
            if(collect.isEmpty() || collect.get(item) == null){
                collect.put(item, 1);
            }else {
                collect.put(item, collect.get(item)+1);
            }
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                (a, b) -> b.getValue() - a.getValue()
        );
        pq.addAll(collect.entrySet());

        // Step 3: Extract top k elements
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(pq.poll().getKey());
        }
        return result.toArray(Integer[]::new);
    }

    private static Integer[] findKMultiValueStream(Integer[] items, int k){

        // Group Item
        Map<Integer, List<Integer>> collect = Stream.of(items)
                .collect(Collectors.groupingBy(Integer::intValue));

        // Sort by Item count
        // Find the multi value of k items
        return Arrays.stream(items)
                        .collect(Collectors.toSet())
                        .stream()
                        .sorted((a, b) -> collect.get(b).size() - collect.get(a).size())
                        .limit(k)
                        .toArray(Integer[]::new);
    }




    public static void main(String[] args) {
        Integer[] items = new Integer[9]; // [3,2,3,1,1,6,4,5,3]
        items[0] = 3;
        items[1] = 2;
        items[2] = 3;
        items[3] = 1;
        items[4] = 1;
        items[5] = 6;
        items[6] = 4;
        items[7] = 5;
        items[8] = 3;

        System.out.println("Item : "+ Arrays.toString(items));
        System.out.println("Result :"+ Arrays.toString(findKMultiValue(items, 2)));
        System.out.println("Result V2:"+ Arrays.toString(findKMultiValueV2(items, 2)));
        System.out.println("Result V2:"+ topKFrequent(items, 2));
        System.out.println("Result Stream :"+ Arrays.toString(findKMultiValueStream(items, 2)));
    }

    public static List<Integer> topKFrequent(Integer[] nums, int k) {
        // Step 1: Count frequency
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Use PriorityQueue (Max Heap by frequency)
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                (a, b) -> b.getValue() - a.getValue()
        );
        pq.addAll(freqMap.entrySet());

        // Step 3: Extract top k elements
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(pq.poll().getKey());
        }
        return result;
    }





}
