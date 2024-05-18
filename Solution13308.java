package ssafy;
import java.util.*;

public class BlackComabt {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++) {
            long n = sc.nextLong();
            int[] days = new int[7];
            for(int i = 0; i < 7; i++) {
                days[i] = sc.nextInt();
            }

            int min = Integer.MAX_VALUE;

            for(int start = 0; start < 7; start++) {
                if(days[start] == 0) continue; // 시작일에 수업이 없는 경우 스킵
                int count = 0, daysPassed = 0;
                while(count < n) {
                    if(days[(start + daysPassed) % 7] == 1) count++;
                    daysPassed++;
                }
                min = Math.min(min, daysPassed);
            }
            System.out.println("#" + test_case + " " + min);
        }
        sc.close();
    }
}
