package com.loubinfeng.www.vectordemo;

import android.graphics.drawable.Animatable;
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

    public void handleDownloadAnim(View v) {
        Log.i("info","handleDownloadAnim");
        ImageView imageView = (ImageView) v;
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable)
            ((Animatable)drawable).start();
    }
}
