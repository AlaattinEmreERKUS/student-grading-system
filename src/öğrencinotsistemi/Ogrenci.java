package öğrencinotsistemi;

public class Ogrenci {

    String ad;
    String soyad;
    String no;
    String ders;
    String vizeExam;
    String finalExam;
    String ortalama;

    public Ogrenci(String ad, String soyad, String no, String ders, String vizeExam, String finalExam) {
        this.ad = ad;
        this.soyad = soyad;
        this.no = no;
        this.ders = ders;
        this.vizeExam = vizeExam;
        this.finalExam = finalExam;
        this.ortalama = Integer.toString(Integer.parseInt(vizeExam) * 4 / 10 + Integer.parseInt(finalExam) * 6 / 10);
    }
}
