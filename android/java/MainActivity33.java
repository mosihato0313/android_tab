package com.example.study;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity33 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickButton01(View view) {
        RadioGroup rg = this.findViewById(R.id.radioGroup2);

        RadioButton rb =  rg.findViewById(rg.getCheckedRadioButtonId());

        String rbStr = rb.getText().toString();

        Intent intent = new Intent();

        intent.setClassName("com.example.study","com.example.study.Main2Activity");

        intent.putExtra("RadioStr", rbStr);

        startActivity(intent);
    }
}
