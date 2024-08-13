/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1_20;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Bai19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int n = docSoPhanTu(sc);
        int[] array = new int[n];
        System.out.print("Mang phat sinh ngau nhien: ");
        for (int i = 0; i < n; i++) {
            array[i] = rd.nextInt(100);
            System.out.print(array[i] + " ");
        }
        sapXepMang(array);
        System.out.print("\nMang sau khi sap xep:");
        xuatMang(array);

        System.out.print("\nNhap x:");
        int x = sc.nextInt();
        System.out.print("Phan tu trong mang la uoc so cua " + x + " là: ");
        kiemTraUocSo(array, x);
    }

    public static void kiemTraUocSo(int[] array, int x) {
        boolean uocso = false;
        for (int a : array) {
            if (x % a == 0) {
                System.out.println(a + " ");
                uocso = true;

            }
        }
        if (!uocso) {
            System.out.println("Khong co phan tu nao la uoc so cua " + x);
        } else {
            System.out.println();
        }
    }

    public static void sapXepMang(int[] array) {
        Arrays.sort(array);
    }

    public static int docSoPhanTu(Scanner sc) {
        int n;
        do {
            System.out.print("Nhap so phan tu mang: ");
            n = sc.nextInt();
        } while (n < 0 || n > 20);
        return n;
    }

    public static void xuatMang(int[] array) {
        for (int x : array) {
            System.out.print(x + " ");
        }
    }
}
