package PBONo2.MyBook;

public class Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;

    Buku(String judul, String penulis, int tahunTerbit){
        this.judul=judul;
        this.penulis=penulis;
        this.tahunTerbit=tahunTerbit;
    }

    public String getJudul(){
        return this.judul;
    }

    public String getNamaPenulis(){
        return this.penulis;
    }

    public int getTahunTerbit(){
        return this.tahunTerbit;
    }

    public void infoBuku(){
        System.out.println("Judul\t\t: "+getJudul());
        System.out.println("Penulis\t\t: "+getNamaPenulis());
        System.out.println("Tahun Terbit\t: "+getTahunTerbit());
        System.out.println("");
    }
}
