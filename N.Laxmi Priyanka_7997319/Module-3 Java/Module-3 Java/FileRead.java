import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
public class FileRead {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("output.txt");
        String content = Files.readString(path, StandardCharsets.UTF_8);
        System.out.println(content); 
    }
}
