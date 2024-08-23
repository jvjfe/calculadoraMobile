package com.example.calculadoraa;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;


public class Principal extends Activity {
	
	char op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        EditText vl1 = (EditText) findViewById(R.id.vl1);
        EditText v2 = (EditText) findViewById(R.id.vl2);
        EditText res = (EditText) findViewById(R.id.vlRes);
        
        Button bdiv = (Button) findViewById(R.id.btnDiv);
        Button bmult = (Button) findViewById(R.id.btnMult);
        Button bsoma = (Button) findViewById(R.id.btnSoma);
        Button bsub = (Button) findViewById(R.id.btnSub);
        Button bigual = (Button) findViewById(R.id.bntIgual);
        
    }
}
