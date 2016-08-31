package pl.akademiakodu.kurs2;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends Activity {

    @BindView(R.id.textView2)
    public TextView text;

    //TODO to zostało jeszcze do zrobienia

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.ourButton)
    public void buttonClick(View view){
        Toast.makeText(this, "Nasz przycisk działa", Toast.LENGTH_LONG).show();
    }


    private class NewTask extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... params) {
            
            return null;
        }
        @Override
        public void onPostExecute(Void  args) {

        }
        @Override
        public void onProgressUpdate(Void ... args){

        }

    }


}
