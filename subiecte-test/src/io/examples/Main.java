package io.examples;

import java.io.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (var fisier = new BufferedReader(new FileReader("subiecte-test/parcare.txt"))){

            List<String> list = fisier.lines().toList();
            System.out.println(list);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ;
    }
}
