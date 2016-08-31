package pl.akademiakodu.kurs2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;


public class MainActivity extends Activity {

    @BindView(R.id.textView2)
    private TextView text;

    //TODO cos tam

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // text = (TextView) findViewById(R.id.textView2);

    }

}
