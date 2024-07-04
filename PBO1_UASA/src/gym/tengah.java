package gym;

public class tengah extends awal {
    // overriding
    public tengah(String nomor, String nama, String umur) {
        super(nomor, nama, umur);
    }

    public int getTahunMasuk() {
        return Integer.parseInt(getNomor().substring(0, 2)) + 2000;
    }

    public String getBulan() {
        String bulanMasuk = getNomor().substring(2, 4);
        // seleksi switch
        return switch (bulanMasuk) {
            case "01" -> "Januari";
            case "02" -> "Februari";
            case "03" -> "Maret";
            case "04" -> "April";
            case "05" -> "Mei";
            case "06" -> "Juni";
            case "07" -> "Juli";
            case "08" -> "Agustus";
            case "09" -> "September";
            case "10" -> "Oktober";
            case "11" -> "November";
            case "12" -> "Desember";
            default -> "Anomali tidak dikenal";
        };
    }

    public int getNomorRegistrasi() {
        return Integer.parseInt(getNomor().substring(4));
    }

    // polymorphism overriding
    @Override
    public String displayInfo() {
        return super.displayInfo() +
                "\nTahun masuk: " + getTahunMasuk() +
                "\nBulan masuk: " + getBulan() +
                "\nNomor urut member: " + getNomorRegistrasi();
    }
}
