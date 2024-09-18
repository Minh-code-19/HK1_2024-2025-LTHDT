package stt20_21074041_TranMinhMinh_05;

public class DanhSachCongNhan {
    private CongNhan[] danhSach;
    private int size;

    public DanhSachCongNhan(int maxSize) {
        danhSach = new CongNhan[maxSize];
        size = 0;
    }

    public boolean themCongNhan(CongNhan cn) {
        if (size < danhSach.length) {
            danhSach[size] = cn;
            size++;
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(danhSach[i].toString()).append("\n");
        }
        return sb.toString();
    }

    public int soLuongCongNhan() {
        return size;
    }

    public boolean xoaCongNhan(String maCN) {
        for (int i = 0; i < size; i++) {
            if (danhSach[i].getmCN().equals(maCN)) {
       
                danhSach[i] = danhSach[size - 1];
                danhSach[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    public CongNhan[] layCongNhanTren200SP() {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (danhSach[i].getmSoSP() > 200) {
                count++;
            }
        }

        CongNhan[] result = new CongNhan[count];
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (danhSach[i].getmSoSP() > 200) {
                result[index++] = danhSach[i];
            }
        }
        return result;
    }

    public void sapXepTheoSoSP() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (danhSach[i].getmSoSP() < danhSach[j].getmSoSP()) {
                    CongNhan temp = danhSach[i];
                    danhSach[i] = danhSach[j];
                    danhSach[j] = temp;
                }
            }
        }
    }
}
