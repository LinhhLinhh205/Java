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
public class Bai01_PTBac1 {

    public static void main(String[] args) {
        int a, b;
        a = NhapSoNguyen("Nhap he so a:");
        b = NhapSoNguyen("Nhap he so b:");
        GiaiPT(a, b);
    }

    public static int NhapSoNguyen(String str) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print(str);
        x = sc.nextInt();
        return x;
    }

    public static void GiaiPT(int a, int b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            System.out.print("Phương trình có nghiệm x=: " + (-b / a));
        }
    }
}
