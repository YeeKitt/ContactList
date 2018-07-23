package sg.edu.rp.c346.contactlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 16030820 on 23/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Contacts> contactList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Contacts> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        contactList = objects;

    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout_id, parent, false);
        }
        TextView tvName = convertView.findViewById(R.id.textViewName);
        TextView tvcC = convertView.findViewById(R.id.textViewCountryCode);
        TextView tvNum = convertView.findViewById(R.id.textViewNum);

        Contacts currentItem = contactList.get(position);
        String name = currentItem.getName();
        Integer cC = currentItem.getCountryCode();
        Integer num = currentItem.getPhoneNum();
        tvName.setText(name);
        tvcC.setText("+" + cC);
        tvNum.setText(num + "");

        return  convertView;
    }
}
