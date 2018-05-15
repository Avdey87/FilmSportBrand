package com.aavdeev.filmsportbrand;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MessageActivity extends Activity {

    public static final String MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        String messge = (String) getIntent().getExtras().get(MESSAGE);
        TextView text = findViewById(R.id.message);
        text.setText(messge);
    }
}
