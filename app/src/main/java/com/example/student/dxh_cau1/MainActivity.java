package com.example.student.dxh_cau1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText edtTaiKhoan,edtMatKhau;
TextView txtThongBao;
CheckBox checkBoxLuuThongTin;
Button buttonDangNhap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtTaiKhoan=findViewById(R.id.edtTaiKhoan);
        edtMatKhau=findViewById(R.id.edtMatKhau);
        txtThongBao=findViewById(R.id.txtThongBao);
        checkBoxLuuThongTin=findViewById(R.id.checkBoxLuuThongTin);
        buttonDangNhap=findViewById(R.id.buttonDangNhap);

        buttonDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBoxLuuThongTin.isChecked()){
                    txtThongBao.setText("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu");
                }
               else {
                    txtThongBao.setText("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu");
                }
            }
        });

    }
}
