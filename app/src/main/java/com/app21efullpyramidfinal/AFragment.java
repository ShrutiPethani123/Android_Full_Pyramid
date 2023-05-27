package com.app21efullpyramidfinal;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class AFragment extends Fragment {


    private static  String NAME1 = "param1 " ;
    private static  String CODE1= "param2";

    public AFragment()
    {

    }

    public static Fragment getInstance(String name1 , int code1)
    {
        Log.d("Name1", "getInstance: "+ name1);
        AFragment aFragment = new AFragment();
        Bundle bundle = new Bundle();
        bundle.putString("n1",name1);
        bundle.putInt(CODE1,code1);
        aFragment.setArguments(bundle);
        Log.d("NAME1", "getInstance: "+ NAME1);
        return aFragment;

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if(getArguments()!=null)
        {
            String name = getArguments().getString("n1");
            int code = getArguments().getInt(CODE1);

            Log.d("Values of name and code", "Name: " + name + " Code" + code);
        }



        return inflater.inflate(R.layout.fragment_a, container, false);
    }
}