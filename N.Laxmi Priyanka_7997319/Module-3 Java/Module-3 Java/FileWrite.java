import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
public class FileWrite {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Path path = Paths.get("output.txt");
        String content = sc.nextLine();
        Files.write(path, content.getBytes(StandardCharsets.UTF_8));
    }
}
