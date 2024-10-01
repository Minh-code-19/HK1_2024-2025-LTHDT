package tranminhminh_21074041;


public abstract class PhongHoc {
    protected String maPhong;
    protected String dayNha;
    protected float dienTich;
    protected int soBongDen;

    // Constructor
    public PhongHoc(String maPhong, String dayNha, float dienTich, int soBongDen) {
        this.maPhong = maPhong;
        this.dayNha = dayNha;
        this.dienTich = dienTich;
        this.soBongDen = soBongDen;
    }

   
    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    
    public String getDayNha() {
        return dayNha;
    }

    public void setDayNha(String dayNha) {
        this.dayNha = dayNha;
    }

  
    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    
    public int getSoBongDen() {
        return soBongDen;
    }

    public void setSoBongDen(int soBongDen) {
        this.soBongDen = soBongDen;
    }

    
    public boolean duAnhSang() {
       
        return (soBongDen >= dienTich / 10);
    }

    
    public abstract boolean datChuan();

    @Override
    public String toString() {
        return String.format("%-10s %-10s %10.2f %10d", maPhong, dayNha, dienTich, soBongDen);
    }
}

