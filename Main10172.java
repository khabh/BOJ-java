import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main10172 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("|\\_/|\n|q p|   /}\n( 0 )\"\"\"\\\n|\"^\"`    |\n||_/=\\\\__|");
        bw.flush();
        bw.close();
    }
}

