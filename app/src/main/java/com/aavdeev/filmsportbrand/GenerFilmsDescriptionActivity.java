package com.aavdeev.filmsportbrand;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class GenerFilmsDescriptionActivity extends Activity {

    public static final String GANER_DESCRIPTION = "id description";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gener_films);

        int desID = (int) getIntent().getExtras().get(GANER_DESCRIPTION);
        GenerFilms list = GenerFilms.listGener[desID];

        ImageView photo = findViewById(R.id.photo);
        photo.setImageResource(list.getId());
        photo.setContentDescription(list.getName());

        TextView name = findViewById(R.id.name_gener);
        name.setText(list.getName());

        TextView description = findViewById(R.id.description_gener);
        description.setText(list.getDescription());
    }
}
