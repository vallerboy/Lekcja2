package pl.akademiakodu.kurs2;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by O on 2016-09-03.
 */
public class ListAdapter extends BaseAdapter{

    private List<User> data;
    private Activity context;

    public ListAdapter(Activity ac, List<User> users){
        data = users;
        context = ac;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
