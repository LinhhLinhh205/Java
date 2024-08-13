/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1_20;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Bai15_DoanSo {

    public static void main(String[] args) {
        int may;
        int nguoi;
        String tieptuc = "y";
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("TRO CHOI DOAN SO");
        do {
            may = rd.nextInt(11);
            System.out.println("May da chon");
            System.out.println("may chon:" + may);
            int dem = 0;
            do {
                System.out.print("Moi ban doan so: ");
                nguoi = sc.nextInt();
                dem++;
                if (may == nguoi) {
                    System.out.println("Ban doan chinh xac");
                    break;
                } else {
                    System.out.println("Ban doan sai. Hay doan lai: ");
                }
            } while (true);
            sc.nextLine();
            System.out.println("Ban co muon choi tiep?(Y/N)");
            tieptuc = sc.nextLine();

        } while (tieptuc.equalsIgnoreCase("Y"));
    }
}
