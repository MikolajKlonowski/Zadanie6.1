import java.util.Random;

public class Tablice {
    public static void main(String[] args) {
        int[] tablica = new int[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            tablica[i] = rand.nextInt(10);
        }
        int[] tablica2 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int suma = 0;

        for (int i = 0; i < 20; i++) {

            System.out.print(tablica[tablica2[i]] + ",");
        }
    }
}

