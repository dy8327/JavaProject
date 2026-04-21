package Java_Generic_0421;

import java.util.HashMap;
import java.util.Map.*;
import java.util.Set;


public class Code249 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("david","qwer"); //put - 값 저장
        map.put("cindy","asdf");
        map.put("alice", "zxcv");
        map.put("paul", "uiop");
        map.put("mary", "hjkl");
        Set<String> keySet  = map.keySet();
        System.out.println(keySet);
        System.out.println("--------------------");

        for(Entry<String, String> e : map.entrySet()){
            String key = e.getKey();
            String value = e.getValue();
            System.out.println(key+" : "+value);
        }
        System.out.println("--------------------");
        String val = (String)map.get("alice");
        System.out.println("Value for key alice is: "+val);
    }    
}
