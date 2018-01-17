package api.app.androidkt.googlevisionapi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.app.androidkt.googlevisionapi.R;

import java.util.ArrayList;

/**
 * Created by anil.mh on 1/11/2018.
 */

public class EntityArrayAdapter extends ArrayAdapter<Entitys> {

    private final Context context;
    private ArrayList<Entitys> entitysList;

    public EntityArrayAdapter(Context context, ArrayList<Entitys> entitysList) {
        super(context, -1, entitysList);
        this.context = context;
        this.entitysList = entitysList;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.feature_list_items, parent, false);
        TextView textViewName = (TextView) rowView.findViewById(R.id.textName);
        TextView textViewScore = (TextView) rowView.findViewById(R.id.textScore);

        Entitys entitys = entitysList.get(position);

        textViewName.setText(entitys.description);
        textViewScore.setText(String.format("%.2f", (entitys.score*100)) + "%");

        return rowView;
    }
}
