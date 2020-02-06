package com.interfacemockup.pravoslavac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Kalendar_12_meseci extends AppCompatActivity {
    ListView listView;
    TextView textView;
    String[] listItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalendar_12_meseci);

        listView = (ListView)findViewById(R.id.id_dvanaest_meseci_list_view) ;
        textView = (TextView)findViewById(R.id.id_meseci_cell);
        listItem = getResources().getStringArray(R.array.nazivi_meseca);

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_selectable_list_item, android.R.id.text1, listItem);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = adapter.getItem(position);
                Toast.makeText(getApplicationContext(),value,Toast.LENGTH_SHORT).show();
            }
        });



    }
}
