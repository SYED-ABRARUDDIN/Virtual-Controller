package com.example.joystick;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import com.google.android.material.slider.Slider;

import io.github.controlwear.virtual.joystick.android.JoystickView;
import static com.example.joystick.IP_ADRESS.text;
public class MainActivity extends AppCompatActivity {

    WebView mweb;
    Button PAD_UP,PAD_LEFT,PAD_RIGHT,PAD_DOWN,SQUARE,CIRCLE,TRIANGLE,CROSS,B15,B16,B17,B18,B19;
    TextView Command;
    SeekBar sliderLeft,sliderRight;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mweb=findViewById(R.id.web);
        Command=findViewById(R.id.command);
        sliderLeft=findViewById(R.id.sliderleft);
        sliderRight=findViewById(R.id.sliderright);
        PAD_UP=findViewById(R.id.button1);
        PAD_LEFT=findViewById(R.id.button2);
        PAD_RIGHT=findViewById(R.id.button3);
        PAD_DOWN=findViewById(R.id.button4);
        TRIANGLE=findViewById(R.id.button5);
        SQUARE=findViewById(R.id.button6);
        CIRCLE=findViewById(R.id.button7);
        CROSS=findViewById(R.id.button8);
        B15=findViewById(R.id.button15);
        B16=findViewById(R.id.button16);
        B17=findViewById(R.id.button17);
        B18=findViewById(R.id.button18);
        B19=findViewById(R.id.button19);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        WebSettings webSettings=mweb.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mweb.setVisibility(View.GONE);



        JoystickView joystickLeft = (JoystickView) findViewById(R.id.joystickView_left);
        joystickLeft.setOnMoveListener(new JoystickView.OnMoveListener() {
            @Override
            public void onMove(int angle, int strength) {
                mweb.loadUrl("http://"+text+"/"+"jla"+angle+"jls"+strength);
            }
        }, 25);



        final JoystickView joystickRight = (JoystickView) findViewById(R.id.joystickView_right);
        joystickRight.setOnMoveListener(new JoystickView.OnMoveListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onMove(int angle, int strength) {
                mweb.loadUrl("http://"+text+"/"+"jra"+angle+"jls"+strength);
            }
        });

