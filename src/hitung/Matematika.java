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
public class Matematika {
    //membuat variable
    private double bil1,bil2;
    
    //membuat constructor
    public Matematika(double bil1, double bil2){
         this.bil1 = bil1;
         this.bil2 = bil2;
    }
    
    //membuat method setPenjumlahan
    double setPenjumlahan() {
        return bil1 + bil2;
    }
    
        //membuat method setPengurangan
    double setPengurangan() {
        return bil1 - bil2;
    }
        //membuat method setPengalian
    double setPerkalian() {
        return bil1 * bil2;
    }
    
        //membuat method setPembagian
    double setPembagian() {
        return bil1 / bil2;
    }
 
}
