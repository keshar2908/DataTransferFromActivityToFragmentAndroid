package com.example.keshar.datatransferfromactivitytofragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends Fragment {
    private TextView reciveEmail,recivePassword;


    public MyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_blank, container, false);
        findView(view);
        return view;
    }

    private void findView(View view) {
        reciveEmail=view.findViewById(R.id.textView7);
        recivePassword=view.findViewById(R.id.reciveText);

        Bundle bundle=getArguments();
        String email=bundle.getString("email");
        String password=bundle.getString("password");

        reciveEmail.setText(email);
        recivePassword.setText(password);
    }

}
