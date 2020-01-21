package com.example.study;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class graph extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.graph);
        final RadioButton button1 = findViewById(R.id.radio_home);
        button1.setOnClickListener(this);

        final RadioButton button2 = findViewById(R.id.radio_list);
        button2.setOnClickListener(this);

        final RadioButton button3 = findViewById(R.id.radio_input);
        button3.setOnClickListener(this);

        final RadioButton button4 = findViewById(R.id.radio_calender);
        button4.setOnClickListener(this);

        final RadioButton button5 = findViewById(R.id.radio_graph);
        button5.setOnClickListener(this);

    }
    public void onClick(View view){
        if(view.getId() == R.id.radio_home) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        else if(view.getId() == R.id.radio_list) {
            Intent intent = new Intent(this, Main2Activity.class);
            startActivity(intent);
        }
        else if(view.getId() == R.id.radio_input) {
            Intent intent = new Intent(this, input.class);
            startActivity(intent);
        }
        else if(view.getId() == R.id.radio_calender) {
            Intent intent = new Intent(this, calender.class);
            startActivity(intent);
        }
        else if(view.getId() == R.id.radio_graph) {
            Intent intent = new Intent(this, graph.class);
            startActivity(intent);
        }
    }
}
