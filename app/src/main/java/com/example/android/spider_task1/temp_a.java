package com.example.android.spider_task1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by abhishek on 6/27/2017.
 */

public class temp_a extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.temp_a);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String x = bundle.getString("ToPrint");
            TextView t = (TextView) findViewById(R.id.textView1);
            t.setText(x);
        }

    }
}
