package com.example.activityandintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Button change;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView text= (TextView) findViewById(R.id.sho_txt);
        change=(Button) findViewById(R.id.btn_change);
        Button   next=(Button) findViewById(R.id.btn_next2);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next=new Intent(MainActivity.this,Next.class);
                startActivity(next);
            }
        });

        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,Another.class);
                startActivity(intent);
            }
        });
    }
}
