package g.acedemy.chundoiactyvity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityA extends AppCompatActivity {
    EditText ed_title,ed_scrip;
    Button btnlogin;
    static  final String TITLE="TITLE";
    static  final String SCRIPSTION="SCRIPSTION";
    static  final  String BUDLE="BUDLE";
    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_a);
        ed_title= (EditText) findViewById(R.id.et_title);
        ed_scrip= (EditText) findViewById(R.id.et_scrip);
         btnlogin= (Button) findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title=ed_title.getText().toString();
                String scripstion=ed_scrip.getText().toString();
               // byExtra(title,scripstion);
                byBudle(title,scripstion);
            }
        });

    }

    private void byExtra(String title,String scripstion) {
        Intent intent=new Intent(ActivityA.this,ActivityB.class);
        intent.putExtra(TITLE,title);
        intent.putExtra(SCRIPSTION,scripstion);
        startActivity(intent);
    }
    private void byBudle(String title,String scripstion) {
        Intent intent=new Intent(ActivityA.this,ActivityB.class);
        Bundle bundle=new Bundle();
        bundle.putString(TITLE,title);
        bundle.putString(SCRIPSTION,scripstion);
        intent.putExtra(BUDLE,bundle);
        startActivity(intent);
    }
}
