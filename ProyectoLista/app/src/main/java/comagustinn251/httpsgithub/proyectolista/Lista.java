package comagustinn251.httpsgithub.proyectolista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.lang.String;
public class Lista extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        populateListView();
    }
    private void populateListView() {
        String[] myItems={"azul","verde","violeta","rojo"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                R.layout.objeto,
                myItems);
        ListView list= (ListView) findViewById(R.id.listViewMain);
        list.setAdapter(adapter);

    }
}
