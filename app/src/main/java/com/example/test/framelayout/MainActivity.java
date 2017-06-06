package com.example.test.framelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button i1,i2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i1 = (Button) findViewById(R.id.button);
        i2 = (Button) findViewById(R.id.button2);
        i1.setOnClickListener(this);
        i2.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button){
            i1.setVisibility(View.GONE);
            i2.setVisibility(View.VISIBLE);
        }
        else{
            i2.setVisibility(View.GONE);
            i1.setVisibility(View.VISIBLE);
        }

    }
}
