package subiectul1;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        File fisier = new File("subiecte-test/parcare.txt");
        List<Vehicul> listaDeVehicule = new ArrayList<>();

        int numarTotalPasageri = 0;
        int numarTotalPasageriMasiniDeLux = 0;
        final float taxaPerVehicul = 11.0f;

        Map<String, Float> raportTaxe = new HashMap<>();

        try {
            Scanner scanner = new Scanner(fisier);

            while (scanner.hasNextLine()) {
                String[] linieSplit = scanner.nextLine().split(",");

                String nrInmatriculare = linieSplit[0];
                String marca = linieSplit[1];
                int nrPasageri = Integer.parseInt(linieSplit[2]);

                Vehicul vehicul = new Vehicul(nrInmatriculare, marca, nrPasageri);

                listaDeVehicule.add(vehicul);

                numarTotalPasageri += vehicul.getNrPasageri();

                if (vehicul.esteDeLux()) {
                    numarTotalPasageriMasiniDeLux += vehicul.getNrPasageri();
                }

                String judet = nrInmatriculare.split("-")[0];

                if (raportTaxe.containsKey(judet)) {
                    if (vehicul.esteDeLux()) {
                        raportTaxe.put(judet, raportTaxe.get(judet) + taxaPerVehicul * 1.20f);
                    }
                    else {
                        raportTaxe.put(judet, raportTaxe.get(judet) + taxaPerVehicul);
                    }
                }
                else {
                    if (vehicul.esteDeLux()) {
                        raportTaxe.put(judet, taxaPerVehicul * 1.20f);
                    }
                    else {
                        raportTaxe.put(judet, taxaPerVehicul);
                    }
                }

            }

            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            FileOutputStream fis = new FileOutputStream("subiecte-test/raportParcare.txt");
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fis));

            for (String judet : raportTaxe.keySet()) {
                writer.write(String.format("%s,%.2f\n", judet, raportTaxe.get(judet)));
            }

            writer.close();
            fis.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        System.out.println("== Cerința 1 ==");
        for (Vehicul vehicul : listaDeVehicule) {
            System.out.println(vehicul);
        }

        System.out.println("== Cerința 2 ==");
        System.out.println(listaDeVehicule.size() + " vehicule cu " + numarTotalPasageri + " pasageri");

        System.out.println("== Cerința 3 ==");
        System.out.println("Vehicule de lux: " + numarTotalPasageriMasiniDeLux + " pasageri");
        System.out.println("Alte vehicule: " + (numarTotalPasageri - numarTotalPasageriMasiniDeLux) + " pasageri");

        System.out.println("== Cerința 4 ==");
        System.out.println(raportTaxe);
    }
}