package okulkayit;

public class OgrenciPojo {

    private String ogrenciAdi;
    private String ogrenciSoyadi;
    private String ogrenciYasi;



    public OgrenciPojo(String ogrenciAdi, String ogrenciSoyadi, String ogrenciYasi) {
        this.ogrenciAdi = ogrenciAdi;
        this.ogrenciSoyadi = ogrenciSoyadi;
        this.ogrenciYasi = ogrenciYasi;
    }


    public String getOgrenciAdi() {
        return ogrenciAdi;
    }

    public void setOgrenciAdi(String ogrenciAdi) {
        this.ogrenciAdi = ogrenciAdi;
    }
    public String getOgrenciSoyadi() {
        return ogrenciSoyadi;
    }

    public void setOgrenciSoyadi(String ogrenciSoyadi) {
        this.ogrenciSoyadi = ogrenciSoyadi;
    }
    public String getOgrenciYasi() {
        return ogrenciYasi;
    }

    public void setOgrenciYasi(String ogrenciYasi) {
        this.ogrenciYasi = ogrenciYasi;
    }

}

