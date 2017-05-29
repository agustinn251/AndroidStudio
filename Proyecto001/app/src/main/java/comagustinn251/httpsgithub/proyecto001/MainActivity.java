package comagustinn251.httpsgithub.proyecto001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText nombre;
    private TextView mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre=(EditText)findViewById(R.id.saludotextView);
        mensaje=(TextView)findViewById(R.id.nombreText);
    }
    public void Saludar(View view){
        String nombre_user=nombre.getText().toString();
        mensaje.setText("Hola"+ nombre_user);
    }
}
