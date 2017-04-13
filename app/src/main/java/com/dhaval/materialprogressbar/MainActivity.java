package com.dhaval.materialprogressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    private CustomProgressDialog mCustomProgressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mCustomProgressDialog = new CustomProgressDialog(this);
        mCustomProgressDialog.show("",true);

    }
}
