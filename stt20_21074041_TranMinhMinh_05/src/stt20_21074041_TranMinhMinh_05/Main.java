package stt20_21074041_TranMinhMinh_05;

public class Main {
    public static void main(String[] args) {
     
        DanhSachCongNhan dscn = new DanhSachCongNhan(5);

  
        dscn.themCongNhan(new CongNhan("CN001", "Nguyen", "Van A", 150));
        dscn.themCongNhan(new CongNhan("CN002", "Le", "Thi B", 250));
        dscn.themCongNhan(new CongNhan("CN003", "Tran", "Van C", 350));
        dscn.themCongNhan(new CongNhan("CN004", "Hoang", "Thi D", 450));
        dscn.themCongNhan(new CongNhan("CN005", "Pham", "Thi E", 650));

  
        System.out.println("Danh sách công nhân:");
        System.out.println(dscn.toString());

    
        System.out.println("Số lượng công nhân: " + dscn.soLuongCongNhan());

       
        dscn.xoaCongNhan("CN001");
        System.out.println("Danh sách sau khi xóa công nhân CN001:");
        System.out.println(dscn.toString());

        
        System.out.println("Danh sách công nhân làm trên 200 sản phẩm:");
        CongNhan[] congNhanTren200SP = dscn.layCongNhanTren200SP();
        for (CongNhan cn : congNhanTren200SP) {
            System.out.println(cn.toString());
        }

        
        dscn.sapXepTheoSoSP();
        System.out.println("Danh sách sau khi sắp xếp theo số sản phẩm giảm dần:");
        System.out.println(dscn.toString());
    }
}
