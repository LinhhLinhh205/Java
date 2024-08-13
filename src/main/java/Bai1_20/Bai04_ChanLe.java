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
public class Bai04_ChanLe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên:");
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println(" a là số chẳn");
        } else {
            System.out.println(" a là số lẻ");
        }

    }
}
