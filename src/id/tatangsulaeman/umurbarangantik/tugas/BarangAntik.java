/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.umurbarangantik.tugas;

/**
 *
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Menampilkan program Umur Barang antik
 * 
 */
public class BarangAntik {
    private int umur;

    public BarangAntik(int umur) {
        this.umur = umur;
    }
    
    public void tampilUmur(){
        System.out.println("Umur barang Antik ini adalah : " + umur + " tahun");
    }
}
