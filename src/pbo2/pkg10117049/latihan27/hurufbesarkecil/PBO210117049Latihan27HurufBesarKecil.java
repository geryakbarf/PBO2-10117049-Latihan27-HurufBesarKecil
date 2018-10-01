/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117049.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author Gery Akbar Fauzi
 * Nama : Gery Akbar Fauzi 
 * Kelas : PBO2 
 * Nim : 10117049
 * Deskripsi Program : Program ini berisi program untuk mengubah kalimat 
 * menjadi Uppercase dan Lowercase
 */
public class PBO210117049Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kata;

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Kalimat : ");
        kata = scan.nextLine();

        //Mengubah ke Uppercase dan Lowercase
        System.out.println("");
        System.out.println("===Hasil Formatting===");
        System.out.println("Huruf Besar : " + kata.toUpperCase());
        System.out.println("Huruf Kecil : " + kata.toLowerCase());
    }

}
