/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitung;

/**
 *
 * @author valdi
 */
public class MatematikaBeraksi {
    public static void main(String[] args) {
        // membuat objek
        Matematika valdi = new Matematika(6, 3);

        // memanggil metode-metode pada objek valdi
        double hasilPenjumlahan = valdi.setPenjumlahan();
        double hasilPengurangan = valdi.setPengurangan();
        double hasilPerkalian = valdi.setPerkalian();
        double hasilPembagian = valdi.setPembagian();

        // Print the results
        System.out.println("Hasil Penjumlahan: " + hasilPenjumlahan);
        System.out.println("Hasil Pengurangan: " + hasilPengurangan);
        System.out.println("Hasil Perkalian: " + hasilPerkalian);
        System.out.println("Hasil Pembagian: " + hasilPembagian);
    }
}

