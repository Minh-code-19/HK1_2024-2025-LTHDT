package tranminhminh_21074041;

public class PhongLyThuyet extends PhongHoc {
    private boolean coMayChieu;

    // Constructor
    public PhongLyThuyet(String maPhong, String dayNha, float dienTich, int soBongDen, boolean coMayChieu) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.coMayChieu = coMayChieu;
    }

    // Getter and Setter for coMayChieu
    public boolean isCoMayChieu() {
        return coMayChieu;
    }

    public void setCoMayChieu(boolean coMayChieu) {
        this.coMayChieu = coMayChieu;
    }

    // Override toString method
    @Override
    public String toString() {
        String mayChieu = (coMayChieu) ? "Có máy chiếu" : "Không có máy chiếu";
        return super.toString() + String.format(" %s", mayChieu);
    }

    // Method to check if the room meets standard
    @Override
    public boolean datChuan() {
        return duAnhSang() && coMayChieu;
    }
}
