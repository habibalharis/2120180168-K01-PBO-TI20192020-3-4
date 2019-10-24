package pkgclass.sk.pkg01;
public class Mahasiswa01 {
        
    //property
    String nama="M. Habib Al Haris";
    String alamat="Ds. Balenrejo Kec.Balen Kab.Bojonegoro";
    String nim="2120180168";
    
    //method
    void tampilkan_biodata (){
        System.out.println("Biodata Mahasiswa 1 : ");
        System.out.println("1. Nama   : " + this.nama);
        System.out.println("2. Alamat : " + this.alamat);
        System.out.println("3. Nim    : " + this.nim);
    }
     
}
