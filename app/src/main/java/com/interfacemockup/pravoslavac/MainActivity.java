package com.interfacemockup.pravoslavac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton openKalendarBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnOpenKalBtn();

    }


    public void addListenerOnOpenKalBtn(){

        openKalendarBtn = (ImageButton)findViewById(R.id.id_kalend_Btn);
        openKalendarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), Kalendar_12_meseci.class);
                startActivity(i);

            }
        });

    }







}
