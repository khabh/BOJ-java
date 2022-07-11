// 풀이 1
// import java.util.Scanner;

// public class Main1000 {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int A = in.nextInt();
//         int B = in.nextInt();

//         System.out.println(A + B);
//         in.close();
//     }
// }

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main1000 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // String[] str = br.readLine().split(" ");
		// int a = Integer.parseInt(str[0]);
		// int b = Integer.parseInt(str[1]);

        System.out.println(a + b);

    }
}