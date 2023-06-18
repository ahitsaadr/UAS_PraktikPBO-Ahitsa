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