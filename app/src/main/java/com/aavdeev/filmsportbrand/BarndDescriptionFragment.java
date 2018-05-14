package com.aavdeev.filmsportbrand;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BarndDescriptionFragment extends Fragment {

    private long brandID;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        if (savedInstanceState != null) {
            brandID = savedInstanceState.getLong("brandID");
        }

        return inflater.inflate(R.layout.fragment_barnd_description, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            Brands list = Brands.brandList[(int) brandID];
            TextView name = view.findViewById(R.id.name_brand);
            name.setText(list.getName());
            TextView description = view.findViewById(R.id.description_brand);
            description.setText(list.getDescription());
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putLong("brandID",brandID);
    }

    public void setBrandID(long brandID) {
        this.brandID = brandID;
    }
}
