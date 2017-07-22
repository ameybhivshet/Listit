package com.example.amey.listit;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/**
 * Created by amey on 7/22/2017.
 */
public class Create_list_dialog_fragment extends DialogFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
View rootview=inflater.inflate(R.layout.create_list,container,false);
        getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);
      /*  int width = getResources().getDimensionPixelSize(R.dimen.width);
        int height = getResources().getDimensionPixelSize(R.dimen.height);
        getDialog().getWindow().setLayout(width,height);*/
      //
        return rootview;
    }

    @Override
    public void onStart() {
        super.onStart();
        int width = getResources().getDimensionPixelSize(R.dimen.width);
        int height = getResources().getDimensionPixelSize(R.dimen.height);
        getDialog().getWindow().setLayout(width, height);

    }

    @Override
    public void onResume() {
        super.onResume();
        int width = getResources().getDimensionPixelSize(R.dimen.width);
        int height = getResources().getDimensionPixelSize(R.dimen.height);
        getDialog().getWindow().setLayout(width, height);
    }
}
