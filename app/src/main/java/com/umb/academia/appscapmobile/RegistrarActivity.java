package com.umb.academia.appscapmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class RegistrarActivity extends AppCompatActivity {

    private EditText txtEmail, txtNombres, txtApellidos, txtNit, txtTelefono, txtPassword;
    private RadioButton rbMasculino, rbFemenino;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);
        txtEmail = (EditText) findViewById(R.id.emailIdRegistro);
        txtNombres = (EditText) findViewById(R.id.nombresIdRegistro);
        txtApellidos = (EditText) findViewById(R.id.apellidosIdRegistro);
        txtNit = (EditText) findViewById(R.id.nitId);
        txtTelefono = (EditText) findViewById(R.id.phoneId);
        txtPassword = (EditText) findViewById(R.id.pswId);
        rbMasculino = (RadioButton) findViewById(R.id.masculinoId);
        rbFemenino = (RadioButton) findViewById(R.id.femeninoId);
    }

    public void cancel(View view){
        Intent start = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(start);
    }

    public void save(View view){
        Intent confirm = new Intent(getApplicationContext(),ConfirmarActivity.class);
        confirm.putExtra("cEmail", txtEmail.getText().toString().trim());
        confirm.putExtra("cNombres", txtNombres.getText().toString().trim());
        confirm.putExtra("cApellidos", txtApellidos.getText().toString().trim());
        confirm.putExtra("cNit", txtNit.getText().toString().trim());
        startActivity(confirm);
    }
}