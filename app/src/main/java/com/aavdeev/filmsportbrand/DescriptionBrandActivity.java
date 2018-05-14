package com.aavdeev.filmsportbrand;

import android.app.Activity;
import android.os.Bundle;

public class DescriptionBrandActivity extends Activity {

    public static final String BRAND_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_brand);

        int id = (int) getIntent().getExtras().get(BRAND_ID);
        BarndDescriptionFragment description = (BarndDescriptionFragment) getFragmentManager().findFragmentById(R.id.activity_description_brand);
        description.setBrandID(id);
    }
}
