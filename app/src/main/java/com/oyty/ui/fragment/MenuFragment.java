package com.oyty.ui.fragment;


import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.oyty.residemenu.R;
import com.oyty.ui.activity.DiscoverActivity;
import com.oyty.ui.activity.MainActivity;
import com.oyty.ui.activity.MessageActivity;
import com.oyty.ui.activity.MyActivity;
import com.oyty.ui.activity.SettingActivity;


/**
 * A simple {@link Fragment} subclass.
 */
public class MenuFragment extends Fragment implements View.OnClickListener {

    private MainActivity context;

    public MenuFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        context = (MainActivity) getActivity();

        View view = inflater.inflate(R.layout.fragment_menu, container, false);
        view.findViewById(R.id.mMessageContent).setOnClickListener(this);
        view.findViewById(R.id.mDiscoverContent).setOnClickListener(this);
        view.findViewById(R.id.mMyContent).setOnClickListener(this);
        view.findViewById(R.id.mSettingContent).setOnClickListener(this);
        // Inflate the layout for this fragment
        return view;
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.mMessageContent:
                intent = new Intent(context, MessageActivity.class);
                break;
            case R.id.mDiscoverContent:
                intent = new Intent(context, DiscoverActivity.class);
                break;
            case R.id.mMyContent:
                intent = new Intent(context, MyActivity.class);
                break;
            case R.id.mSettingContent:
                intent = new Intent(context, SettingActivity.class);
                break;
        }
        Toast.makeText(context, "hahahahhaha",  Toast.LENGTH_LONG).show();
//        context.startActivity(intent);

    }


}
