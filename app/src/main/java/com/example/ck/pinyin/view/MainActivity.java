package com.example.ck.pinyin.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ck.pinyin.R;
import com.example.ck.pinyin.presenter.Chinese2Pinyin;

public class MainActivity extends AppCompatActivity {
    private EditText mEditText;
    private TextView mTextView;
    private Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        mButton.setOnClickListener(clickListener);
    }

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_go:
                    String word = mEditText.getText().toString().trim();
                    String pinyin = Chinese2Pinyin.toPinyin(word);
                    mTextView.setText(pinyin);
                    break;
            }
        }
    };

    private void initView(){
        mEditText = findViewById(R.id.et_text);
        mTextView = findViewById(R.id.tv_pinyin);
        mButton = findViewById(R.id.btn_go);
    }
}
