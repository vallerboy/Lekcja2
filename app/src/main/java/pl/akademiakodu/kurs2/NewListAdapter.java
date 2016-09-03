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
public class NewListAdapter extends BaseAdapter {

    private List<User> userList;
    private Activity context;
    private LayoutInflater inflater;

    public NewListAdapter(List<User> userList, Activity context){
        this.userList = userList;
        this.context = context;
        inflater = ( LayoutInflater )context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return userList.size();
    }

    @Override
    public Object getItem(int position) {
        return userList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        ViewHolder holder;

        if(view != null) {
           holder = (ViewHolder) view.getTag();
        }else{
            view = inflater.inflate(R.layout.our_list, parent, false);
            holder = new ViewHolder();

            holder.username = (TextView) view.findViewById(R.id.textUsername);
            holder.password = (TextView) view.findViewById(R.id.textPassword);

            view.setTag(holder);
        }

        holder.username.setText(userList.get(position).getUsername());
        holder.password.setText(userList.get(position).getPassword());



        return view;
    }

    public static class ViewHolder {
        TextView username;
        TextView password;
    }
}
