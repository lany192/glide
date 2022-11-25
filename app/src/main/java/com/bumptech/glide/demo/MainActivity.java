package com.bumptech.glide.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.image);
        Glide.with(this)
                .load(R.mipmap.test)
                .into(imageView);

        ImageView imageView2 = findViewById(R.id.image2);
        Glide.with(this)
                .load("http://pic1.win4000.com/wallpaper/2018-11-16/5bee2abe686a6.jpg")
                .into(imageView2);

        ImageView imageView3 = findViewById(R.id.image3);
        Glide.with(this)
                .load("https://img.zcool.cn/community/01639c586c91bba801219c77f6efc8.gif")
                .into(imageView3);
    }
}