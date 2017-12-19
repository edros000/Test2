package com.example.idros.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView t1,t2,t3,t4,t5,t6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t1=(TextView)findViewById(R.id.textView1);
        t2=(TextView)findViewById(R.id.textView2);
        t3=(TextView)findViewById(R.id.textView3);
        t4=(TextView)findViewById(R.id.textView4);
        t5=(TextView)findViewById(R.id.textView5);
        t6=(TextView)findViewById(R.id.textView6);
        t1.setText(getIntent().getStringExtra("name"));
        t2.setText(getIntent().getStringExtra("lastName"));
        t3.setText(getIntent().getStringExtra("Email"));
        t4.setText(getIntent().getStringExtra("phone"));
        t5.setText(getIntent().getStringExtra("username"));
        t6.setText(getIntent().getStringExtra("passwd"));



    }
}
