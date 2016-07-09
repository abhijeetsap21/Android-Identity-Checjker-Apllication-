package india.epita.com.whoami;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    public static final String[] titles = new String[] { "I like Yoga",
            "I Dislike Cricket", "I like Orange", "I like fruits"};

    public static final Integer[] images = { R.drawable.thumb_up,
            R.drawable.thumb_down, R.drawable.thumb_up, R.drawable.thumb_down };

    ListView listView;
    List<ListItem> listItems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listItems = new ArrayList<ListItem>();
        for (int i = 0; i < titles.length; i++) {
            ListItem item = new ListItem(titles[i], images[i]);
            listItems.add(item);
        }
        listView = (ListView) findViewById(R.id.listView);
        CustomListViewAdapter adapter = new CustomListViewAdapter(this,

                R.layout.layout_list_view, listItems);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //Toast toast = Toast.makeText(getApplicationContext(),
          //      "Item " + (position + 1) + ": " + listItems.get(position),
            //    Toast.LENGTH_SHORT);
        //toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0);
        //toast.show();
        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle(listItems.get(position).getTitle());

        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Cancel",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alertDialog.show();

    }



}
