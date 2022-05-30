import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static char[][] map;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static boolean[][] visited;
    static int crush;
    static int result;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        map = new char[12][6];

        for (int i = 0; i < 12; i++) {
            String str = br.readLine();
            for (int j = 0; j < 6; j++) {
                map[i][j] = str.charAt(j);
            }
        }

        while(true){
            visited = new boolean[12][6];
            crush = 0;
            for (int i = 11; i >= 0; i--) {
                for (int j = 5; j >= 0; j--) {
                    if (map[i][j] != '.' && !visited[i][j]) {
                        bfs(new Dot(i, j));
                    }
                }
            }

            if(crush == 0) break;
            else result++;

            down();
        }

        System.out.println(result);
    }

    private static void down() {
        for (int i = 11; i >= 0; i--) {
            for (int j = 5; j >= 0; j--) {
                if(map[i][j] != '.'){
                    goDown(i, j);
                }
            }
        }
    }

    private static void goDown(int a, int b) {
        int t = -1;

        for (int i = 11; i > a; i--) {
            if (map[i][b] == '.') {
                t = i;
                break;
            }
        }

        if (t != -1) {
            char tmp = map[a][b];
            map[a][b] = map[t][b];
            map[t][b] = tmp;
        }
    }

    private static void bfs(Dot dot) {
        visited[dot.x][dot.y] = true;
        char ch = map[dot.x][dot.y];
        Queue<Dot> queue = new LinkedList<>();
        ArrayList<Dot> list = new ArrayList<>();
        queue.add(dot);
        int count = 0;

        while (!queue.isEmpty()) {
            Dot qDot = queue.poll();
            list.add(qDot);
            count++;

            for (int i = 0; i < 4; i++) {
                int x1 = qDot.x + dx[i];
                int y1 = qDot.y + dy[i];

                if(isBoundary(x1, y1, ch)){
                    visited[x1][y1] = true;
                    queue.add(new Dot(x1, y1));
                }
            }
        }

        if(count >= 4){
            crush++;
            for (int i = 0; i < list.size(); i++) {
                Dot tmp = list.get(i);
                map[tmp.x][tmp.y] = '.';
            }
        }
    }

    private static boolean isBoundary(int x1, int y1, char ch) {
        if(x1>=0 && x1<12 && y1<6 && y1 >=0 && map[x1][y1] == ch && !visited[x1][y1])
            return true;
        else return false;
    }
}

class Dot{
    int x;
    int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
