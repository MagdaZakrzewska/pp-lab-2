import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args){
        System.out.println("Podaj liczbę przedmiotów, z których chcesz obliczyć średnią arytmetyczną: ");
        Scanner wczytaj = new Scanner(System.in);
        int numberOfSubjects = wczytaj.nextInt();
        int[] oceny = new int[numberOfSubjects];
        for(int i = 0; i < oceny.length; i++){
            System.out.println("Podaj ocenę: ");
            oceny[i] = wczytaj.nextInt();
        }
        int suma = 0;
        for (int j = 0; j < oceny.length; j++){
            suma = suma + oceny[j];
        }
        float avg = suma/numberOfSubjects;
        System.out.println("Średnia arytmetyczna: " + avg);
        wczytaj.close();
    }
}