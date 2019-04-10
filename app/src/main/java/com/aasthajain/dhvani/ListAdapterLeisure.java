package com.aasthajain.dhvani;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListAdapterLeisure extends ArrayAdapter<String>{
        private final Activity Context;
        private final String[] ListItemsName;
        private final Integer[] ImageName;

        public ListAdapterLeisure(@NonNull android.content.Context context, int resource, Activity context1, String[] listItemsName, Integer[] imageName) {
            super(context,R.layout.leisurelistitem, resource);
            Context = context1;
            ListItemsName = listItemsName;
            ImageName = imageName;
        }
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = Context.getLayoutInflater();
        View ListViewSingle = inflater.inflate(R.layout.leisurelistitem, null, true);

        TextView ListViewItems = (TextView) ListViewSingle.findViewById(R.id.textView2);
        ImageView ListViewImage = (ImageView) ListViewSingle.findViewById(R.id.list_image1);

        ListViewItems.setText(ListItemsName[position]);
        ListViewImage.setImageResource(ImageName[position]);
        return ListViewSingle;

    };

}


