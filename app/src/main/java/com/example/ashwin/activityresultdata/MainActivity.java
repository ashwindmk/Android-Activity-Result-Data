package com.example.ashwin.activityresultdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final int REQUEST_CODE = 100;
    private TextView mTextViewMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextViewMessage = (TextView) findViewById(R.id.textViewMessage);
    }

    public void start(View view)
    {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, REQUEST_CODE);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_CODE)
        {
            if(resultCode == RESULT_OK) {
                Toast.makeText(this, "Result OK", Toast.LENGTH_LONG).show();
                String message = data.getStringExtra("MESSAGE");
                mTextViewMessage.setText(message);
            }
            else if(resultCode == RESULT_CANCELED) {
                Toast.makeText(this, "Result CANCELED", Toast.LENGTH_LONG).show();
            }

        }
    }
}
