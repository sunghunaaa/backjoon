import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N; // N은 1이상 5000이하
        int Q; // Q은 1이상 5000이하
        int K; // K는 유사도
        Q = 3;


        Scanner sc = new Scanner(System.in);
        System.out.println("N 입력");
        N = sc.nextInt();
        System.out.println("Q 입력");
        Q = sc.nextInt();

        int[][] video = new int[N][N];

        for(int i=1; i < N ; i++){
            System.out.println("pi, qi, ri 입력");
            int pi, qi, ri ;
            pi = sc.nextInt()-1;
            qi = sc.nextInt()-1;
            ri = sc.nextInt();
            video[pi][qi] = ri;
            video[qi][pi] = ri;
        }

        int[] qusa = new int[Q];

        for(int j=0; j < Q ; j ++){
            System.out.println("K 값 입력");
            qusa[j] = sc.nextInt();

        }

        System.out.println(video[0][0]);

    }
}