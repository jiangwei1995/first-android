package com.example.jiangwei.test;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.adaf);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView a = (TextView)findViewById(R.id.aaa);
                a.setText("蒋伟");
            }
        });
    }
}
