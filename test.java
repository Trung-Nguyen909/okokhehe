package bai3;

import java.util.Scanner;

public class test
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaiKhoan tk1 = new TaiKhoan();
        TaiKhoan tk2 = new TaiKhoan("huy","0906934",1000);
        tk2.setMk("1234");
        //tk2.mk = "chien"; sai
        tk1.nhap(sc);
    }
}