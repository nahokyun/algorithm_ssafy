import java.util.Scanner;

public class boj_17103 {
    public static boolean[] dp;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int test=sc.nextInt();
        dp=new boolean[1000001];

        for(int i=2;i*i<=1000000;i++){
            if(!dp[i]){
                for(int j=i*i;j<=1000000;j+=i){
                    dp[j]=true;
                }
            }
        }

        for(int t=0;t<test;t++){
            int input=sc.nextInt();
            int answer=0;
            for(int i=2;i<=input/2;i++){
                if(!dp[i]&&!dp[input-i]){
                    answer++;
                }
            }
            System.out.println(answer);
        }
    }
}
