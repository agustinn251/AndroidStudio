package comagustinn251.httpsgithub.proyectolista.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import java.lang.String;
import java.util.ArrayList;
import comagustinn251.httpsgithub.proyectolista.R;
import comagustinn251.httpsgithub.proyectolista.adapter.MyAdapter;

public class Lista extends AppCompatActivity {
    ListView listView;
    ArrayList<Integer> idImages;
    ArrayList<String> nameList;
    MyAdapter myAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        listView =(ListView) findViewById(R.id.listView);
        idImages= new ArrayList<>();
        nameList=new ArrayList<>();
        idImages=getList();
        nameList=getNameList();
        myAdapter=new MyAdapter(Lista.this,idImages,nameList);
        listView.setAdapter(myAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Lista.this,"El nombre del lenguaje es: "+nameList.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
    public ArrayList<Integer> getList(){
        idImages = new ArrayList<>();
        idImages.add(R.drawable.cpp);
        idImages.add(R.drawable.java);
        idImages.add(R.drawable.php);
        idImages.add(R.drawable.csharp);
        idImages.add(R.drawable.android);
        idImages.add(R.drawable.js);

        return idImages;
    }

    public ArrayList<String> getNameList(){
        nameList = new ArrayList<>();
        nameList.add("C++");
        nameList.add("JAVA");
        nameList.add("PHP");
        nameList.add("C SHARP");
        nameList.add("ANDROID");
        nameList.add("JAVASCRIPT");

        return nameList;
    }

}
