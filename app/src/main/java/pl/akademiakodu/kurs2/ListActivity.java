package pl.akademiakodu.kurs2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ListActivity extends AppCompatActivity {

    private List<User> userList = new ArrayList<User>();

    @BindView(R.id.listView)
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ButterKnife.bind(this);

        loadFakeUsers();


    }

    private void loadFakeUsers() {
        for (int i = 0; i <= 10; i++) {
            userList.add(new User(i + "12w4asd" + i));
        }
    }

}
