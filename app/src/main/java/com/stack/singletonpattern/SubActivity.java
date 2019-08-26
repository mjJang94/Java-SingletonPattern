package com.stack.singletonpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.stack.singletonpattern.mng.SingletonMng;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        SingletonMng.getInstance().setStrTestData("저장된 데이터");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
