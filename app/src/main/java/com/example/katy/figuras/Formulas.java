package com.example.katy.figuras;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;


public class Formulas extends Activity {
    private EditText base,altura;
    ImageButton triangulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulas);
    }
    public void mostrartrian(View s){
        base=(EditText)findViewById(R.id.lado);
        altura=(EditText)findViewById(R.id.altura);
    }
    public void areatrian(View d){
        mostrartrian(d);
        String v1=base.getText().toString();
        String v2=altura.getText().toString();
        int va1=Integer.parseInt(v1);
        int va2=Integer.parseInt(v2);
        float area=(va1*va2)/2;
        String resu=String.valueOf(area);
        Toast.makeText(getBaseContext(),"El area del Triangulo es: "+resu, Toast.LENGTH_SHORT).show();
    }

    public void regresar(View d){
        this.onStop();
        this.onDestroy();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}
