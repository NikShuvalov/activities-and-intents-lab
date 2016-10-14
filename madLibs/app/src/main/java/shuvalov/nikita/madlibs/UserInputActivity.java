package shuvalov.nikita.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class UserInputActivity extends AppCompatActivity {
    EditText adj0;
    EditText adj1;
    EditText noun0;
    EditText noun1;
    EditText animals;
    EditText game;

    Button button;
    String[] words = new String[6];
    ArrayList<EditText> editTexts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_input);
        adj0 = (EditText)findViewById(R.id.adj0);
        editTexts.add(adj0);
        adj1 = (EditText)findViewById(R.id.adj1);
        editTexts.add(adj1);
        noun0 = (EditText)findViewById(R.id.noun0);
        editTexts.add(noun0);
        noun1 = (EditText)findViewById(R.id.noun1);
        editTexts.add(noun1);
        animals = (EditText)findViewById(R.id.animals);
        editTexts.add(animals);
        game = (EditText)findViewById(R.id.game);
        editTexts.add(game);

        button = (Button) findViewById(R.id.completeButt);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(UserInputActivity.this, MadLibActivity.class);
                boolean canContinue=true;
                for (int i = 0; i < words.length; i++) {
                    String temp = editTexts.get(i).getText().toString();
                    if(temp.equals("")){
                        editTexts.get(i).setError("Empty field");
                        canContinue=false;
                    }else{
                        words[i]=temp;
                    }
                    if(canContinue){
                        myIntent.putExtra("userInput", words);
                    }
                }

            }
        });
    }
}
