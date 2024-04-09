package subiectul2;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Cerinta 1 ===");
        Student student = new Student("Ionut", "Java", 10);
        System.out.println(student);

        List<Student> listaStudenti = new ArrayList<>();
        File file = new File("subiecte-test/studenti.txt");

        Map<String, Integer> raportNote = new HashMap<>();

        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNextLine()) {
                String[] linieSplit = scanner.nextLine().split(",");

                String nume = linieSplit[0];
                String materie = linieSplit[1];
                int nota = Integer.parseInt(linieSplit[2]);

                Student studentCitit = new Student(nume, materie, nota);

                listaStudenti.add(studentCitit);

                if (raportNote.containsKey(materie)) {
                    raportNote.put(materie, raportNote.get(materie) + 1);
                } else {
                    raportNote.put(materie, 1);
                }

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("=== Cerinta 2 ===");
        System.out.println(listaStudenti.size());

        System.out.println("=== Cerinta 3 ===");
        listaStudenti.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getNota() == o2.getNota()) {
                    return 0;
                }

                if (o1.getNota() < o2.getNota()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        Scanner scannerTastatura = new Scanner(System.in);

        String materieCitita = scannerTastatura.nextLine();

        for (Student s : listaStudenti) {
            if (s.getMaterie().equals(materieCitita)) {
                System.out.println(s);
            }
        }

        try (
                FileOutputStream fileOutputStream = new FileOutputStream("subiecte-test/raportStudenti.txt");
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fileOutputStream))
            ) {
            writer.write("Raport discipline si numar de note:\n");

            for (String materie : raportNote.keySet()) {
                writer.write(String.format("%s: %d\n", materie, raportNote.get(materie)));
            }

            //writer.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(raportNote);

    }
}
