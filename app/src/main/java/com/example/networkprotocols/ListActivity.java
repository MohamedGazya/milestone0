package com.example.networkprotocols;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        String[] OS = {"Android", "iPhone", "Windows", "Blackberry", "Linux"};
        ArrayAdapter arrayAdapter= new ArrayAdapter<String>(ListActivity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.OS));
        final ListView devicelist= (ListView) findViewById(R.id.devicelist);
        devicelist.setAdapter(arrayAdapter);

        devicelist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ListActivity.this, DeviceDetailActivity.class);
                intent.putExtra("OSversion", devicelist.getItemAtPosition(position).toString());
                startActivity(intent);
            }
        });
    }
}
