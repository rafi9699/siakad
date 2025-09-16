public class Mahasiswa {
    
    String nama;    
    int NIM;
    String kelas;

    void tampilkanInfo() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + NIM);
        System.out.println("Kelas : " + kelas);
    }

    void mengajar

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama = "Rafi";
        mhs.NIM = 2403003;
        mhs.kelas = "TI-2A";
        
        mhs.tampilkanInfo();
    }
}
