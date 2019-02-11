package com.example.keshar.datatransferfromactivitytofragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button sendBtn;
    private EditText mEmail,mPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sendBtn=findViewById(R.id.sendBtn);
        mEmail=findViewById(R.id.email);
        mPassword=findViewById(R.id.password);
        sendBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.equals(sendBtn))
            goFragment();

    }

    private void goFragment() {

        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        MyFragment myFragment=new MyFragment();

        Bundle bundle=new Bundle();
        bundle.putString("email",mEmail.getText().toString());
        bundle.putString("password",mPassword.getText().toString());
        myFragment.setArguments(bundle);
        fragmentTransaction.add(R.id.content_frame,myFragment);
        fragmentTransaction.commit();

    }
}
