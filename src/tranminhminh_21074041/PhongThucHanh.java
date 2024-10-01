package tranminhminh_21074041;

public class PhongThucHanh extends PhongHoc {
    private int soMayTinh;

    // Constructor
    public PhongThucHanh(String maPhong, String dayNha, float dienTich, int soBongDen, int soMayTinh) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.soMayTinh = soMayTinh;
    }

    // Getter and Setter for soMayTinh
    public int getSoMayTinh() {
        return soMayTinh;
    }

    public void setSoMayTinh(int soMayTinh) {
        this.soMayTinh = soMayTinh;
    }

    // Override toString method
    @Override
    public String toString() {
        return super.toString() + String.format("%20d", soMayTinh);
    }

    // Method to check if the room meets the standard
    @Override
    public boolean datChuan() {
        return duAnhSang() && (getDienTich() / soMayTinh >= 1.5f);
    }
}
