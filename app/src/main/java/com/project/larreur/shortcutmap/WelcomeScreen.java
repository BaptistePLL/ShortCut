package com.project.larreur.shortcutmap;

/**
 * Created by larre on 07/12/2017.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeScreen extends AppCompatActivity {

    public Button button3;
    public Button button4;
    public void init(){
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mapsActivity= new Intent(WelcomeScreen.this,MapsActivity.class);
                startActivity(mapsActivity);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent mapsActivity2= new Intent(WelcomeScreen.this,MapsActivity2.class);
            startActivity(mapsActivity2);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_activity);
        init();
    }
}