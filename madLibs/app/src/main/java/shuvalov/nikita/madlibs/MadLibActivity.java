package shuvalov.nikita.madlibs;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MadLibActivity extends AppCompatActivity {
    private final String story = "Good evening, this is Greg Farby with the 6 o’clock news. " +
            "The local mall has announced that it will be closing its doors temporarily due to a recent infestation of %s. " +
            "Fred Farnsworth, %s %s expert on %s, stated that he believes the %s are being attracted to a particular %s being sold there." +
            "Larry Gurtsmore, %s %s world-champ who frequents the mall, had this to say about the situation: “I planned 3 months ahead of time to go to the mall to buy a new %s this weekend… so much for that.” " +
            "That’s all for the news, Greg Farby wishing you %s %s night.";

    private TextView textView;
    private Button backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad_lib);

        textView= (TextView) findViewById(R.id.outputView);
        backButton = (Button) findViewById(R.id.backButt);
        Intent passedIntent=getIntent();
        String[] words = passedIntent.getStringArrayExtra("userInput");
        String prep0 = setPreposition(words[0].toLowerCase());
        String prep1 = setPreposition(words[5].toLowerCase());
        String prep2 = setPreposition(words[1].toLowerCase());


        textView.setText(String.format(story, words[4],  prep0, words[0], words[4], words[4], words[2], prep1, words[5], words[3], prep2, words[1]));

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private String setPreposition(String word){
        if(word.startsWith("a")||word.startsWith("e")||word.startsWith("i")||word.startsWith("o")||word.startsWith("u")){
            return "an";
        }else{
            return "a";
        }

    }

}
