package g.acedemy.chundoiactyvity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityB extends AppCompatActivity {
TextView tv_title,tv_scripse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        tv_title= (TextView) findViewById(R.id.tvbtitle);
        tv_scripse= (TextView) findViewById(R.id.tvbscrip);
        //dayday();
        daydaybundle();
    }
    public void dayday(){
        Intent intent=getIntent();
        String title=intent.getStringExtra(ActivityA.TITLE);
        String scripse=intent.getStringExtra(ActivityA.SCRIPSTION);
        tv_title.setText(title);
        tv_scripse.setText(scripse);
    }
    public void daydaybundle(){
        Intent intent=getIntent();
        Bundle bundle=intent.getBundleExtra(ActivityA.BUDLE);
        String title=bundle.getString(ActivityA.TITLE);
        String scripse=bundle.getString(ActivityA.SCRIPSTION);
        tv_title.setText(title);
        tv_scripse.setText(scripse);
    }
}
