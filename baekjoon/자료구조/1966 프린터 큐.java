import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int size = Integer.parseInt(st.nextToken());
            int select = Integer.parseInt(st.nextToken());
            Queue<Printer> queue = new LinkedList<Printer>();
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < size; j++) {
                int prio = Integer.parseInt(st.nextToken());
                queue.add(new Printer(prio, j));
            }

            int result = 1;
            while(!queue.isEmpty()){
                Printer printer = queue.poll();
                boolean check = true;

                Iterator it = queue.iterator();
                while (it.hasNext()) {
                    Printer val = (Printer)it.next();
                    if(printer.prio < val.prio){
                        check = false;
                        break;
                    }
                }
                if(!check){
                    queue.add(printer);
                }else {
                    if(printer.num == select){
                        System.out.println(result);
                    }else{
                        result++;
                    }
                }
            }
        }
    }
}

class Printer{
    int prio;
    int num;

    public Printer(int prio, int num) {
        this.prio = prio;
        this.num = num;
    }
}