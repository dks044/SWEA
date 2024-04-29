/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
// 표준 입력 예제
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int 변수 1개 입력받는 예제
// b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
// g = sc.nextByte();                          // char 변수 1개 입력받는 예제
// var = sc.next();                            // 문자열 1개 입력받는 예제
// AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
// 표준 출력 예제
// int a = 0;                            
// double b = 1.0;               
// char g = 'b';
// String var = "ABCDEFG";
// long AB = 12345678901234567L;
//System.out.println(a);                       // int 변수 1개 출력하는 예제
//System.out.println(b); 		       						 // double 변수 1개 출력하는 예제
//System.out.println(g);		       						 // char 변수 1개 출력하는 예제
//System.out.println(var);		       				   // 문자열 1개 출력하는 예제
//System.out.println(AB);		       				     // long 변수 1개 출력하는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Arrays;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	public static void main(String args[]) throws Exception
	{
		        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        int[] export = new int[T];
        sc.nextLine();
        
        for(int test_case = 1; test_case <= T; test_case++) {
            int pocketCount = sc.nextInt();
            int needPocketCount = sc.nextInt();
            sc.nextLine();
            int[] arr = new int[pocketCount];
            for(int i=0; i<arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int minDiff = Integer.MAX_VALUE;
            // 조건을 j <= arr.length - needPocketCount로 수정
            for(int i=0; i <= arr.length - needPocketCount; i++) {
                // i 인덱스부터 needPocketCount 개수만큼의 부분 배열에 대한 최대, 최소 값을 찾아 차이를 계산
                int max = arr[i + needPocketCount - 1]; // 현재 부분 배열의 최대값
                int min = arr[i]; // 현재 부분 배열의 최소값
                minDiff = Math.min(minDiff, (max - min));
            }
            export[test_case-1] = minDiff;
        }
        //출력
        for(int test_case = 1; test_case <= T; test_case++) {
            System.out.println("#"+test_case+" "+export[test_case-1]);
        }
	}
}
