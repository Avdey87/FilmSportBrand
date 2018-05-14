package com.aavdeev.filmsportbrand;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainBrandActivity extends Activity implements BrandListFragment.BrandListListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_brand);
    }

    @Override
    public void itemClicked(long id) {
        View container = findViewById(R.id.container_description_brand);
        if (container != null) {
            BarndDescriptionFragment descript = new BarndDescriptionFragment();
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            descript.setBrandID(id);
            ft.replace(R.id.container_description_brand, descript);
            ft.addToBackStack(null);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
        } else {
            Intent intent = new Intent(MainBrandActivity.this, DescriptionBrandActivity.class);
            intent.putExtra(DescriptionBrandActivity.BRAND_ID, (int) id);
            startActivity(intent);
        }
    }
}
