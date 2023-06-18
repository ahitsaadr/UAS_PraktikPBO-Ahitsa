// Child class Matkul (inheritance from Dosen)
class Matkul extends Dosen {
    private String model;

    public Matkul(String Matkul, int Id_Matkul, String model) {
        super(Matkul, Id_Matkul);
        this.model = model;
    }

    public String getId_Matkul() {
        return model;
    }

    @Override
    public void teach() {
        System.out.println("Mengajar " + getId_Matkul());
    }
}
//Pada kelas Matkul, kita mewarisi kelas Dosen menggunakan keyword extends. Di sini, kita menambahkan atribut model yang merupakan atribut khusus untuk Matkul. 
Pada konstruktor, kita memanggil konstruktor dari kelas Dosen menggunakan super(Matkul, Id_Matkul) untuk menginisialisasi atribut yang diwarisi dari kelas Dosen. 
Metode getId_Matkul() mengembalikan nilai model yang merupakan informasi unik untuk objek Matkul. Di dalam metode teach(), kita mencetak pesan yang menampilkan 
informasi mengenai mata kuliah yang diajar.//


// Child class Alamat (inheritance from Dosen)
class Alamat extends Dosen {
    private String Kota;

    public Alamat(String Matkul, int Id_Matkul, String Kota) {
        super(Matkul, Id_Matkul);
        this.Kota = Kota;
    }

    public String getKota() {
        return Kota;
    }

    @Override
    public void teach() {
        System.out.println("Bertempat di Kota " + getKota());
    }
}
//Di kelas Alamat, kita juga mewarisi kelas Dosen. Di sini, kita menambahkan atribut Kota yang merupakan atribut khusus untuk Alamat. 
Pada konstruktor, kita memanggil konstruktor dari kelas Dosen menggunakan super(Matkul, Id_Matkul) untuk menginisialisasi atribut yang 
diwarisi dari kelas Dosen. Metode getKota() mengembalikan nilai Kota yang merupakan informasi untuk objek Alamat. Di dalam metode 
teach(), kita mencetak pesan yang menampilkan informasi mengenai kota tempat mengajar.//

public class Main {
    public static void main(String[] args) {
        // Polymorphism
        Dosen dosen1 = new Matkul("Matkul", 4, "Praktik Pemrograman Berorientasi Objek");
        Dosen dosen2 = new Alamat("Alamat", 150, "Madiun");

        // Exception handling
        try {
            dosen1.teach();
            dosen2.teach();
        } catch (Exception e) {
            System.out.println("An error occurred during teach: " + e.getMessage());
        }

        // Getter and Setter
        System.out.println("Dosen 1: " + dosen1.getName() + ", Id_Matkul: " + ((Matkul) dosen1).getId_Matkul());
        System.out.println("Dosen 2: " + dosen2.getName() + ", Alamat: " + ((Alamat) dosen2).getKota());
    }
}
//Dalam metode main(), kita membuat objek dosen1 dan dosen2 dengan menggunakan polimorfisme. Objek dosen1 diinisialisasi sebagai objek Matkul 
dan objek dosen2 diinisialisasi sebagai objek Alamat. Polimorfisme memungkinkan kita untuk menggunakan objek anak (Matkul dan Alamat) dengan 
tipe referensi dari objek induk (Dosen).//

//Kemudian, kita menggunakan penanganan exception untuk menangkap dan menampilkan pesan kesalahan jika terjadi exception selama pemanggilan metode teach().//

//Selanjutnya, kita menggunakan getter untuk mendapatkan informasi atribut dari setiap objek. Di sini, kita melakukan casting (Matkul) dosen1 untuk mengakses
metode getId_Matkul() yang ada di kelas Matkul. Demikian juga dengan objek dosen2, kita melakukan casting (Alamat) dosen2 untuk mengakses metode getKota() 
yang ada di kelas Alamat.//

//Terakhir, kita mencetak informasi mengenai setiap objek dosen1 dan dosen2 dengan menggunakan metode getName(), getId_Matkul(), dan getKota().//
