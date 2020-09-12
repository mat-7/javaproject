import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            char[] chars = s.toCharArray();
            int count = 0;
            for (int i = 0; i < s.length(); i++){
                count += help(chars, i-1, i);
                count += help(chars, i-1, i+1);
            }
            System.out.println(count);
        }
    }

    public static int help(char[] chars, int l, int r){
        int res = 0;
        while(l >= 0 && r < chars.length && chars[l--] == chars[r++])
            res++;
        return res;
    }
}
