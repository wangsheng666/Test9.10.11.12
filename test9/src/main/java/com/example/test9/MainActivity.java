package com.example.test9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button) findViewById(R.id.start);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent=new Intent(MainActivity.this,AnotherActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
