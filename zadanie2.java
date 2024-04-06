import java.util.Scanner;

public class zadanie2 {
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
                System.out.print("Podaj ocenę z przedmiotu " + (j + 1) + " dla ucznia " + (i + 1) + ": ");
                oceny[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < liczbaUczniow; i++) {
            double sumaOcen = 0;
            for (int j = 0; j < liczbaPrzedmiotow; j++) {
                sumaOcen += oceny[i][j];
            }
            double sredniaOcen = sumaOcen / liczbaPrzedmiotow;
            System.out.println("Oceny ucznia " + (i + 1) + ": ");
            for (int j = 0; j < liczbaPrzedmiotow; j++) {
                System.out.println("Przedmiot " + (j + 1) + ": " + oceny[i][j]);
            }
            System.out.println("Średnia ocena ucznia " + (i + 1) + ": " + sredniaOcen);
        }
        scanner.close();
    }
}