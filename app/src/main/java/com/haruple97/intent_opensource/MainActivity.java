package com.haruple97.intent_opensource;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //변수 선언
        Button subActivity_btn = (Button)findViewById(R.id.subActivity_btn);
        String main_text = "글자네";
        int main_number = 250;

        //intent로 SubActivity로 값 전달
        Intent intent = new Intent(MainActivity.this, SubActivity.class);
        intent.putExtra("문자", main_text); //'문자'라는 이름으로 main_text 전달
        intent.putExtra("숫자", main_number); // '숫자'라는 이름으로 main_number 전달

        //버튼 클릭 시 SubActivity로 이동
        subActivity_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
    }
}