package com.haruple97.intent_opensource;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        String sub_text;
        int sub_number;

        Intent intent = getIntent();
        sub_text = intent.getStringExtra("문자");
        sub_number = intent.getIntExtra("숫자", 0);

        System.out.println("문자 테스트 :" + sub_text);
        System.out.println("숫자 테스트 :" + sub_number);

    }

}
