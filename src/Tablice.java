import java.util.Random;

public class Tablice {
    public static void main(String[] args) {
        int[] tablica = new int[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            tablica[i] = rand.nextInt(10);
        }
        int[] tablica2 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9,};
      //  int suma = 0;
        int a=9;
        for (int i = 0; i < 21; i++) {
if (i<10){
            System.out.print(tablica[i]+"   ");


        } else if (i>10) {

    System.out.print(tablica[a]+ " ");
    a-=1;

            }
    }
}}

