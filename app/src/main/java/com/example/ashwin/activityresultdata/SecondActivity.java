package com.example.ashwin.activityresultdata;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import static com.example.ashwin.activityresultdata.R.id.editTextMessage;

public class SecondActivity extends AppCompatActivity {

    private EditText mEditTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mEditTextMessage = (EditText) findViewById(editTextMessage);
    }

    public void ok(View view)
    {
        String message = mEditTextMessage.getText().toString();
        Intent intent = new Intent();
        intent.putExtra("MESSAGE", message);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void canceled(View view)
    {
        setResult(RESULT_CANCELED);
        finish();
    }
}
