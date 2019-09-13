package net.berenice.contact;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    EditText nombre,email,twitter, telefono, fechanac;
    Button btnguar;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        btnguar = findViewById(R.id.btnagregar);

        nombre =(EditText)findViewById(R.id.txtnombre);
        email =(EditText)findViewById(R.id.txtmail);
        twitter=(EditText)findViewById(R.id.txttwitt);
        telefono =(EditText)findViewById(R.id.txttel);
        fechanac =(EditText)findViewById(R.id.txtfech);



        btnguar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                Contact user=new Contact(nombre.getText().toString(), email.getText().toString(), twitter.getText().toString(), telefono.getText().toString(), fechanac.getText().toString());
                intent.putExtra("Osvaldo",user);
                setResult(RESULT_OK,intent);
                finish();


            }
        });


    }
}
