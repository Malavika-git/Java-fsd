import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteExample {

	
	    public static void main(String[] args) {
	        // Specify the file path
	        String filePath = "handling.txt";

	        // Write to the file
	        writeToFile(filePath, "Hello, World!");

	        // Read from the file
	        String content = readFromFile(filePath);
	        System.out.println("File Content: " + content);

	        // Append to the file
	        appendToFile(filePath, "\nAppending new content.");

	        // Read again to see the changes
	        content = readFromFile(filePath);
	        System.out.println("Updated File Content: " + content);
	    }

	    private static void writeToFile(String filePath, String content) {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
	            writer.write(content);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    private static String readFromFile(String filePath) {
	        StringBuilder content = new StringBuilder();
	        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                content.append(line).append("\n");
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return content.toString();
	    }

	    private static void appendToFile(String filePath, String contentToAppend) {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
	            writer.write(contentToAppend);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}
    	       
