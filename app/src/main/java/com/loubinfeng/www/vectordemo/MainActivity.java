package com.loubinfeng.www.vectordemo;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleAnim(View v) {
        Log.i("info","handleDownloadAnim");
        ImageView imageView = (ImageView) v;
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable)
            ((Animatable)drawable).start();
    }

    public void handlePathDataAnim(View v){
        ImageView imageView = (ImageView) v;
        AnimatedVectorDrawable drawable = (AnimatedVectorDrawable)getDrawable(R.drawable.checkbox_anim);
        if (drawable != null){
            imageView.setImageDrawable(drawable);
            drawable.start();
        }
    }
}
