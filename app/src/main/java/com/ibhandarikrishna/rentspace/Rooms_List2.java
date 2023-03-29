package com.ibhandarikrishna.rentspace;


import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.ibhandarikrishna.rentspace.R;

import java.util.List;

public class Rooms_List2 extends ArrayAdapter<Room_details2>
{
    private Activity context;
    private List<Room_details2> roomsList;

    public Rooms_List2(Activity context, List<Room_details2> roomsList)
    {
        super(context, R.layout.activity_my_places2, roomsList);
        this.context = context;
        this.roomsList = roomsList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        LayoutInflater inflater = context.getLayoutInflater();

        View listViewItem = inflater.inflate(R.layout.activity_my_places2, null, true);

        TextView textViewAddress = (TextView) listViewItem.findViewById(R.id.address);
        TextView textViewPrice = (TextView) listViewItem.findViewById(R.id.price);
        TextView textViewArea = (TextView) listViewItem.findViewById(R.id.area);
        TextView textViewDescription = (TextView) listViewItem.findViewById(R.id.description);
        TextView textViewHeading = (TextView) listViewItem.findViewById(R.id.heading_my_places);

        Room_details2 room = roomsList.get(position);
        textViewHeading.setText("Search Results:");
        textViewAddress.setText(room.getAddress());
        textViewPrice.setText(room.getPrice());
        textViewArea.setText(room.getArea());
        textViewDescription.setText(room.getDescription());

        return listViewItem;
    }
}
