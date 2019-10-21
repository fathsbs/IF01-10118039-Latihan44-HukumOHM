/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program ini berisi program untuk menghitung tegangan  
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Baterai baterai = new Baterai();
        Baterai baterai1 = new Baterai(3, 12);
        System.out.println();
        System.out.printf("Kuat arus\t: %.1f ampere%n", baterai1.getKuatArus());
        System.out.printf("Hambatan\t: %.1f ohm%n", baterai1.getHambatan());
        System.out.printf("Hasil Tegangan\t: %.1f volt%n", baterai1.hitungTegangan());
    }

}
