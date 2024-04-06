import java.util.Scanner;
public class zadanie1 {
    public static void main(String[] args){
        System.out.println("Podaj liczbę przedmiotów, z których chcesz obliczyć średnią arytmetyczną: ");
        Scanner wczytaj = new Scanner(System.in);
        
        int numberOfSubjects = wczytaj.nextInt();
        int[] oceny = new int[numberOfSubjects];
        
        float suma = 0;
        for(int i = 0; i < oceny.length; i++){
            System.out.println("Podaj ocenę: ");
            oceny[i] = wczytaj.nextInt();
            suma += oceny[i];
        }
        
        float avg = suma/numberOfSubjects;
        System.out.println("Średnia arytmetyczna: " + avg);
        wczytaj.close();
    }
}