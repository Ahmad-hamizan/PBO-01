package Praktikum02.praktek;

import javax.swing.*;

public class JavaxSwing {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog(
                "Nama Anda?");
        JOptionPane.showMessageDialog(null, "Apa Kabar " +
                nama + "?");
    }
}
