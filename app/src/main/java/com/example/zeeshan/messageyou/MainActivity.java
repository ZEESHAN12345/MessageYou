package com.example.zeeshan.messageyou;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout chatBox;
    TextView person1, you;
    TextView messagePerson1, messageYou;
    EditText typeBox;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ActionBar mActionBar = getSupportActionBar();
        mActionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM | ActionBar.DISPLAY_SHOW_HOME);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);

        chatBox = (LinearLayout)findViewById(R.id.chatbox);

        person1 = (TextView)findViewById(R.id.person1);
        you = (TextView)findViewById(R.id.you);

        messagePerson1 = (TextView)findViewById(R.id.message_person1);
        messageYou = (TextView)findViewById(R.id.message_you);

        typeBox = (EditText)findViewById(R.id.typebox);

        send = (Button)findViewById(R.id.send);

    }
}
