/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1_20;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Bai06_PhepToan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen thu nhat: ");
        int so1 = sc.nextInt();
        System.out.print("Nhap so nguyen htu hai: ");
        int so2 = sc.nextInt();
        System.out.print("Nhap phep toan ban muon(+,-,*,/): ");
        String phep = sc.next();
        switch (phep) {
            case "+" ->
                System.out.printf("ket qua %d +%d la : %d\n", so1, so2, so1 + so2);
            case "-" ->
                System.out.printf("ket qua %d +%d la : %d\n", so1, so2, so1 - so2);
            case "*" ->
                System.out.printf("ket qua %d +%d la : %d\n", so1, so2, so1 * so2);
            case "/" -> {
                if (so2 != 0) {
                    System.out.printf("ket qua %d +%d la : %d\n", so1, so2, so1 / so2);
                } else {
                    System.out.println("Khong chia");
                }
            }
            default -> {
                System.out.println("Phep toan khong hop le");
            }
        }
    }
}
