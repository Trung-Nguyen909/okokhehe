package bai3;

import java.util.Scanner;

public class TaiKhoan
{
    private String tenTK;
    private String soTK;
    private double sodu=0;
    private String mk;

    public String getMk() {
        return mk;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }

    public TaiKhoan() {
    }
    public TaiKhoan(String tenTK, String soTK, double sodu) {
        this.tenTK = tenTK;
        this.soTK = soTK;
        this.sodu = sodu;
    }
    public void doimk()
    {
        Scanner sc = new Scanner(System.in);
        String mkcu;
        String mkmoi;
        System.out.println("vui long nhap mat khau cu: ");
        mkcu = sc.nextLine();
        if(mkcu.equals(mk))
        {
            System.out.print("nhap mat khau moi: ");
            mkmoi = sc.nextLine();
            mk = mkmoi;
            System.out.println("doi mat khau thanh cong");
        }
        else System.out.println("mat khau da nhap khong hop le");
    }
    public void nhapthongtin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("so tai khoan: ");
        soTK = sc.nextLine();
        System.out.print("nhap ten chu tai khoan: ");
        tenTK = sc.nextLine();
        System.out.print("tao mat khau: ");
        mk = sc.nextLine();
    }
    public void inthongtin()
    {
        System.out.println("Ten tai khoan: " + tenTK);
        System.out.println("So tai khoan: " + soTK);
        System.out.println("So du: " + sodu);
    }
    void guitien(Scanner sc)
    {
        System.out.println("so tien co du trong vi: "+ sodu);
        System.out.println("ban muon nap bao nhieu: ");
        double nap = sc.nextDouble();
        sodu += nap;
        System.out.println("so du hien tai: "+sodu);
    }
    void kiemtra()
    {
        System.out.println("so du hien tai la: "+sodu);
    }
    void ruttien(Scanner sc)
    {
        double rut;
        System.out.println("so du trong vi hien tai la: "+sodu);
        System.out.println("ban muon rut bao nhieu: ");
        rut = sc.nextDouble();
        while (rut>sodu)
        {
            System.out.println("so tien ban rut lon hon so du con trong vi, vui long nhap lai");
            rut = sc.nextDouble();
        }
        System.out.println("ban vua moi rut: "+rut);
        sodu -=rut;
        System.out.println("so tien con lai trong vi la: "+sodu);
    }
    void nhap(Scanner sc)
    {
        int chon;
        nhapthongtin();
        do {
            System.out.println("----------------\nvui long chon: ");
            System.out.println("1.gui tien\n2.rut tien\n3.kiem tra so du\n4.doi mat khau\n5.in thong tin\n6.thoat");
            chon = sc.nextInt();
            switch (chon)
            {
                case 1: guitien(sc); break;
                case 2: ruttien(sc); break;
                case 3: kiemtra();break;
                case 4: doimk();break;
                case 5: inthongtin();break;
                case 6: break;
            }
        }while (chon!=6);
    }
}