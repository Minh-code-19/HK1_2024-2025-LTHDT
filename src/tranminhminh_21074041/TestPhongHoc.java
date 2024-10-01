package tranminhminh_21074041;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class TestPhongHoc {

    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        
        PhongHoc p1 = new PhongLyThuyet("V10.01", "Y", 200, 10, true);
        PhongHoc p2 = new PhongLyThuyet("X12.01", "X", 160, 25, false);
        PhongHoc p3 = new PhongThucHanh("B1.12", "B", 90, 20, 65);
        PhongHoc p4 = new PhongThiNghiem("F1.01", "F", 100, 30, "Hoa Hoc", 30, true);
        
        ListPhongHoc ds = new ListPhongHoc();
        ds.themPhong(p1);
        ds.themPhong(p2);
        ds.themPhong(p3);
        ds.themPhong(p4);
        
        int chon;
        do {
            System.out.println("1. Xuat Danh Sach Phong Hoc");
            System.out.println("2. Tim Kiem Phong Hoc");
            System.out.println("3. Danh Sach Cao Hon 60");
            System.out.println("4. Tong So Phong Hoc");
            System.out.println("5. Sap Xep Dien Tich");
            System.out.println("6. Sap Xep So Bong Den");
            System.out.println("7. Cap Nhat May Tinh Cho Phong Thuc Hanh");
            System.out.println("8. Danh Sach Phong Co May Chieu");
            System.out.println("9. Xoa Phong Hoc");
            System.out.println("10. Tim Phong Hoc Co So May Tinh Tren 60");
            System.out.println("11. Thoat!!!");
            System.out.println("================MENU LUA CHON================");
            chon = sc.nextInt();
            
            switch(chon) {
                case 1:
                    ds.xuatDanhSachPhongHoc();
                    break;

                case 2:
                    sc.nextLine(); 
                    System.out.println("Nhap Ma Phong Can Tim: ");
                    String maPhong = sc.nextLine();
                    PhongHoc ph = ds.timKiem(maPhong);
                    if (ph != null) {
                        System.out.println(ph);
                    } else {
                        System.out.println("Khong Tim Thay Phong Theo Yeu Cau");
                    }
                    break;

                case 3:
                    System.out.println("Danh Sach Phong Dat Chuan");
                    ds.dsPhongHocDatChuan();
                    break;

                case 4:
                    System.out.println("Tong So Phong Hoc La: " + ds.tongSoPhongHoc());
                    break;

                case 5:
                    ds.sapXepDienTich();
                    break;

                case 6:
                    ds.sapXepSoBongDen();
                    break;

                case 7:
                    sc.nextLine();
                    System.out.println("Nhap Ma Phong Can Cap Nhat: ");
                    maPhong = sc.nextLine();
                    System.out.println("Nhap So May Tinh Moi: ");
                    int soMayTinh = sc.nextInt();
                    if (ds.capNhatSoMay(maPhong, soMayTinh)) {
                        System.out.println("Cap Nhat Thanh Cong");
                    } else {
                        System.out.println("Khong Cap Nhat Duoc");
                    }
                    break;

                case 8:
                    ds.danhSachPhongCoMayChieu();
                    break;

                case 9:
                    sc.nextLine();
                    System.out.println("Nhap Ma Phong Can Xoa: ");
                    maPhong = sc.nextLine();
                    int hoi = JOptionPane.showConfirmDialog(null, "Chac Chan Xoa Khong?", "Thong Bao", JOptionPane.YES_NO_OPTION);
                    if (hoi == JOptionPane.YES_OPTION) {
                        if (ds.xoaPhongHoc(maPhong)) {
                            System.out.println("Xoa Thanh Cong!!!");
                        } else {
                            System.out.println("Khong Xoa Duoc!!");
                        }
                    }
                    break;

                case 10:
                    ds.inPhongMayTinhTren60();
                    break;

                case 11:
                    System.out.println("Thoat chuong trinh.");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }
        } while (chon != 11);
    }
}
