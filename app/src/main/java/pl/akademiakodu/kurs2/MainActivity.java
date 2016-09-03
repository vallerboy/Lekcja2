package pl.akademiakodu.kurs2;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends Activity {


    @BindView(R.id.ourButton)
    Button newActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);




    }

    @OnClick(R.id.ourButton)
    public void clicked(View v){
        Intent i = new Intent(this, LoginActivity.class);
        i.putExtra("klucz", "AkademiaKodu jupi!!");

        startActivity(i);
    }





}
