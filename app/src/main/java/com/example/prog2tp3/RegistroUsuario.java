package com.example.prog2tp3;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegistroUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registro_usuario);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void RegistrarUsuario(View view) {
        EditText et_name = (EditText) findViewById(R.id.editTextNombre);
        EditText et_email = (EditText) findViewById(R.id.editTextEmail);
        EditText et_pass = (EditText) findViewById(R.id.editTextPass);
        EditText et_pass2 = (EditText) findViewById(R.id.editTextPass2);

        String name = et_name.getText().toString();
        String email = et_email.getText().toString();
        String pass = et_pass.getText().toString();
        String pass2 = et_pass2.getText().toString();

        if (!name.isEmpty() && !email.isEmpty() && !pass.isEmpty() && !pass2.isEmpty()) {
            if (pass.equals(pass2)) {

                //Buscaria en la base de datos si el usuario ya existe, mediante su email

                //Codigo SQL para realizar la consulta.....

                /*
                if (LaConsultaSQLDevuelveUnUsuario) {
                    Toast.makeText(this, "El usuario ya existe", Toast.LENGTH_SHORT).show();

                } else {
                    //Si las contraseñas coinciden, y el email no existe, se registra el usuario
                }
                */


            } else {
                Toast.makeText(this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show();
            }

        } else {
            Toast.makeText(this, "Debes llenar todos lo campos", Toast.LENGTH_SHORT).show();
        }

    }

    public void LoginActivity(View view) {
        //Devuelve a la pantalla de LogIn (En este caso, MainActivity
        setContentView(R.layout.activity_main);
    }
}