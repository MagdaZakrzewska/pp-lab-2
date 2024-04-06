import java.util.Arrays;
import java.util.Scanner;

public class zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę uczniów: ");
        int liczbaUczniow = scanner.nextInt();

        System.out.print("Podaj liczbę przedmiotów: ");
        int liczbaPrzedmiotow = scanner.nextInt();

        double[][] oceny = new double[liczbaUczniow][liczbaPrzedmiotow];

        
        for (int i = 0; i < liczbaUczniow; i++) {
            System.out.println("Uczeń " + (i + 1) + ":");
            for (int j = 0; j < liczbaPrzedmiotow; j++) {
                double ocena;
                do {
                    System.out.print("Podaj ocenę z przedmiotu " + (j + 1) + " dla ucznia " + (i + 1) + ": ");
                    ocena = scanner.nextDouble();
                    if (ocena < 1 || ocena > 5) {
                        System.out.println("Ocena musi być z przedziału od 1 do 5.");
                    }
                } while (ocena < 1 || ocena > 5);
                oceny[i][j] = ocena;
            }
        }

        
        for (int i = 0; i < liczbaUczniow; i++) {
            System.out.println("\nOceny ucznia " + (i + 1) + ": ");
            double sumaOcen = 0;
            for (int j = 0; j < liczbaPrzedmiotow; j++) {
                System.out.println("Przedmiot " + (j + 1) + ": " + oceny[i][j]);
                sumaOcen += oceny[i][j];
            }
            System.out.println("Suma ocen: " + sumaOcen);
            double sredniaOcen = sumaOcen / liczbaPrzedmiotow;
            System.out.println("Średnia ocena ucznia " + (i + 1) + ": " + sredniaOcen);
            

            double[] ocenyUcznia = oceny[i];
            Arrays.sort(ocenyUcznia);
            double mediana;
            if (liczbaPrzedmiotow % 2 == 0) {
                mediana = (ocenyUcznia[liczbaPrzedmiotow / 2 - 1] + ocenyUcznia[liczbaPrzedmiotow / 2]) / 2.0;
            } else {
                mediana = ocenyUcznia[liczbaPrzedmiotow / 2];
            }
            System.out.println("Mediana ocen ucznia " + (i + 1) + ": " + mediana);
        }
        scanner.close();
    }
}