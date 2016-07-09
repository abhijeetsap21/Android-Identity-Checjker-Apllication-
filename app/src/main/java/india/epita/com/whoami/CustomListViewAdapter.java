package india.epita.com.whoami;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Abhijeet on 4/13/2016.
 */
public class CustomListViewAdapter extends ArrayAdapter<ListItem> {



    Context context;

    public CustomListViewAdapter(Context context, int resourceId, //resourceId=your layout
                                 List<ListItem> items) {
        super(context, resourceId, items);
        this.context = context;
    }

    /*private view holder class*/
    private class ViewHolder {
        ImageView imageView;

        TextView txtTitle;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        ListItem listItem = getItem(position);

        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.layout_list_view, null);
            holder = new ViewHolder();
            holder.txtTitle = (TextView) convertView.findViewById(R.id.textView9);
            holder.imageView = (ImageView) convertView.findViewById(R.id.imageView4);
            convertView.setTag(holder);
        } else
            holder = (ViewHolder) convertView.getTag();

        holder.txtTitle.setText(listItem.getTitle());
        holder.imageView.setImageResource(listItem.getImageId());

        return convertView;


    }
}

