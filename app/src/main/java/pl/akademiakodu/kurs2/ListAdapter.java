package pl.akademiakodu.kurs2;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by O on 2016-09-03.
 */
public class ListAdapter extends BaseAdapter{

    private List<User> data;
    private Activity context;
    private static LayoutInflater inflater = null;

    public ListAdapter(Activity ac, List<User> users){
        data = users;
        context = ac;

        inflater = ( LayoutInflater )context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {


        ViewHolder holder;
        if (view != null) {
            holder = (ViewHolder) view.getTag();
        } else {
            view = inflater.inflate(R.layout.our_list, parent, false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        }

        holder.password.setText(data.get(position).getPassword());
        holder.username.setText(data.get(position).getUsername());

        return view;
    }

    public static class ViewHolder {

        @BindView(R.id.textUsername)
        TextView username;

        @BindView(R.id.textPassword)
        TextView password;

        public ViewHolder(View context){
            ButterKnife.bind(this, context);
        }
    }
}
