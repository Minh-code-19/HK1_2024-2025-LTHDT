package tranminhminh_21074041;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListPhongHoc {
    private List<PhongHoc> ds;


    public ListPhongHoc() {
        ds = new ArrayList<>();
    }

  
    public int tongSoPhongHoc() {
        return ds.size();
    }

    /**
     * Thêm phòng học vào danh sách ds
     * @param ph phòng học cần thêm
     * @return true nếu thêm thành công, false nếu phòng học đã tồn tại
     */
    public boolean themPhong(PhongHoc ph) {
        if (ds.contains(ph)) {
            return false;
        }
        ds.add(ph);
        return true;
    }

   
    public void xuatDanhSachPhongHoc() {
        for (PhongHoc ph : ds) {
            System.out.println(ph);
        }
    }

    
    public PhongHoc timKiem(String maPhong) {
        for (PhongHoc ph : ds) {
            if (ph.getMaPhong().equalsIgnoreCase(maPhong)) {
                return ph;
            }
        }
        return null; 
    }

   
    public void dsPhongHocDatChuan() {
        for (PhongHoc ph : ds) {
            if (ph.datChuan()) {
                System.out.println(ph);
            }
        }
    }

  
    public void sapXepDienTich() {
        Collections.sort(ds, new Comparator<PhongHoc>() {
            @Override
            public int compare(PhongHoc p1, PhongHoc p2) {
                return Float.compare(p1.getDienTich(), p2.getDienTich());
            }
        });
        System.out.println("Danh sách phòng học sau khi sắp xếp theo diện tích:");
        xuatDanhSachPhongHoc();
    }

   
    public void sapXepSoBongDen() {
        Collections.sort(ds, new Comparator<PhongHoc>() {
            @Override
            public int compare(PhongHoc p1, PhongHoc p2) {
                return Integer.compare(p1.getSoBongDen(), p2.getSoBongDen());
            }
        });
        System.out.println("Danh sách phòng học sau khi sắp xếp theo số bóng đèn:");
        xuatDanhSachPhongHoc();
    }

    /**
     * Cập nhật số máy tính cho phòng thực hành
     * @param maPhong mã phòng cần cập nhật
     * @param soMayTinh số máy tính mới
     * @return true nếu cập nhật thành công, false nếu không tìm thấy phòng hoặc không phải phòng thực hành
     */
    public boolean capNhatSoMay(String maPhong, int soMayTinh) {
        PhongHoc ph = timKiem(maPhong);
        if (ph != null && ph instanceof PhongThucHanh) {
            ((PhongThucHanh) ph).setSoMayTinh(soMayTinh);
            return true;
        }
        return false;
    }

  
    public void danhSachPhongCoMayChieu() {
        for (PhongHoc ph : ds) {
            if (ph instanceof PhongLyThuyet && ((PhongLyThuyet) ph).isCoMayChieu()) {
                System.out.println(ph);
            }
        }
    }

    /**
     * Xóa phòng học khi biết mã phòng
     * @param maPhong mã phòng cần xóa
     * @return true nếu xóa thành công, false nếu không tìm thấy
     */
    public boolean xoaPhongHoc(String maPhong) {
        PhongHoc ph = timKiem(maPhong);
        if (ph != null) {
            ds.remove(ph);
            return true;
        }
        return false;
    }

    
    public void inPhongMayTinhTren60() {
        for (PhongHoc ph : ds) {
            if (ph instanceof PhongThucHanh && ((PhongThucHanh) ph).getSoMayTinh() > 60) {
                System.out.println(ph);
            }
        }
    }
}
