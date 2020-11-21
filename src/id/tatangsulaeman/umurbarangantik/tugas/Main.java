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
public class Main {
    public static void main(String[]args){
        Radio dataRadio = new Radio(234);
        dataRadio.setName("Radio Am");
        
        System.out.println("Nama barang Antik : " + dataRadio.getName());
        dataRadio.tampilUmur();
    }
}
