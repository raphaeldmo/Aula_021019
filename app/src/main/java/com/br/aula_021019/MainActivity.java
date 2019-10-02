package com.br.aula_021019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout linearLayout = findViewById(R.id.linearAndroid);

        int j=1;

        for(int i=0; i<200; i++){
            TextView tv = new TextView(this);
            tv.setText("Minhas ScrollView" + (new Integer(i).toString()));
            if(i%2==0){
                j++;
            }
            tv.setTextSize(j);

            tv.setGravity(Gravity.CENTER);
            linearLayout.addView(tv);
        }

    }
}
