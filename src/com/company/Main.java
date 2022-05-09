package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Gokay";
        ogrenciler[1] = "Cansu";
        ogrenciler[2] = "Munchy";
        ogrenciler[3] = "Soysal";

        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }
    }
}
