package com.example.clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   static public int coutm =1;
    static public int m = 1;
    Button xbutton;
    TextView click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        xbutton = (Button)findViewById(R.id.xbutton);
        click = (TextView)findViewById(R.id.click);
        xbutton();
    }
    void xbutton(){
          xbutton.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  if (coutm%18 == 0){
                     scrim();
                  }else {
                      coutm += m;
                      click.setText(coutm + "");
                  }
              }
          });
    }
    void scrim() {
            Intent intent = new Intent(MainActivity.this, scrimmer.class);
            startActivity(intent);

    }
}
