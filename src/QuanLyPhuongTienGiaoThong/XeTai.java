package QuanLyPhuongTienGiaoThong;

/**
 *
 * @author CỌP
 */
public class XeTai extends PhuongTienGiaoThong{
    private double trongTai;

    public XeTai() {
    }

    public XeTai(double trongTai, String hangSanXuat, int namSanXuat, String mau, double giaBan) {
        super(hangSanXuat, namSanXuat, mau, giaBan);
        this.trongTai = trongTai;
    }
   
    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }
    
}
