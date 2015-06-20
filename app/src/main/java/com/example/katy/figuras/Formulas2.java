package com.example.katy.figuras;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;


public class Formulas2 extends Activity {
    private EditText lado, lado1;
    ImageButton cuadrado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulas2);


    }

    public void mostrarcua(View s) {

        lado = (EditText) findViewById(R.id.lado);
        lado1 = (EditText) findViewById(R.id.lado1);


    }

    public void areaCua(View d) {
        mostrarcua(d);
        String v1 = lado.getText().toString();
        String v2 = lado1.getText().toString();
        int va1 = Integer.parseInt(v1);
        int va2 = Integer.parseInt(v2);
        int area = va1 * va2;
        String resu = String.valueOf(area);
        Toast.makeText(getBaseContext(), "El area del Cuadrado es: " + resu, Toast.LENGTH_SHORT).show();

    }

    public void regresar(View d) {
        this.onStop();
        this.onDestroy();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}