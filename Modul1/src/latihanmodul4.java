import java.util.HashMap;
import java.util.Scanner;

public class latihanmodul4 {
    String nama, kelas, matkulPraktikum;
    int nim;
    //class hashmap
    public latihanmodul4(String nm, String kl, String mat, int ni){
        nama = nm;
        kelas = kl;
        matkulPraktikum = mat;
        nim = ni;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, latihanmodul4> mhs = new HashMap<>(); //objek hashmap
        String input;
        latihanmodul4 data;

        mhs.put("1", new latihanmodul4("Asep", " 4B", "Sukdat A", 060));
        mhs.put("2", new latihanmodul4("Yanto", " 4B", "Sukdat A", 070));

        System.out.println("Masukkan ID : ");
        input = in.nextLine();
        data = mhs.get(input);
        if(data != null){
            System.out.println("Data Mahasiswa : " + data.nama + ", Kelas" + data.kelas + ", Mata Kuliah Praktikum : " + data.matkulPraktikum + ", nim : " + data.nim);
        }
    }
}