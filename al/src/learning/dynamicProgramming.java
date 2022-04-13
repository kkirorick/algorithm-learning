package learning;

public class dynamicProgramming {
    public static void main(String[] args) throws Exception  {
        
        int finoNum = 10;

        long ans1 = fibo(finoNum); 
        // 재귀함수를 이용한 피보나치
        System.out.println(ans1);
        
        long ans2 = fibonacci(finoNum); 
        // 동적계획법을 이용한 피보나치
        System.out.println(ans2);

    }

    /**
     * 동적 계획법의 등장 배경은 피보나치 수열을 통해 알수 있다.
     * 피보나치 수열은 제2항까지는 1 , 제 3항부터는 바로 앞의 두 항을 더한 수로 정의
     * 제 0 항은 생략하기도함 
     * (0) , 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ... 
     */
    public static long fibo (int num) {
        if(num <= 2){
            return 1;
        } else {
            return fibo(num -1) + fibo(num-2);
        }
    }

    /**
     * 위 예시처럼 이미 했던 연산이 반복되는 결점을 보완하기 위해서
     * 동적 계획법 (Dynamic Programming, DP) 고안 
     * 처음 진행되는 연산은 기록해 두고 이미 진행했던 연산이라면 다시 연산하는것이 아닌 기록되어있는 값 가져옴
     */
    static long[] memo;
    public static long fibonacci(int n) {
        if (n <= 1)
            return n;
        else if (memo[n] != 0)
            return memo[n];
        else
            return memo[n] = fibonacci(n - 1) + fibonacci(n - 2);
 
    }
}