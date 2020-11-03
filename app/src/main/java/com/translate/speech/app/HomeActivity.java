package com.translate.speech.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    private Button btnEnglish,btnJapanese,btnChinese,btnKorean,btnGerman,btnItalian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnEnglish=findViewById(R.id.btn_english);
        btnJapanese=findViewById(R.id.btn_japanese);
        btnChinese=findViewById(R.id.btn_chinese);
        btnKorean=findViewById(R.id.btn_korean);
        btnGerman=findViewById(R.id.btn_german);
        btnItalian=findViewById(R.id.btn_italian);

        btnEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(HomeActivity.this,MainActivity.class);
                startActivity(intent);

                Toast.makeText(HomeActivity.this, "English", Toast.LENGTH_SHORT).show();

            }
        });
        btnJapanese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(HomeActivity.this,JapaneseActivity.class);
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Japanese", Toast.LENGTH_SHORT).show();
            }
        });
        btnChinese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(HomeActivity.this,ChineseActivity.class);
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Chinese", Toast.LENGTH_SHORT).show();
            }
        });
        btnKorean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(HomeActivity.this,KoreanActivity.class);
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Korean", Toast.LENGTH_SHORT).show();
            }
        });
        btnGerman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(HomeActivity.this,GermanActivity.class);
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "German", Toast.LENGTH_SHORT).show();
            }
        });
        btnItalian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(HomeActivity.this,ItalianActivity.class);
                startActivity(intent);

                Toast.makeText(HomeActivity.this, "Italian", Toast.LENGTH_SHORT).show();
            }
        });





    }
}
