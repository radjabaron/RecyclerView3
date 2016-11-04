package id.sch.smktelkom_mlg.learn.recyclerview3.model;

import java.io.Serializable;

/**
 * Created by BARON on 11/3/2016.
 */

public class Hotel implements Serializable {

    public String judul;
    public String deskripsi;
    public String foto;
    public String lokasi;
    public String detail;

    public Hotel(String judul, String deskripsi, String detail, String lokasi, String foto) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.foto = foto;
        this.detail = detail;
        this.lokasi = lokasi;
    }
}
