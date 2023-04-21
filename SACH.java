package bai3_1;
import java.util.Scanner;
public class SACH {
	private String maSach;
    private String tenSach;
    private String tenTacGia;
    private int soTrang;
    private String loaiSach;
    private String nhaXuatBan;
    private int soTap;
    private double gia;
    public void NHAPSACH() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sach:");
        maSach = sc.nextLine();
        System.out.println("Nhap ten sach:");
        tenSach = sc.nextLine();
        System.out.println("Nhap ten tac gia:");
        tenTacGia = sc.nextLine();
        System.out.println("Nhap so trang:");
        soTrang = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap loai sach:");
        loaiSach = sc.nextLine();
        System.out.println("Nhap nha xuat ban:");
        nhaXuatBan = sc.nextLine();
        System.out.println("Nhap so tap:");
        soTap = sc.nextInt();
        System.out.println("Nhap gia:");
        gia = sc.nextDouble();
    }


    public void INSACH() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Ten tac gia: " + tenTacGia);
        System.out.println("So trang: " + soTrang);
        System.out.println("Loai sach: " + loaiSach);
        System.out.println("Nha xuat ban: " + nhaXuatBan);
        System.out.println("So tap: " + soTap);
        System.out.println("Gia: " + gia);
    }
    public static void main(String[] args) {
        SACH sach = new SACH();
        sach.NHAPSACH();
        System.out.println("Thong tin cuon sach vua nhap:");
        sach.INSACH();
    }
}