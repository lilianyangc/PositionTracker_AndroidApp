package ca.georgebrown.comp3074.positiontracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import ca.georgebrown.comp3074.positiontracker.model.Route;

public class RouteArrayAdapter extends ArrayAdapter<Route> {

    int layout;
    public RouteArrayAdapter(@NonNull Context context,
                          int resource, @NonNull List<Route> objects){
        super(context, resource, objects);
        layout = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView==null){
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(layout, null);
        }

        Route item = getItem(position);
        TextView t = convertView.findViewById(R.id.txtRoute);
        t.setText(item.getRouteName());

        return convertView;
    }


}
