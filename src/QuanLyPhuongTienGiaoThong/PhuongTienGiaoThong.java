package QuanLyPhuongTienGiaoThong;

/**
 *
 * @author CỌP
 */
public class PhuongTienGiaoThong {
   // khai báo các thuộc tính của lớp Phương Tiện Giao Thông
    /*
    Hang San Xuat       Mau         namSanXuat          GiaBan
    Lambogini           Đen         1995                15000000000
    Bugati              Blue        2009                25000000000
    
    */
    /*
    Chú thích nội dung Project
    */
    private String hangSanXuat;
    private int namSanXuat;
    private String mau;
    private double giaBan;

    public PhuongTienGiaoThong() {
    }

    public PhuongTienGiaoThong(String hangSanXuat, int namSanXuat, String mau, double giaBan) {
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.mau = mau;
        this.giaBan = giaBan;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public String getMau() {
        return mau;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }
        
    
}
