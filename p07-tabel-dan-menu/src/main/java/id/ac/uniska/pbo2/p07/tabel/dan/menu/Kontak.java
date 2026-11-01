/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.p07.tabel.dan.menu;

/**
 *
 * @author User
 */
public class Kontak {
    private String kode;
    private String nama;
    private String email;
    private String telepon;

    public Kontak(String kode, String nama, String email, String telepon) {
        this.kode = kode;
        this.nama = nama;
        this.email = email;
        this.telepon = telepon;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
}
    
