public class Mahasiswa {
    String nama;    
    int NIM;
    String kelas;

    void tampilkanInfo() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + NIM);
        System.out.println("Kelas : " + kelas);
    }

    void presensi() {
        System.out.println(nama + " melakukan presensi.");
    }

    void krs() {
        System.out.println(nama + " sedang melakukan pengisian KRS.");
    }

    void kumpulkanTugas(String mataKuliah) {
        System.out.println(nama + " mengumpulkan tugas " + mataKuliah + ".");
    }

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama = "Rafi";
        mhs.NIM = 2403003;
        mhs.kelas = "TI-2A";
        
        mhs.tampilkanInfo();
        mhs.presensi();
        mhs.krs();
        mhs.kumpulkanTugas("Pemrograman Berorientasi objek");
    }
}
