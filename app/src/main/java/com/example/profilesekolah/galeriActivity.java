package com.example.profilesekolah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

public class galeriActivity extends AppCompatActivity {
    ViewFlipper viewFlipper;
     Animation fadein,fadeout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeri);

        viewFlipper =(ViewFlipper) findViewById(R.id.ViewFlipper);
        fadein = AnimationUtils.loadAnimation(this,R.anim.fade_in);
        fadeout=AnimationUtils.loadAnimation(this,R.anim.fade_out);

        viewFlipper.setInAnimation(fadein);
        viewFlipper.setOutAnimation(fadein);

        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(5000);
        viewFlipper.startFlipping();
    }

    public void kegiatanpmr(View view) {
        Intent intent = new Intent(galeriActivity.this, albumpmrActivity.class);
        startActivity(intent);
    }

    public void kegiatanpramuka(View view) {
        Intent intent = new Intent(galeriActivity.this, albumpramukaActivity.class);
        startActivity(intent);
    }

    public void kegiatanhutri(View view) {
        Intent intent = new Intent(galeriActivity.this, albumhutriActivity.class);
        startActivity(intent);
    }
}