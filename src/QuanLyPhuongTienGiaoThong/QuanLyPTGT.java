package QuanLyPhuongTienGiaoThong;

import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CỌP
 */
public class QuanLyPTGT extends javax.swing.JFrame {

    //Khai báo model của table để lưu giữ dữ liệu
    private DefaultTableModel mdTblPhuongTien;
    //Khai báo ArrayList lưu trữ danh sách phương tiện thực sự
    private ArrayList<PhuongTienGiaoThong> phuongTiens;
    //Khai báo biến lưu trữ vị trí dòng (row) được chọn.
    private int selectedIndex = -1;

    public QuanLyPTGT() {
        initComponents(); // commit
        myInit(); // Code hay lam
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboLoaiPhuongTien = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cboHangSanXuat = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cboNamSanXuat = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cboMau = new javax.swing.JComboBox<>();
        cboSoChoNgoi = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtKieuDongCo = new javax.swing.JTextField();
        txtGiaBan = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCongSuat = new javax.swing.JTextField();
        txtTrongTai = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        btnTimKiemGanDung = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPhuongTiens = new javax.swing.JTable();
        btnReset = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtTuKhoaTimKiem = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG");

        jLabel2.setText("Loại phương tiện: ");

        cboLoaiPhuongTien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ô tô", "Xe máy", "Xe tải" }));
        cboLoaiPhuongTien.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboLoaiPhuongTienItemStateChanged(evt);
            }
        });

        jLabel3.setText("Hãng sản xuất: ");

        cboHangSanXuat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Honda", "Toyota", "Yamaha", "Suzuki", "Kia", "Huyndai", "Mec" }));

        jLabel4.setText("Năm sản xuất: ");

        jLabel5.setText("Màu: ");

        cboMau.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blue", "White", "Black", "Yellow", "Red", "Green" }));

        cboSoChoNgoi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "8", "10", "12", "20", "24", "30", "34" }));

        jLabel6.setText("Số chỗ ngồi:");

        jLabel7.setText("Kiểu động cơ: ");

        txtGiaBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGiaBanActionPerformed(evt);
            }
        });

        jLabel8.setText("Giá Bán: ");

        jLabel9.setText("Công suất: ");

        txtCongSuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCongSuatActionPerformed(evt);
            }
        });

        jLabel10.setText("Trọng tải: ");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnCapNhat.setText("Cập Nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnTimKiem.setText("Tìm Kiếm Theo Hãng");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnTimKiemGanDung.setText("Tìm Kiếm Gần Đúng");
        btnTimKiemGanDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemGanDungActionPerformed(evt);
            }
        });

        tblPhuongTiens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Loại Phương Tiện", "Hãng sản xuất", "Năm sản xuất", "Giá Bán", "Màu Sắc", "Kiểu động cơ", "Số chổ ngồi", "Công suất", "Trọng tải"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPhuongTiens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhuongTiensMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPhuongTiens);

        btnReset.setText("Làm mới");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btnThem)
                        .addGap(55, 55, 55)
                        .addComponent(btnXoa)
                        .addGap(55, 55, 55)
                        .addComponent(btnReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCapNhat)
                        .addGap(49, 49, 49)
                        .addComponent(btnTimKiem)
                        .addGap(53, 53, 53)
                        .addComponent(btnTimKiemGanDung)
                        .addGap(38, 38, 38))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 934, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 84, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnCapNhat)
                    .addComponent(btnTimKiem)
                    .addComponent(btnTimKiemGanDung)
                    .addComponent(btnReset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel11.setText("Tìm kiếm gần đúng theo hãng: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(377, 377, 377)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3))
                                    .addGap(88, 88, 88))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(132, 132, 132))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cboLoaiPhuongTien, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cboHangSanXuat, 0, 138, Short.MAX_VALUE)
                                .addComponent(cboNamSanXuat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboMau, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboSoChoNgoi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtKieuDongCo, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTrongTai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCongSuat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTuKhoaTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(153, 153, 153))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(cboLoaiPhuongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(cboHangSanXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(cboNamSanXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(txtTrongTai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboSoChoNgoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtKieuDongCo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCongSuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboMau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtTuKhoaTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtGiaBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGiaBanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGiaBanActionPerformed

    private void txtCongSuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCongSuatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCongSuatActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        //Đảm bảo có dòng được chọn
        if (selectedIndex != -1) {
            switch (cboLoaiPhuongTien.getSelectedItem().toString()) {
                case "Ô tô":
                    // nho la add theo danh sach khai bao tu constructor cua moi lop cong tuong ung, co thua ke nhe

                    phuongTiens.set(selectedIndex, new OTo(txtKieuDongCo.getText().trim(),
                            Integer.parseInt(cboSoChoNgoi.getSelectedItem().toString()),
                            cboHangSanXuat.getSelectedItem().toString(),
                            Integer.parseInt(cboNamSanXuat.getSelectedItem().toString()),
                            cboMau.getSelectedItem().toString(),
                            Double.parseDouble(txtGiaBan.getText().trim())
                    ));
                    //public OTo(String kieuDongCo, int soChoNgoi, String hangSanXuat, int namSanXuat, String mau, double giaBan) {
                    break;
                case "Xe máy":
                    phuongTiens.set(selectedIndex, new XeMay(Integer.parseInt(txtCongSuat.getText().trim()),
                            cboHangSanXuat.getSelectedItem().toString(),
                            Integer.parseInt(cboNamSanXuat.getSelectedItem().toString()),
                            cboMau.getSelectedItem().toString(),
                            Double.parseDouble(txtGiaBan.getText().trim())));
                    //public XeMay(int congSuat, String hangSanXuat, int namSanXuat, String mau, double giaBan) {
                    break;
                case "Xe tải":
                    phuongTiens.set(selectedIndex, new XeTai(Double.parseDouble(txtTrongTai.getText().trim()),
                            cboHangSanXuat.getSelectedItem().toString(),
                            Integer.parseInt(cboNamSanXuat.getSelectedItem().toString()),
                            cboMau.getSelectedItem().toString(),
                            Double.parseDouble(txtGiaBan.getText().trim())));
                    //public XeTai(double trongTai, String hangSanXuat, int namSanXuat, String mau, double giaBan) {
                    break;

            }
            //Nạp dữ liệu trong phuongTiens vào table
            loadDataIntoTable();
        }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        //Thực hiện chức năng thêm đúng loại phương tiện danh sách phuongTiens
        //Tương ứng với loại phương tiện được chọn
        switch (cboLoaiPhuongTien.getSelectedItem().toString()) {
            case "Ô tô":
                // nho la add theo danh sach khai bao tu constructor cua moi lop cong tuong ung, co thua ke nhe
                phuongTiens.add(new OTo(txtKieuDongCo.getText().trim(),
                        Integer.parseInt(cboSoChoNgoi.getSelectedItem().toString()),
                        cboHangSanXuat.getSelectedItem().toString(),
                        Integer.parseInt(cboNamSanXuat.getSelectedItem().toString()),
                        cboMau.getSelectedItem().toString(),
                        Double.parseDouble(txtGiaBan.getText().trim())
                ));
                //public OTo(String kieuDongCo, int soChoNgoi, String hangSanXuat, int namSanXuat, String mau, double giaBan) {
                break;
            case "Xe máy":
                phuongTiens.add(new XeMay(Integer.parseInt(txtCongSuat.getText().trim()),
                        cboHangSanXuat.getSelectedItem().toString(),
                        Integer.parseInt(cboNamSanXuat.getSelectedItem().toString()),
                        cboMau.getSelectedItem().toString(),
                        Double.parseDouble(txtGiaBan.getText().trim())));
                //public XeMay(int congSuat, String hangSanXuat, int namSanXuat, String mau, double giaBan) {
                break;
            case "Xe tải":
                phuongTiens.add(new XeTai(Double.parseDouble(txtTrongTai.getText().trim()),
                        cboHangSanXuat.getSelectedItem().toString(),
                        Integer.parseInt(cboNamSanXuat.getSelectedItem().toString()),
                        cboMau.getSelectedItem().toString(),
                        Double.parseDouble(txtGiaBan.getText().trim())));
                //public XeTai(double trongTai, String hangSanXuat, int namSanXuat, String mau, double giaBan) {
                break;

        }
        //Nạp dữ liệu trong phuongTiens vào table
        loadDataIntoTable();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        //Đảm bảo có dòng được chọn để xóa
        if (selectedIndex != -1) {
            int option = JOptionPane.showConfirmDialog(this, "Xóa phương tiện này");
           if(option == 0) {
                // Xóa dữ liệu tại dòng được chọn trong model
            mdTblPhuongTien.removeRow(selectedIndex);
            //Xóa dữ liệu trong phuongTiens
            phuongTiens.remove(selectedIndex);
            //Trả về trạng thái chưa có dòng nào được chọn.
           }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void cboLoaiPhuongTienItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboLoaiPhuongTienItemStateChanged
        switch (cboLoaiPhuongTien.getSelectedItem().toString()) {
            case "Ô tô":
                txtKieuDongCo.setEnabled(true);
                cboSoChoNgoi.setEnabled(true);
                txtCongSuat.setEnabled(false);
                txtTrongTai.setEnabled(false);
                break;
            case "Xe máy":
                txtKieuDongCo.setEnabled(false);
                cboSoChoNgoi.setEnabled(false);
                txtCongSuat.setEnabled(true);
                txtTrongTai.setEnabled(false);
                break;
            case "Xe tải":
                txtKieuDongCo.setEnabled(false);
                cboSoChoNgoi.setEnabled(false);
                txtCongSuat.setEnabled(false);
                txtTrongTai.setEnabled(true);
                break;
        }
    }//GEN-LAST:event_cboLoaiPhuongTienItemStateChanged

    private void tblPhuongTiensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhuongTiensMouseClicked
        selectedIndex = tblPhuongTiens.getSelectedRow();
        //Nếu người dùng kích đúp chuột chuẩn bị cho việc cập nhập
        // Tiến hành nạp dữ liệu tại dòng kích đúp lên các điều khiển
        // Cho phép người dùng thay đổi dữ liệu
        if (evt.getClickCount() == 2 && selectedIndex != -1) {
            //Các số đại diện cho chủ mục index của các cột trong table
            setSelectedItemsForCbo(selectedIndex, 1, cboLoaiPhuongTien);
            setSelectedItemsForCbo(selectedIndex, 2, cboHangSanXuat);
            setSelectedItemsForCbo(selectedIndex, 3, cboNamSanXuat);
            setSelectedItemsForCbo(selectedIndex, 5, cboMau);
            setSelectedItemsForCbo(selectedIndex, 7, cboSoChoNgoi);

            setTextForTextFiled(selectedIndex, 4, txtGiaBan);
            setTextForTextFiled(selectedIndex, 6, txtKieuDongCo);
            setTextForTextFiled(selectedIndex, 8, txtCongSuat);
            setTextForTextFiled(selectedIndex, 9, txtTrongTai);
        }
    }//GEN-LAST:event_tblPhuongTiensMouseClicked

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        String loaiPhuongTien, kieuDongCo, soChoNgoi, congSuat, trongTai;
        int stt = 0;
        // Xóa dữ liệu cũ trong model của table
        xoaDuLieuCuTrongModelTable();
        for (PhuongTienGiaoThong ptgt : phuongTiens) {
            if (ptgt.getHangSanXuat().equalsIgnoreCase(cboHangSanXuat.getSelectedItem().toString())) {
                loaiPhuongTien = kieuDongCo = soChoNgoi = congSuat = trongTai = "";
                stt++;
                if (ptgt instanceof OTo) {
                    OTo oTo = (OTo) ptgt;
                    loaiPhuongTien = "Ô tô";
                    kieuDongCo = oTo.getKieuDongCo();
                    soChoNgoi = Integer.toString(oTo.getSoChoNgoi());
                } else if (ptgt instanceof XeMay) {
                    XeMay xeMay = (XeMay) ptgt;
                    loaiPhuongTien = "Xe máy";
                    congSuat = Integer.toString(xeMay.getCongSuat());

                } else {
                    XeTai xeTai = (XeTai) ptgt;
                    loaiPhuongTien = "Xe tải";
                    trongTai = Double.toString(xeTai.getTrongTai());
                }
                // thực hiện thêm một dòng vào model của table
                mdTblPhuongTien.addRow(new Object[]{
                    Integer.toString(stt),
                    loaiPhuongTien,
                    ptgt.getHangSanXuat(),
                    Integer.toString(ptgt.getNamSanXuat()),
                    Double.toString(ptgt.getGiaBan()),
                    ptgt.getMau(),
                    kieuDongCo,
                    soChoNgoi,
                    congSuat,
                    trongTai,});
            }

        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnTimKiemGanDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemGanDungActionPerformed
        String loaiPhuongTien, kieuDongCo, soChoNgoi, congSuat, trongTai;
        int stt = 0;
        // Xóa dữ liệu cũ trong model của table
        xoaDuLieuCuTrongModelTable();
        for (PhuongTienGiaoThong ptgt : phuongTiens) {
            if (ptgt.getHangSanXuat().contains(txtTuKhoaTimKiem.getText().trim())) {
                loaiPhuongTien = kieuDongCo = soChoNgoi = congSuat = trongTai = "";
                stt++;
                if (ptgt instanceof OTo) {
                    OTo oTo = (OTo) ptgt;
                    loaiPhuongTien = "Ô tô";
                    kieuDongCo = oTo.getKieuDongCo();
                    soChoNgoi = Integer.toString(oTo.getSoChoNgoi());
                } else if (ptgt instanceof XeMay) {
                    XeMay xeMay = (XeMay) ptgt;
                    loaiPhuongTien = "Xe máy";
                    congSuat = Integer.toString(xeMay.getCongSuat());

                } else {
                    XeTai xeTai = (XeTai) ptgt;
                    loaiPhuongTien = "Xe tải";
                    trongTai = Double.toString(xeTai.getTrongTai());
                }
                // thực hiện thêm một dòng vào model của table
                mdTblPhuongTien.addRow(new Object[]{
                    Integer.toString(stt),
                    loaiPhuongTien,
                    ptgt.getHangSanXuat(),
                    Integer.toString(ptgt.getNamSanXuat()),
                    Double.toString(ptgt.getGiaBan()),
                    ptgt.getMau(),
                    kieuDongCo,
                    soChoNgoi,
                    congSuat,
                    trongTai,});
            }

        }
    }//GEN-LAST:event_btnTimKiemGanDungActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        cboLoaiPhuongTien.setSelectedIndex(0);
        cboHangSanXuat.setSelectedIndex(0);
        cboNamSanXuat.setSelectedIndex(0);
        txtGiaBan.setText("");
        cboMau.setSelectedIndex(0);
        cboSoChoNgoi.setSelectedIndex(0);
        txtKieuDongCo.setText("");
        txtTuKhoaTimKiem.setText("");
        txtTrongTai.setText("");
        txtCongSuat.setText("");
        
        loadDataIntoTable();
    }//GEN-LAST:event_btnResetActionPerformed
    // Nạp dữ liệu lại vào các cbo
    private void setSelectedItemsForCbo(int row, int col, JComboBox cbo) {
        String duLieuTaiODuocChon = mdTblPhuongTien.getValueAt(row, col).toString();
        // Duyệ qua tất cả các phần tử của cbo
        for (int i = 0; i < cbo.getItemCount(); i++) {
            // Nếu phần tử nap trùng với dữ liệu tại ô được chọn 
            if (cbo.getItemAt(i).toString().equalsIgnoreCase(duLieuTaiODuocChon)) {
                cbo.setSelectedIndex(i);// Thiết lập chọn                
                return;// Thoát khỏi hàm
            }
        }
    }

    // Nạp dữ liệu lại cho các text field
    private void setTextForTextFiled(int row, int col, JTextField tf) {
        String duLieuTaiODuocChon = mdTblPhuongTien.getValueAt(row, col).toString();
        tf.setText(duLieuTaiODuocChon);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuanLyPTGT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyPTGT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyPTGT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyPTGT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyPTGT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnTimKiemGanDung;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboHangSanXuat;
    private javax.swing.JComboBox<String> cboLoaiPhuongTien;
    private javax.swing.JComboBox<String> cboMau;
    private javax.swing.JComboBox<String> cboNamSanXuat;
    private javax.swing.JComboBox<String> cboSoChoNgoi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPhuongTiens;
    private javax.swing.JTextField txtCongSuat;
    private javax.swing.JTextField txtGiaBan;
    private javax.swing.JTextField txtKieuDongCo;
    private javax.swing.JTextField txtTrongTai;
    private javax.swing.JTextField txtTuKhoaTimKiem;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        // Lấy model hiện tại của tblPhuongTiens chứa các thành phần Header
        // Gán cho mdTblPhuongTien
        mdTblPhuongTien = (DefaultTableModel) tblPhuongTiens.getModel();
        //Thiết lập model cho table
        tblPhuongTiens.setModel(mdTblPhuongTien);

        //Khỏi tạo biến phuongTiens lưu giữ danh sách phương tiện
        phuongTiens = new ArrayList<>();

        //Thiệt lập các giá trị đảm bảo chỉ nhập được theo loại Ô tô tại thời điểm ban đầu
        txtCongSuat.setEnabled(false);
        txtTrongTai.setEnabled(false);
        // Nạp năm vào cboNamSanXuat
        loadNamSanXuat();

        // Thiết lập hiển thị cửa sổ chính giữa màn hình        
        setLocationRelativeTo(null);

    }

    private void loadDataIntoTable() {
        String loaiPhuongTien, kieuDongCo, soChoNgoi, congSuat, trongTai;
        int stt = 0;
        // Xóa dữ liệu cũ trong model của table
        xoaDuLieuCuTrongModelTable();
        for (PhuongTienGiaoThong ptgt : phuongTiens) {

            loaiPhuongTien = kieuDongCo = soChoNgoi = congSuat = trongTai = "";
            stt++;
            if (ptgt instanceof OTo) {
                OTo oTo = (OTo) ptgt;
                loaiPhuongTien = "Ô tô";
                kieuDongCo = oTo.getKieuDongCo();
                soChoNgoi = Integer.toString(oTo.getSoChoNgoi());
            } else if (ptgt instanceof XeMay) {
                XeMay xeMay = (XeMay) ptgt;
                loaiPhuongTien = "Xe máy";
                congSuat = Integer.toString(xeMay.getCongSuat());

            } else {
                XeTai xeTai = (XeTai) ptgt;
                loaiPhuongTien = "Xe tải";
                trongTai = Double.toString(xeTai.getTrongTai());
            }
            // thực hiện thêm một dòng vào model của table
            mdTblPhuongTien.addRow(new Object[]{
                Integer.toString(stt),
                loaiPhuongTien,
                ptgt.getHangSanXuat(),
                Integer.toString(ptgt.getNamSanXuat()),
                Double.toString(ptgt.getGiaBan()),
                ptgt.getMau(),
                kieuDongCo,
                soChoNgoi,
                congSuat,
                trongTai,});
        }
    }

    private void xoaDuLieuCuTrongModelTable() {
        while (mdTblPhuongTien.getRowCount() > 0) {
            mdTblPhuongTien.removeRow(0);

        }
    }

    private void loadNamSanXuat() {
        int namHienTai = Calendar.getInstance().get(Calendar.YEAR);
        for (int i = namHienTai; i >= 1920; i--) {
            ((DefaultComboBoxModel) cboNamSanXuat.getModel()).addElement(Integer.toString(i));
        }
    }
}
