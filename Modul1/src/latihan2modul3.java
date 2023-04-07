import java.util.LinkedList;
import java.util.Queue;

public class latihan2modul3 {
    public void queueExample(){
        Queue queue = new LinkedList();//
        queue.add("Java");//Menambahkan elemen
        queue.add("Dotnet");
        queue.offer("PHP");//memasukkan elemen ke dalam elemen
        queue.offer("HTML");
        System.out.println("remove : " + queue.remove());//Menghapus dan mengembalikan kepala antriam
        System.out.println("element : " + queue.element());
        System.out.println("poll : " + queue.poll());//Mengembalikan null jika antrian kosong
        System.out.println("peek : " + queue.peek());//Melihat kepala antrian
    }

    public static void main(String[] args) {
        new  latihan2modul3().queueExample();
    }
}