// Parent class Dosen
class Dosen {
    private String Matkul;
    private int Id_Matkul;

    public Dosen(String Matkul, int Id_Matkul) {
        this.Matkul = Matkul;
        this.Id_Matkul = Id_Matkul;
    }

    public String getName() {
        return Matkul;
    }

    public int getCapacity() {
        return Id_Matkul;
    }

    public void teach() {
        System.out.println("Teaching " + Matkul);
    }
}

//Di kelas Dosen ini, memiliki dua atribut privat, yaitu Matkul (mata kuliah) dan Id_Matkul (ID mata kuliah). 
Pada konstruktor, kita menginisialisasi kedua atribut tersebut dengan nilai yang diberikan saat objek dibuat. 
Metode getName() digunakan untuk mengambil nilai atribut Matkul, sedangkan metode getCapacity() digunakan untuk 
mengambil nilai atribut Id_Matkul. Metode teach() mencetak pesan yang menunjukkan bahwa dosen sedang mengajar mata 
kuliah yang disimpan dalam atribut Matkul.//

