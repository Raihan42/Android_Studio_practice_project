package com.example.raihanrajon.listandswitch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list);

        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,getResources().getStringArray(R.array.countries));

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String value = (String) listView.getItemAtPosition(position);

                Toast.makeText(getApplicationContext(),"position:"+position+ "Value:" +value ,Toast.LENGTH_LONG).show();

                switch (value)
                {
                    case "Bangladesh":

                        Intent intent = new Intent(getApplicationContext(),Banhladesh.class);
                        startActivity(intent);
                        break;

                    case "India":

                        Intent intent1 = new Intent(getApplicationContext(),India.class);
                        startActivity(intent1);
                        break;

                        default:

                            Intent intent2 = new Intent(getApplicationContext(),Deafult.class);
                            startActivity(intent2);
                            break;
                }

            }
        });

    }
}