Command.setText(text);
       PAD_UP.setOnTouchListener(new View.OnTouchListener()
        {

            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    PAD_UP.setBackgroundColor(Color.GREEN);
                    mweb.loadUrl("http://"+text+"/"+"pad_up"+1);
                }

                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    PAD_UP.setBackgroundColor(Color.RED);
                    mweb.loadUrl("http://" + text + "/" + "pad_up" + 0);
                }
                // TODO Auto-generated method stub
                return false;
            }
        });


        PAD_DOWN.setOnTouchListener(new View.OnTouchListener()
        {

            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    PAD_DOWN.setBackgroundColor(Color.GREEN);
                    mweb.loadUrl("http://"+text+"/"+"pad_down"+1);
                }

                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    PAD_DOWN.setBackgroundColor(Color.RED);
                    mweb.loadUrl("http://" + text + "/" + "pad_down" + 0);
                }
                // TODO Auto-generated method stub
                return false;
            }
        });


        PAD_RIGHT.setOnTouchListener(new View.OnTouchListener()
        {

            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    PAD_RIGHT.setBackgroundColor(Color.GREEN);
                    mweb.loadUrl("http://"+text+"/"+"pad_right"+1);
                }

                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    PAD_RIGHT.setBackgroundColor(Color.RED);
                    mweb.loadUrl("http://" + text + "/" + "pad_right" + 0);
                }
                // TODO Auto-generated method stub
                return false;
            }
        });



        PAD_LEFT.setOnTouchListener(new View.OnTouchListener()
        {

            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    PAD_LEFT.setBackgroundColor(Color.GREEN);
                    mweb.loadUrl("http://"+text+"/"+"pad_left"+1);
                }

                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    PAD_LEFT.setBackgroundColor(Color.RED);
                    mweb.loadUrl("http://" + text + "/" + "pad_left" + 0);
                }
                // TODO Auto-generated method stub
                return false;
            }
        });



       TRIANGLE.setOnTouchListener(new View.OnTouchListener()
        {

            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                   TRIANGLE.setBackgroundColor(Color.GREEN);
                    mweb.loadUrl("http://"+text+"/"+"triange"+1);
                }

                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    TRIANGLE.setBackgroundColor(Color.RED);
                    mweb.loadUrl("http://" + text + "/" + "riangle" + 0);
                }
                // TODO Auto-generated method stub
                return false;
            }
        });


        SQUARE.setOnTouchListener(new View.OnTouchListener()
        {

            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    SQUARE.setBackgroundColor(Color.GREEN);
                    mweb.loadUrl("http://"+text+"/"+"square"+1);
                }

                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    SQUARE.setBackgroundColor(Color.RED);
                  mweb.loadUrl("http://" + text + "/" + "square" + 0);
                }
                // TODO Auto-generated method stub
                return false;
            }
        });

        SQUARE.setOnTouchListener(new View.OnTouchListener()
        {

            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    SQUARE.setBackgroundColor(Color.GREEN);
                    mweb.loadUrl("http://"+text+"/"+"square"+1);
                }

                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    SQUARE.setBackgroundColor(Color.RED);
                    mweb.loadUrl("http://" + text + "/" + "square" + 0);
                }
                // TODO Auto-generated method stub
                return false;
            }
        });



        CIRCLE.setOnTouchListener(new View.OnTouchListener()
        {

            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    CIRCLE.setBackgroundColor(Color.GREEN);
                    mweb.loadUrl("http://"+text+"/"+"circle"+1);
                }

                else if (event.getAction() == MotionEvent.ACTION_UP) {
                   CIRCLE.setBackgroundColor(Color.RED);
                    mweb.loadUrl("http://" + text + "/" + "circle" + 0);
                }
                // TODO Auto-generated method stub
                return false;
            }
        });


       CROSS.setOnTouchListener(new View.OnTouchListener()
        {

            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                   CROSS.setBackgroundColor(Color.GREEN);
                    mweb.loadUrl("http://"+text+"/"+"cross"+1);
                }

                else if (event.getAction() == MotionEvent.ACTION_UP) {
                   CROSS.setBackgroundColor(Color.RED);
                    mweb.loadUrl("http://" + text + "/" + "cross" + 0);
                }
                // TODO Auto-generated method stub
                return false;
            }
        });



       B15.setOnTouchListener(new View.OnTouchListener()
        {

            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                   B15.setBackgroundColor(Color.GREEN);
                    mweb.loadUrl("http://"+text+"/"+"b15"+1);
                }

                else if (event.getAction() == MotionEvent.ACTION_UP) {
                   B15.setBackgroundColor(Color.RED);
                    mweb.loadUrl("http://" + text + "/" + "b15" + 0);
                }
                // TODO Auto-generated method stub
                return false;
            }
        });

        B16.setOnTouchListener(new View.OnTouchListener()
        {

            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    B16.setBackgroundColor(Color.GREEN);
                    mweb.loadUrl("http://"+text+"/"+"b16"+1);
                }

                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    B16.setBackgroundColor(Color.RED);
                    mweb.loadUrl("http://" + text + "/" + "b17" + 0);
                }
                // TODO Auto-generated method stub
                return false;
            }
        });


        B17.setOnTouchListener(new View.OnTouchListener()
        {

            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    B17.setBackgroundColor(Color.GREEN);
                    mweb.loadUrl("http://"+text+"/"+"b17"+1);
                }

                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    B17.setBackgroundColor(Color.RED);
                    mweb.loadUrl("http://" + text + "/" + "b17" + 0);
                }
                // TODO Auto-generated method stub
                return false;
            }
        });



        B18.setOnTouchListener(new View.OnTouchListener()
        {

            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    B18.setBackgroundColor(Color.GREEN);
                    mweb.loadUrl("http://"+text+"/"+"b18"+1);
                }

                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    B18.setBackgroundColor(Color.RED);
                    mweb.loadUrl("http://" + text + "/" + "b18" + 0);
                }
                // TODO Auto-generated method stub
                return false;
            }
        });


        B19.setOnTouchListener(new View.OnTouchListener()
        {

            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    B19.setBackgroundColor(Color.GREEN);
                    mweb.loadUrl("http://"+text+"/"+"b19"+1);
                }

                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    B19.setBackgroundColor(Color.RED);
                    mweb.loadUrl("http://" + text + "/" + "b19" + 0);
                }
                // TODO Auto-generated method stub
                return false;
            }
        });



        sliderLeft.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mweb.loadUrl("http://"+text+"/"+"sliderleft"+progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }

        });
        sliderRight.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mweb.loadUrl("http://"+text+"/"+"sliderRight"+progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }

        });



    }

}
    /* mTextViewCoordinateRight.setText(
             String.format("x%03d:y%03d",
             joystickRight.getNormalizedX(),
             joystickRight.getNormalizedY())
             );*/