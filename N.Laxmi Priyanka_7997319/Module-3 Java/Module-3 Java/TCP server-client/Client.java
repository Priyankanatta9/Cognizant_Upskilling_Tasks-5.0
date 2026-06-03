import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(
                    socket.getOutputStream(), true);

            BufferedReader keyboard = new BufferedReader(
                    new InputStreamReader(System.in));

            String message;

            while (true) {
                // Send message to server
                System.out.print("Client: ");
                message = keyboard.readLine();
                out.println(message);

                if (message.equalsIgnoreCase("exit")) {
                    break;
                }

                // Receive reply from server
                String reply = in.readLine();
                if (reply == null || reply.equalsIgnoreCase("exit")) {
                    break;
                }

                System.out.println("Server: " + reply);
            }

            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}