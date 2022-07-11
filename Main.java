// 방법1
// public class Main {
//     public static void main(String[] args) {
//         System.out.print("Hello World!");
//     }
// }



// 방법2
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("Hello World!");
        bw.flush();
        bw.close();
    }
}



// 방법3
// public class Main {
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder();
//         sb.append("Hello World!");

//         System.out.println(sb);
//     }
// }


// 방법4
// public class Main {
//     public static void main(String[] args){

//         StringBuffer sb = new StringBuffer();
//         sb.append("Hello World!");

//         System.out.println(sb);
//     }
// }