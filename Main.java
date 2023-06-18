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