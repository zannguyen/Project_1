public class frmNhan {
    private JTextField txtSo1, txtSo2, txtKetQua;
    private JButton btnTinh;

    public frmNhan() {
        setTitle("Phép nhân hai số");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 5, 5));

        // Tạo các thành phần giao diện
        add(new JLabel("Số thứ nhất:"));
        txtSo1 = new JTextField();
        add(txtSo1);

        add(new JLabel("Số thứ hai:"));
        txtSo2 = new JTextField();
        add(txtSo2);

        add(new JLabel("Kết quả:"));
        txtKetQua = new JTextField();
        txtKetQua.setEditable(false);
        add(txtKetQua);

        btnTinh = new JButton("Tính tích");
        add(btnTinh);

        // Thêm sự kiện cho nút
        btnTinh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double so1 = Double.parseDouble(txtSo1.getText());
                    double so2 = Double.parseDouble(txtSo2.getText());
                    double ketQua = so1 * so2;
                    txtKetQua.setText(String.valueOf(ketQua));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frmNhan.this,
                        "Vui lòng nhập số hợp lệ!",
                        "Lỗi nhập liệu",
                        JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new frmNhan().setVisible(true);
        });
    }
}
