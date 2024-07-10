package org.example;

import java.io.*;

public class FileIOExample {
    public static void main(String[] args){
        try {
            // Write to a file
            FileWriter writer = new FileWriter("output.txt");
            writer.write("hello I am Bharadwaj!");
            writer.close();

            // Read from the file
            FileReader reader = new FileReader("output.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
