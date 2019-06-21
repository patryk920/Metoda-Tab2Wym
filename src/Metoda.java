/*Napisz metodę, która jako jedyny argument przyjmie zmienną typu int[][] i zwróci sumę wszystkich elementów tablicy.

 */
public class Metoda {

    private static int suma(int tab[][]) {

        int wynik = 0;
        for (int[] i : tab) {
            for (int z : i) {
                wynik += z;
            }
        }
        return wynik;
    }

    public static void main(String[] args) {
        int[][] tab = new int[][]{new int[]{1, 2, 3}, new int[]{4, 5, 6}};

        System.out.println(suma(tab));
    }

}



