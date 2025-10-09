/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum01;
import java.util.Scanner;


/**
 *
 * @author USER
 */
public class BacaTerminal {
     public static void main(String[] arg)
 {
 // buat objek untuk baca terminal
 Scanner sc = new Scanner(System.in);
 System.out.println("Nama anda ? ");
 String nama = sc.nextLine(); // baca masukan
 System.out.println("Pa kabar "+ nama +" ?");
 sc.close();
 }
}
