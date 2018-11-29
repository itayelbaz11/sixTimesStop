package com.example.itay.sixtimesstop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btn;
int x=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= (Button) findViewById(R.id.btn);
    }

    public void btn(View view) {
        if(x<7) {
        btn.setText(""+x);
        x++;}
        else{btn.setText("start again");
             x=1;
        }
    }
}
