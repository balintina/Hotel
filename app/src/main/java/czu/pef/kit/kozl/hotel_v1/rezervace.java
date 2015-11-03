package czu.pef.kit.kozl.hotel_v1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class rezervace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rezervace);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        final Button zrusit = (Button) findViewById(R.id.buttonZrusit);
        final EditText jmeno = (EditText) findViewById(R.id.editTextJmeno);
        final EditText mail = (EditText) findViewById(R.id.editTextMail);
        final EditText tele = (EditText) findViewById(R.id.editTextTelefon);
        final EditText adresa = (EditText) findViewById(R.id.editTextAdresa);
        zrusit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String m = null;
                mail.setText(m);
                tele.setText(m);
                adresa.setText(m);
                jmeno.setText(m);
            }
        });

//        final Button odeslat = (Button) findViewById(R.id.buttonOdeslat);
//        odeslat.setOnClickListener(new View.OnClickListener() {
//                                       @Override
//                                       public void onClick(View v) {
//
//                                       }
//                                   }
//
//        );


    }


}
