package com.aasthajain.dhvani;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Homepage extends AppCompatActivity {
    Button daily,leisure;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        Button daily=(Button)findViewById(R.id.Daily);
        Button leisure=(Button)findViewById(R.id.Leisure);
        daily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Homepage.this,Daily_Activity.class);
                        startActivity(in);

            }
        });

        leisure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Homepage.this,Leisure_Activity.class);
                startActivity(intent);

                //code here
            }
        });

    }
}
