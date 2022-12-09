package com.example.myapplication;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.ImageWriter;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   }

    public void Boton1(View view) {
        Intent Boton1 = new Intent(this,SegundoActivity.class);
        startActivity(Boton1);
    }
    public void Boton2(View view) {
        Intent Boton2 = new Intent(this,SegundoActivity.class);
        startActivity(Boton2);
    }
    public void Boton3(View view) {
        Intent Boton3 = new Intent(this,SegundoActivity.class);
        startActivity(Boton3);
    }
    public void Boton4(View view) {
        Intent Boton4 = new Intent(this,SegundoActivity.class);
        startActivity(Boton4);
    }
    public void Boton5(View view) {
        Intent Boton5 = new Intent(this,SegundoActivity.class);
        startActivity(Boton5);
    }
    public void Boton6(View view) {
        Intent Boton6 = new Intent(this,SegundoActivity.class);
        startActivity(Boton6);
    }
    public void Boton7(View view) {
        Intent Boton7 = new Intent(this,SegundoActivity.class);
        startActivity(Boton7);
    }
}


