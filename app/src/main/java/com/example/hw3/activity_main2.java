//package com.example.hw3;
//
//import android.content.Intent;
//import android.graphics.Color;
//import android.os.Bundle;
//import android.widget.Button;
//import android.widget.ImageView;
//import android.widget.TextView;
//import androidx.appcompat.app.AppCompatActivity;
//
//public class ResultActivity extends AppCompatActivity {
//
//    boolean isFavorited = false;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity2_main);
//
//        TextView resultText = findViewById(R.id.resultText);
//        ImageView heartIcon = findViewById(R.id.heartIcon);
//        Button nextBtn = findViewById(R.id.nextBtn);
//
//        // Получение результата из Intent
//        String result = getIntent().getStringExtra("result");
//        resultText.setText(result);
//
//
//        heartIcon.setOnClickListener(v -> {
//            isFavorited = !isFavorited;
//            if (isFavorited) {
//                heartIcon.setColorFilter(Color.RED);
//            } else {
//                heartIcon.setColorFilter(Color.GRAY);
//            }
//        });
//    }
//}