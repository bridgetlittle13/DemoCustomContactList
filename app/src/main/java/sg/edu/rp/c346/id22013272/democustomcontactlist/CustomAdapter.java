package sg.edu.rp.c346.id22013272.democustomcontactlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Contact>contactList;
    public CustomAdapter(Context context, int resource, ArrayList<Contact> objects){
        super(context,resource,objects);
        parent_context=context;
        layout_id=resource;
        contactList=objects;
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        LayoutInflater inflater=(LayoutInflater) parent_context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowview=inflater.inflate(layout_id,parent,false);

        TextView tvName=rowview.findViewById(R.id.textViewName);
        TextView tvCode=rowview.findViewById(R.id.textViewCountryCode);
        TextView tvNum=rowview.findViewById(R.id.textViewPhoneNum);
        ImageView ivGender=rowview.findViewById(R.id.imageViewGender);

        Contact currentItem =contactList.get(position);
        tvName.setText(currentItem.getName());
        tvCode.setText("+"+currentItem.getCountryCode());
        tvNum.setText(currentItem.getPhoneNum()+"");
        //ivGender.setImageResource(R.drawable.female);
        if (currentItem.getGender() == 'M') {
            ivGender.setImageResource(R.drawable.male);
        } else {
            ivGender.setImageResource(R.drawable.female);
        }

        return rowview;
    }
}
