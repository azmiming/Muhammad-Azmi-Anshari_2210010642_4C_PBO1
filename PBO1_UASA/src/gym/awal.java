package gym;

// class awal
public class awal {
    // enkapsulasi & atribut
    private String nomor;
    private String nama;
    private String umur;

    // constructor
    public awal(String nomor, String nama, String umur) {
        this.nomor = nomor;
        this.nama = nama;
        this.umur = umur;
    }

    // Accesor getter 
    public String getUmur() {
        return umur;
    }

    public String getNomor() {
        return nomor;
    }

    public String getNama() {
        return nama;
    }

    // mutator setter
    public void setUmur(String umur) {
        this.umur = umur;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String displayInfo() {
        return "Nomor: " + getNomor() + "\nNama: " + getNama() + "\nUmur: " + getUmur();
    }
}
