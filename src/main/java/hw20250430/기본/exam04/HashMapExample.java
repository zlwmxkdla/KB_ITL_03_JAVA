package hw20250430.exam04;

import java.util.*;
import java.util.Map.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("이유정",90);
        map.put("홍길동",70);
        map.put("박강현",89);
        map.put("서경수",89);
        System.out.println("총 Entry 수:" + map.size());

        String key = "홍길동";
        int value = map.get(key);
        System.out.println(key+"= "+value);
        System.out.println();

        Set<String> keySet = map.keySet();
        Iterator<String > iterator = keySet.iterator();
        while(iterator.hasNext()){
            String k = iterator.next();
            Integer v = map.get(k);
            System.out.println(k+"= "+v);
        }

        Set<Entry<String,Integer>> entrySet = map.entrySet();
        Iterator<Entry<String,Integer>> entryiterator = entrySet.iterator();

        while (entryiterator.hasNext()) {
            Entry<String, Integer> entry = entryiterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + " : " + v);
        }
        System.out.println();
        map.remove("홍길동");
        System.out.println("총 Entry수: " + map.size());

        System.out.println();
    }
}
