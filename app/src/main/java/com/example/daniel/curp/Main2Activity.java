package com.example.daniel.curp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        usuario user = intent.getParcelableExtra("user");

        ((TextView)findViewById(R.id.nombres)).setText(user.nombre);
        ((TextView)findViewById(R.id.primerapellido)).setText(user.primerapellido);
        ((TextView)findViewById(R.id.segundoapellido)).setText(user.segundoapellido);
        ((TextView)findViewById(R.id.fechanacimiento)).setText(user.fechanacimiento);
        ((TextView)findViewById(R.id.entidad)).setText(user.entidad);
        ((TextView)findViewById(R.id.sexo)).setText(user.sexo);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.cerrar_sesion:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}