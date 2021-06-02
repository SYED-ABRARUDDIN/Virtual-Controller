package com.example.joystick;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class IP_ADRESS extends AppCompatActivity {
Button button;
EditText editText;
    public static String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_i_p__a_d_r_e_s_s);
        button=findViewById(R.id.button);
        editText=findViewById(R.id.editTextTextPersonName2);

        button.setBackgroundColor(Color.GRAY);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=editText.getText().toString();
                Intent ht1= new Intent(IP_ADRESS.this,MainActivity.class);
                startActivity(ht1);
                finish();

            }
        });
    }
}