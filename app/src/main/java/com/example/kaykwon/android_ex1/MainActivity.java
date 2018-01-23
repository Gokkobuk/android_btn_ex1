package com.example.kaykwon.android_ex1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClicked (View v) {
        final EditText editText = (EditText) findViewById(R.id.editText);
        final TextView txtText = (TextView) findViewById(R.id.txtText);
        txtText.setText(editText.getText());
        Toast.makeText(this, "버튼", Toast.LENGTH_LONG).show();
        }

    public void onButtonClicked2(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(intent);
    }

    public void onNextButtonClicked(View v){
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }

}





