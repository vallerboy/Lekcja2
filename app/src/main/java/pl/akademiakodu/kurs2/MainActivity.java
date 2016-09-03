package pl.akademiakodu.kurs2;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
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

    private Dialog dialog;

    @OnClick(R.id.ourButton)
    public void clicked(View v){
         dialog = new Dialog(this);
         final Dialog dialog = new Dialog(this);
         dialog.setContentView(R.layout.dialog);
         dialog.setTitle("Witajcie!");

        // TextView textLocal = (TextView) findViewById(R.id.textOur);
         TextView textLocal = ButterKnife.findById(dialog, R.id.textOur);
         Button localButton = ButterKnife.findById(dialog, R.id.dialogButtonOK);

         localButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 dialog.dismiss();
             }
         });

         textLocal.setText("AkademiaKodu");

         dialog.show();

    }







}
