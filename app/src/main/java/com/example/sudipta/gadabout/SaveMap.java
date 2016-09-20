package com.example.sudipta.gadabout;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SaveMap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Typeface tf = Typeface.createFromAsset(getAssets(), "exo.otf");
        TextView tv1 = (TextView) findViewById(R.id.textView);
        tv1.setTypeface(tf);
        Button b2 = (Button) findViewById(R.id.back);
        b2.setTypeface(tf);
        Button b3 = (Button) findViewById(R.id.play);
        b3.setTypeface(tf);
        EditText et= (EditText) findViewById(R.id.editText2);
        et.setTypeface(tf);

        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        setContentView(R.layout.activity_save_map);
        TextView clues = (TextView) findViewById(R.id.textView);
        clues.setMovementMethod(new ScrollingMovementMethod());

    }
    public void back(View v){
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
    public void save(View v){
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
}
