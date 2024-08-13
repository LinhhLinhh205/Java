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
public class Bai20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = docPhanTu(sc);
        int[] array = new int[n];
        nhapMang(array, sc);
        System.out.print("Mang da nhap: ");
        xuatMang(array);

        System.out.print("Nhap so nguyen: ");
        int a = sc.nextInt();
        int viTri = viTriCuaX(array, a);
        if (viTri == -1) {
            System.out.println(a + " khong xuat hien trong mang");
        } else {
            System.out.println(a + " xuat hien trong mang. Vi tri: " + (viTri + 1));
        }
        if (kiemTraTangDan(array)) {
            System.out.println("Mang duoc sap xep tang dan");
        } else {
            System.out.println("Mang khong duoc sap xep ang dan");
        }
    }

    public static int docPhanTu(Scanner sc) {
        int n = 0;
        do {
            System.out.print("Nhap phan tu mang: ");
            n = sc.nextInt();
        } while (n < 0 || n > 20);
        return n;
    }

    public static void nhapMang(int[] array, Scanner sc) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
    }

    public static void xuatMang(int[] array) {
        for (int x : array) {
            System.out.print(x + " ");
        }
    }

    public static int viTriCuaX(int[] array, int x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static boolean kiemTraTangDan(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
