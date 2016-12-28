package com.plt;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.plt.main.controller.MainController;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity implements OnClickListener, MainController.MainCallBackListener {

    public static Context mContext;
    private MainController mainController;

    private Button testBtn;
    private TextView testTextView;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        initView();
    }


    private void init() {
        mContext = this;

    }

    private void initView() {
        testBtn = (Button)findViewById(R.id.test_btn);
        testTextView = (TextView)findViewById(R.id.testTextView);
        editText = (EditText)findViewById(R.id.editText);
        testBtn.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.test_btn:


                System.out.println(editText.getText().toString());
                testRestApi(editText.getText().toString());
                break;

        }
    }

    private void testRestApi(String keyword) {
//        SimpleDateFormat mSimpleDateFormat = new SimpleDateFormat("MM.dd");
//        String curDate = mSimpleDateFormat.format(new Date());
        HashMap<String, String> paramMap = new HashMap<String,String>();
        paramMap.put("id",keyword);

        mainController = new MainController(mContext,this);
        System.out.println("kihun ----------------   0");
        mainController.loadList(mContext,paramMap,true);


        //finish();

    }

    @Override
    public void onCompletedParsingDataProcess(int responseNumber, ArrayList keywordList) {
        testTextView.setText((String)keywordList.get(0));
        //callback
    }
}
