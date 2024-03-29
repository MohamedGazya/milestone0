package com.example.networkprotocols;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.networkprotocols.ListActivity;

public class MainActivity extends AppCompatActivity  {
    private EditText email, password;
    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email =  findViewById(R.id.email);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openList_Activity();
            }
        });

    }
    public void openList_Activity(){
        Intent intent = new Intent(this, ListActivity.class);
        startActivity(intent);
    }

}
