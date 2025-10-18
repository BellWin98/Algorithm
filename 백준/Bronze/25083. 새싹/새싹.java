import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = "         ,r'\"7\n" + 	// \", \n 이 제어문자다.
                "r`-_   ,'  ,/\n" + 		// \n 이 제어문자다.
                " \\. \". L_r'\n" + 		// \\, \", \n 이 제어문자다.
                "   `~\\/\n" + 			// \\, \n 이 제어문자다.
                "      |\n" + 			// \n 이 제어문자다.
                "      |";
        bw.write(s);
        bw.flush();
        bw.close();
    }
}