package com.example.idros.test;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2,et3,et4,et5,et6;
    Button register;
    MediaPlayer click;
    String check1,check2,check3,check4,check5,check6;
    MyAlertDialog objAlertdialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText) findViewById(R.id.editTex1);
        et2=(EditText) findViewById(R.id.editText2);
        et3=(EditText)findViewById(R.id.editText3);
        et4=(EditText)findViewById(R.id.editText4);
        et5=(EditText)findViewById(R.id.editText5);
        et6=(EditText)findViewById(R.id.editText6);
        register=(Button)findViewById(R.id.button);
        click=MediaPlayer.create(this,R.raw.phonton2);


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click.start();
                try {
                    check1=et1.getText().toString().trim();
                    check2=et2.getText().toString().trim();
                    check3=et3.getText().toString().trim();
                    check4=et4.getText().toString().trim();
                    check5=et5.getText().toString().trim();
                    check6=et6.getText().toString().trim();

                    if(check1.equals("")||check2.equals("")||check3.equals("")||check4.equals("")||check5.equals("")||check6.equals("")){
                        objAlertdialog = new MyAlertDialog();
                        objAlertdialog.Havespace(MainActivity.this);}

                    else {
                        Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                        intent.putExtra("name",et1.getText().toString());
                        intent.putExtra("lastName",et2.getText().toString());
                        intent.putExtra("Email",et3.getText().toString());
                        intent.putExtra("phone",et4.getText().toString());
                        intent.putExtra("username",et5.getText().toString());
                        intent.putExtra("passwd",et6.getText().toString());
                        startActivity(intent);}
                }catch (Exception e){}

            }
        });

    }
}
