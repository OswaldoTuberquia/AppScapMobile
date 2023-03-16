package com.umb.academia.appscapmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ConfirmarActivity extends AppCompatActivity {

    private TextView txtConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar);

        txtConfirm = (TextView)findViewById(R.id.lbResult);

        Intent receiver = getIntent();
        String email = receiver.getStringExtra("cEmail");
        String nombres = receiver.getStringExtra("cNombres");
        String apellidos = receiver.getStringExtra("cApellidos");
        String nit = receiver.getStringExtra("cNit");

        String result = "Se Registro el usuario con email: " + email + ", Nombres: " + nombres + " " + apellidos + ", para la empresa con Nit: " + nit;
        txtConfirm.setText(result);
    }

    public void backHome(View view){
        Intent back = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(back);
    }
}