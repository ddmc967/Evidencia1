package com.example.daniel.curp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        // AGREGANDO UN SPINNER QUE MANDA A LLAMAR EL ARREGLO CON TODOS LOS ESTADOS

        Spinner spinnerentidad;


        setContentView(R.layout.activity_main);

        spinnerentidad = (Spinner)findViewById(R.id.selectorentidad);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.entidades, android.R.layout.simple_spinner_item);
        spinnerentidad.setAdapter(adapter);
    }





    public void datosdeusuario(View view) {
        usuario user = new usuario();

        user.nombre = ((EditText)findViewById(R.id.inputnombre)).getText().toString();
        user.primerapellido = ((EditText)findViewById(R.id.inputprimerapellido)).getText().toString();
        user.segundoapellido = ((EditText)findViewById(R.id.inputsegundoapellido)).getText().toString();
        user.fechanacimiento = ((EditText)findViewById(R.id.inputfechanacimiento)).getText().toString();
        user.entidad = ((Spinner)findViewById(R.id.selectorentidad)).getSelectedItem().toString();
        user.sexo = ((RadioButton)findViewById(((RadioGroup)findViewById(R.id.gruposexo)).getCheckedRadioButtonId())).getText().toString();


        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        intent.putExtra("user", user);
        startActivity(intent);



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