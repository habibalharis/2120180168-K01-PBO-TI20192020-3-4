package pkgclass.sk.pkg01;
public class Mahasiswa02 {
        
    //property
    String nama="Moh. Aditiya Al Ghofar";
    String alamat="Ds. Jumput Kec.Sukosewu Kab.Bojonegoro";
    String nim="2120180220";
    
    //method
    void tampilkan_biodata (){
        System.out.println("Biodata Mahasiswa 1 : ");
        System.out.println("1. Nama   : " + this.nama);
        System.out.println("2. Alamat : " + this.alamat);
        System.out.println("3. Nim    : " + this.nim);
    }
    
}
