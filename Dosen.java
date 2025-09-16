public class Dosen {
    public class Dosen {
    // === Atribut (Property) ===
    private String nama;
    private String nidn;
    private String mataKuliah;
   

    // === Constructor ===
    public Dosen(String nama, String nip, String mataKuliah, int umur) {
        this.nama = nama;
        this.nip = nidn;
        this.mataKuliah = mataKuliah;
       
    }

    // === Method (Fungsi) ===
    public void tampilkanInfo() {
        System.out.println("Nama Dosen      : " + nama);
        System.out.println("NIP             : " + nip);
        System.out.println("Mata Kuliah     : " + mataKuliah);
        
    }

    public void mengajar() {
        System.out.println(nama + " sedang mengajar " + mataKuliah);
    }

    public void gantiMataKuliah(String mataKuliahBaru) {
        this.mataKuliah = mataKuliahBaru;
        System.out.println("Mata kuliah berhasil diganti ke " + mataKuliahBaru);
    }
}


    
}
