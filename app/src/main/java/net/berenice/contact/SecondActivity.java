package net.berenice.contact;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.io.Serializable;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    EditText nombre,email,twitter, telefono, fechanac;
    Button btnguar;
    Intent i;
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        btnguar = findViewById(R.id.btnagregar);

        nombre = (EditText) findViewById(R.id.txtnombre);
        email = (EditText) findViewById(R.id.txtmail);
        twitter = (EditText) findViewById(R.id.txttwitt);
        telefono = (EditText) findViewById(R.id.txttel);
        fechanac = (EditText) findViewById(R.id.txtfech);


        i = getIntent();

        btnguar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(nombre.getText().toString()) &&
                        TextUtils.isEmpty(email.getText().toString()) &&
                        TextUtils.isEmpty(twitter.getText().toString()) &&
                        TextUtils.isEmpty(telefono.getText().toString()) &&
                        TextUtils.isEmpty(fechanac.getText().toString())) {
                    Toast.makeText(SecondActivity.this, "Dejaste un campo vacio", Toast.LENGTH_LONG).show();
                } else {

                    enviarContact();
                    setResult(MainActivity.RESULT_OK, i);
                    finish();
                }


            }
        });


    }
    public void enviarContact(){
        Contact nuevoContact = new Contact(
                nombre.getText().toString(),
                email.getText().toString(),
                twitter.getText().toString(),
                telefono.getText().toString(),
                fechanac.getText().toString());

        Bundle be = new Bundle();

        be.putParcelable("parcerable", nuevoContact);
        i.putExtras(be);
    }
}
