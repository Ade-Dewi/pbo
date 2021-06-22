package com.company;

import java.util.Date;

public class Datapegawai {
    private int id;
    private String nip;
    private String namalengkap;
    private String namapanggilan;
    private Date tanggallahir;
    private String jabatan;
    private int tahunjabatan;
    private String pangkatterakhir;

    public Datapegawai(int id, String nip, String namalengkap) {

        this.id = id;
        this.nip = nip;
        this.namalengkap = namalengkap;
    }

    public  void  mengabdi() {
        System.out.println("bekerja untuk negara");

    }
    public void bekerja(){
        System.out.println("bekerja untuk suatu perusahaan");
    }
    public void supayajadipns(){
        System.out.println("mencapai keinginan");
    }
    public void melakukanstudi(){
        System .out.println("supaya naik pangkat");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNamalengkap() {
        return namalengkap;
    }

    public void setNamalengkap(String namalengkap) {
        this.namalengkap = namalengkap;
    }

    public String getNamapanggilan() {
        return namapanggilan;
    }

    public void setNamapanggilan(String namapanggilan) {
        this.namapanggilan = namapanggilan;
    }

    public Date getTanggallahir() {
        return tanggallahir;
    }

    public void setTanggallahir(Date tanggallahir) {
        this.tanggallahir = tanggallahir;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public int getTahunjabatan() {
        return tahunjabatan;
    }

    public void setTahunjabatan(int tahunjabatan) {
        this.tahunjabatan = tahunjabatan;
    }

    public String getPangkatterakhir() {
        return pangkatterakhir;
    }

    public void setPangkatterakhir(String pangkatterakhir) {
        this.pangkatterakhir = pangkatterakhir;
    }
}
