package stt20_21074041_TranMinhMinh_05;

public class CongNhan {
    private String mCN;
    private String mHo;
    private String mTen;
    private int mSoSP;

    // Constructor
    public CongNhan(String mCN, String mHo, String mTen, int mSoSP) {
        this.mCN = mCN;
        this.mHo = mHo;
        this.mTen = mTen;
        this.mSoSP = mSoSP;
    }

    // Getter and Setter for mCN
    public String getmCN() {
        return mCN;
    }

    public void setmCN(String mCN) {
        this.mCN = mCN;
    }

    // Getter and Setter for mHo
    public String getmHo() {
        return mHo;
    }

    public void setmHo(String mHo) {
        this.mHo = mHo;
    }

    // Getter and Setter for mTen
    public String getmTen() {
        return mTen;
    }

    public void setmTen(String mTen) {
        this.mTen = mTen;
    }

    // Getter and Setter for mSoSP
    public int getmSoSP() {
        return mSoSP;
    }

    public void setmSoSP(int mSoSP) {
        this.mSoSP = mSoSP;
    }

    // Method to calculate salary
    public double tinhLuong() {
        double donGia;
        if (mSoSP >= 600) {
            donGia = 0.65;
        } else if (mSoSP >= 400) {
            donGia = 0.60;
        } else if (mSoSP >= 200) {
            donGia = 0.55;
        } else {
            donGia = 0.50;
        }
        return mSoSP * donGia;
    }

    // Override toString() method
    @Override
    public String toString() {
        return "CongNhan [mCN=" + mCN + ", mHo=" + mHo + ", mTen=" + mTen + ", mSoSP=" + mSoSP + ", Luong=" + tinhLuong() + "]";
    }
}
