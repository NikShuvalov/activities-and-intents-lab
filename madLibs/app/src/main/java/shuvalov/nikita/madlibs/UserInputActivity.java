package shuvalov.nikita.madlibs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class UserInputActivity extends AppCompatActivity {
    EditText adj1;
    EditText adj2;
    EditText noun1;
    EditText noun2;
    EditText animals;
    EditText Game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_input);

    }
}
