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
public class Bai02_Diem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhập điểm Toán:");
        double diemT=sc.nextDouble();
        System.out.print("Nhập điểm Văn:");
        double diemV=sc.nextDouble();
        System.out.print("Nhập điểm Anh:");
        double diemA=sc.nextDouble();
        
        double diemTB=(diemA+diemT+diemV)/3;
        String xepLoai;
        if(diemTB>=0 && diemTB<4.0){
            xepLoai="Yếu";
        }
        else if(diemTB>=4.0 && diemTB<6.5){
            xepLoai="Trung Bình";
        }
        else if(diemTB>=6.5 && diemTB<8.0){
            xepLoai="Khá";
        }
        else{
            xepLoai="Giỏi";
        }
        System.out.printf("Điểm trung bình: %.2f",diemTB);
        System.out.println("Xếp loại:"+xepLoai);
    }
}
