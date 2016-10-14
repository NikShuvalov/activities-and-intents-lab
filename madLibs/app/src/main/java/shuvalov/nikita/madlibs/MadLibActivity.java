package shuvalov.nikita.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MadLibActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad_lib);

        textView= (TextView) findViewById(R.id.outputView);
        Intent passedIntent=getIntent();
        String[] words = passedIntent.getStringArrayExtra("userInput");

        textView.setText(String.format(story[0],))

    }
}
