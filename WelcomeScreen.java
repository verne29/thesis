package com.tlequoise.homesecuritysystem;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.widget.ImageButton;

public class WelcomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);

        final ImageButton button = (ImageButton) findViewById(R.id.details_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v == button) {
                    button.setImageResource(R.drawable.img2nd);
                }
                Intent i = new Intent(WelcomeScreen.this, HomeScreen.class);
                startActivity(i);
            }
        });
    }
}
