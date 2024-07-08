package AssignmentJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlagiarismChecker {
    public static void main(String[] args) throws IOException {
        // Take user input for two file paths
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter path of first file: ");
        String file1 = reader.readLine();
        System.out.print("Enter path of second file: ");
        String file2 = reader.readLine();

        // Create the command as an array of strings
        String[] command = {"diff", "-i", "-e", "-b", "-w", file1, file2};

        // Run the command and capture the output
        Process process = Runtime.getRuntime().exec(command);
        BufferedReader processReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        StringBuilder output = new StringBuilder();
        String line;
        while ((line = processReader.readLine()) != null) {
            output.append(line);
            output.append(System.lineSeparator());
        }

        // Count the number of lines in the output
        int numLines = output.toString().split(System.lineSeparator()).length;

        // Print the number of differing lines between the two files
        System.out.println("Number of differing lines between the two files: " + numLines);
    }
}

