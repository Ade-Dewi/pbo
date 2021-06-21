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


}
