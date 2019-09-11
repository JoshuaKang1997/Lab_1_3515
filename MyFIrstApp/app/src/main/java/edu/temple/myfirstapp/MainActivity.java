package edu.temple.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.clickButton);

        button.setOnClickListener(new View.OnClickListener()) {
            @Override
                    public void onClick(View v) {
                Toast.makeText( context:MainActivity.this, text:)
            }
        }
}
