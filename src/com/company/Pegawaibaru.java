package com.company;

public class Pegawaibaru extends Datapegawai{
    private String jabatanterakhir;
    private String homebase;
    private String Pekerjaansebelumnya;

    public void melamar(){
        System.out.println("untuk melamar kerja");
    }
    public void diseleksi(){
        System.out.println("interview pegawai baru");
    }

    public String getJabatanterakhir() {
        return jabatanterakhir;
    }

    public void setJabatanterakhir(String jabatanterakhir) {
        this.jabatanterakhir = jabatanterakhir;
    }

    public String getHomebase() {
        return homebase;
    }

    public void setHomebase(String homebase) {
        this.homebase = homebase;
    }

    public String getPekerjaansebelumnya() {
        return Pekerjaansebelumnya;
    }

    public void setPekerjaansebelumnya(String pekerjaansebelumnya) {
        Pekerjaansebelumnya = pekerjaansebelumnya;
    }
}
