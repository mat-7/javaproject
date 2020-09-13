import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (sc.hasNext()){
        for (int i = 0; i < T; i++){
             int n = sc.nextInt();
             int m = sc.nextInt();
             int k = sc.nextInt();
             int[][] arr = new int[m][3];
             for (int j = 0; j < m; j++){
                 arr[j][0] = sc.nextInt();
                 arr[j][1] = sc.nextInt();
                 arr[j][2] = sc.nextInt();
             }
             if (bfs(arr, n, m, k)) System.out.println("Yes");
             else System.out.println("No");
        }
        }
    }

    public static boolean bfs(int[][] arr, int n, int m, int k){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < m; i++){
            if (arr[i][2] <= k){
                set.add(arr[i][0]);
                set.add(arr[i][1]);
            }
        }

        return set.size() == n;
    }
}
