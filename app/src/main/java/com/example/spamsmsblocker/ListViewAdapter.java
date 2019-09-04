package com.example.spamsmsblocker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.List;

public class ListViewAdapter extends ArrayAdapter<ContactBlocked> {

    public ListViewAdapter(Context context, int resource, List<ContactBlocked> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView==null)
        {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.fragment_list__item_,null );

        }

        ContactBlocked contactBlocked = getItem(position);
        ImageView img = convertView.findViewById(R.id.imageView);
        TextView txtView = convertView.findViewById(R.id.contactName);
        Switch autoDeletem = convertView.findViewById(R.id.switchDelMsgs);
        Switch blockNotification = convertView.findViewById(R.id.switchDenyNotif);

        txtView.setText(contactBlocked.getContactName());
        autoDeletem.setChecked(contactBlocked.getAutoDelete());
        blockNotification.setChecked(contactBlocked.getDenyNotifications());
        img.setImageResource(contactBlocked.getImageID());
        return convertView;
    }
}
