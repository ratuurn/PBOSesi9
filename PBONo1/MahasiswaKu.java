package PBONo1;

public class MahasiswaKu {
    public static void main(String[] args) {
        Mahasiswa <String,String,Integer> m = new Mahasiswa<>();
        m.setNim("2023003002");
        m.setName("Melati");
        m.setClas(23);

        System.out.println(m.getNim());
        System.out.println(m.getName());
        System.out.println(m.getClas());
    }   
}
