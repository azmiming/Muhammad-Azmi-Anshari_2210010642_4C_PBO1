package gym;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Akhir {
    public static void main(String[] args) {
        // IO sederhana
        //Error Handling
        try {
        Scanner scanner = new Scanner(System.in);
        // List untuk menyimpan member
        List<tengah> members = new ArrayList<>();
        while (true) {
            System.out.println("PILIHLAH ANGKA DIBAWAH SESUI KEBUTUHAN ANDA:");
            System.out.println("1. Daftar Member");
            System.out.println("2. Cek Member");
            System.out.println("3. Keluar");
            System.out.println("===============================================");
            System.out.print("Masukkan pilihan Anda: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1 -> {
                    // Daftar Member
                    System.out.print("Masukkan Nomor member: ");
                    String nomor = scanner.nextLine();
                    System.out.print("Masukkan Nama member: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan umur member: ");
                    String umur = scanner.nextLine();
                    System.out.println();

                    //untuk menambahkan member ke dalam data
                    members.add(new tengah(nomor, nama, umur));

                    // perulangan 
                    for (tengah member : members) {
                        System.out.println(member.displayInfo());
                    }
                }
                case 2 -> {
                    // Cek Member
                    System.out.print("Masukkan Nomor Member untuk di check: ");
                   
                    String nomor = scanner.nextLine();
                    boolean found = false;
                    for (tengah member : members) {
                        if (member.getNomor().equals(nomor)) {
                            System.out.println(member.displayInfo());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Member tidak ada.Silahkan coba lagi");
                    }
                }
                case 3 -> {
                    // Keluar
                    System.out.println("Terima kasih telah memakai system yang telah kami buat");
                    scanner.close();
                    return;
                }
            }
            }
              } catch (NumberFormatException e) {
            System.out.println("Kesalahan format nomor: " + e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Kesalahan format nama: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Kesalahan umum: " + e.getMessage());
        }
    }
}
    

