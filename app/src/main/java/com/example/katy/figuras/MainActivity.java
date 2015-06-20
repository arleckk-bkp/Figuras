package com.example.katy.figuras;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;



public class MainActivity extends Activity  {
    ImageButton cuadrado, triangulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
public void areaC(View v){
    Intent act1= new Intent(this,Formulas2.class);
        ImageButton cua = (ImageButton)findViewById(R.id.cuadrado);
        startActivity(act1);
    }
    public void areaT(View v){
        Intent act2= new Intent(this,Formulas.class);
        ImageButton tria = (ImageButton)findViewById(R.id.triangulo);
        startActivity(act2);
    }
}