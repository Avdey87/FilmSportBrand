package com.aavdeev.filmsportbrand;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ToIntentActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_intent);



    }

    public void onClickToIntent(View view) {
        EditText editText = findViewById(R.id.edit_text);
        String message = editText.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        Intent chng = Intent.createChooser(intent, "Способ отправки");
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, message);
        startActivity(chng);
    }

    public void onClickSendToActivity(View view) {
        EditText editText = findViewById(R.id.edit_text);
        String message = editText.getText().toString();
        Intent intent = new Intent(this, MessageActivity.class);
        intent.putExtra(MessageActivity.MESSAGE, message);
        startActivity(intent);
    }
}
