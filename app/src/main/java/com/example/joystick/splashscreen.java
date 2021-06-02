package com.example.joystick;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.EditText;

import com.daimajia.androidanimations.library.Techniques;
import com.viksaa.sssplash.lib.activity.AwesomeSplash;
import com.viksaa.sssplash.lib.cnst.Flags;
import com.viksaa.sssplash.lib.model.ConfigSplash;

public class splashscreen extends AwesomeSplash {

    @Override
    public void initSplash(ConfigSplash configSplash) {

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        configSplash.setBackgroundColor(R.color.teal_700);
         configSplash.setAnimCircularRevealDuration(2000);
         configSplash.setRevealFlagX(Flags.REVEAL_LEFT);
         configSplash.setRevealFlagX(Flags.REVEAL_BOTTOM);


        configSplash.setLogoSplash(R.drawable.trmlogoredu1);
        configSplash.setOriginalHeight(400); //in relation to your svg (path) resource
        configSplash.setOriginalWidth(400);//or any other drawable
        configSplash.setAnimLogoSplashDuration(2000); //int ms
        configSplash.setAnimLogoSplashTechnique(Techniques.FadeIn);


         configSplash.setTitleSplash("VIRTUAL JOYSTICK");
         configSplash.setTitleTextColor(R.color.black);
         configSplash.setTitleTextSize(25f);
         configSplash.setAnimTitleDuration(1000);
         configSplash.setAnimTitleTechnique(Techniques.FadeIn);




    }

    @Override
    public void animationsFinished() {


 startActivity(new Intent(splashscreen.this,IP_ADRESS.class));
        finish();

    }
}