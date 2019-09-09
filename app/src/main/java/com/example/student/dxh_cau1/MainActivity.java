package com.example.student.dxh_cau1;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    AlertDialog.Builder dialog;
EditText edtTaiKhoan,edtMatKhau;
TextView txtThongBao;
CheckBox checkBoxLuuThongTin;
Button buttonDangNhap,buttonThoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtTaiKhoan=findViewById(R.id.edtTaiKhoan);
        edtMatKhau=findViewById(R.id.edtMatKhau);
        txtThongBao=findViewById(R.id.txtThongBao);
        checkBoxLuuThongTin=findViewById(R.id.checkBoxLuuThongTin);
        buttonThoat=findViewById(R.id.buttonThoat);
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

        buttonThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });

    }
    public void showDialog() {
        dialog = new AlertDialog.Builder(MainActivity.this);
        dialog.setTitle("Thông Báo");
        dialog.setMessage("Ban co muon thoat khong?");

        dialog.setNegativeButton("Có", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });

        dialog.setPositiveButton("Không", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        //dialog.setContentView(R.layout.dialog);
        dialog.show();
    }
}
