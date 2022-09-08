package ru.synergy.xml_learning;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        TextView textView = (TextView) findViewById(R.id.header);

        textView.setText("Hello from Java");
    }
}