package com.aavdeev.filmsportbrand;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class GenerList extends ListActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ArrayAdapter<GenerFilms> list = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, GenerFilms.listGener);

        ListView listView = getListView();
        listView.setAdapter(list);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = new Intent(GenerList.this, GenerFilmsDescriptionActivity.class);
        intent.putExtra(GenerFilmsDescriptionActivity.GANER_DESCRIPTION, (int) id);
        startActivity(intent);
    }
}
