import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String subject = br.readLine();
            if (!map.containsKey(subject)) {
                map.put(subject, 1);
            }else {
                map.put(subject, map.get(subject) + 1);
            }
        }

        int max = 0;
        for (String key : map.keySet()) {
            if(max <= map.get(key)){
                max = map.get(key);
            }
        }

        for (String key : map.keySet()) {
            if(map.get(key) == max){
                list.add(key);
            }
        }

        Collections.sort(list);

        System.out.print(list.get(0));
    }
}