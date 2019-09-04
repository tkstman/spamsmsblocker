package com.example.spamsmsblocker;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;


public class Tab2_Fragment extends Fragment {

    private static final String TAG = "Potential Spam";
    private Button buttonTest2;

//    private OnFragmentInteractionListener mListener;

    public Tab2_Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_tab2_, container, false);
        buttonTest2= view.findViewById(R.id.buttonTest2);

        buttonTest2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"Button 2 Click: Starting.");
                Toast.makeText(getActivity(),"Testing Fragment 2",Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

}
