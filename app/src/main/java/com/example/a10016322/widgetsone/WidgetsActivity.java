package com.example.a10016322.widgetsone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;


public class WidgetsActivity extends AppCompatActivity {

    SeekBar seekBar;
    TextView seekText, switchText, editTextView;
    Switch aSwitch;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widgets);

        seekBar = (SeekBar)(findViewById(R.id.seek_id));
        seekText = (TextView)(findViewById(R.id.seekText_id));

        //Seek Bar
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {//don't forget this line
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seekText.setText(seekBar.getProgress() + "%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        //Switch
        aSwitch = (Switch)(findViewById(R.id.switch_id));
        switchText = (TextView)(findViewById(R.id.switchText_id));

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {//don't forget this
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    switchText.setText("ON");
                else if(!isChecked)
                    switchText.setText("OFF");
            }
        });

        //Edit Text
        editText = (EditText)(findViewById(R.id.edit_id));
        editTextView = (TextView)(findViewById(R.id.editText_id));

        editText.addTextChangedListener(new TextWatcher() {//don't forget this
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                editTextView.setText(s); //s is what is changed

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
