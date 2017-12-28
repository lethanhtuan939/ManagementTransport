
package QuanLyPhuongTienGiaoThong;

/**
 *
 * @author CỌP
 */
public class XeMay extends PhuongTienGiaoThong{
    private int congSuat;

    public XeMay() {
    }

    public XeMay(int congSuat, String hangSanXuat, int namSanXuat, String mau, double giaBan) {
        super(hangSanXuat, namSanXuat, mau, giaBan);
        this.congSuat = congSuat;
    }   

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }
    
}
