import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) throws Exception {

        Socket s = new Socket("localhost", 5000);

        PrintWriter out =
            new PrintWriter(s.getOutputStream(), true);

        out.println("Hello Server");

        s.close();
    }
}