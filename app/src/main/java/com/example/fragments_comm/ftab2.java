package com.example.fragments_comm;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ftab2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ftab2 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    RecyclerView recyclerView2;
    //ArrayList<RecipeModel> list2;
    public ftab2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ftab2.
     */
    // TODO: Rename and change types and number of parameters
    public static ftab2 newInstance(String param1, String param2) {
        ftab2 fragment = new ftab2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=  inflater.inflate(R.layout.fragment_ftab2, container, false);
        recyclerView2=view.findViewById(R.id.rv2);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
            ArrayList<DataObject> data=new ArrayList<>();
         /* data.add(new DataObject("angana","how are you","come sooooooon",R.drawable.image2));
        data.add(new DataObject("adrita","how allq you","come oon",R.drawable.imag3));
        data.add(new DataObject("moni","how aake you","come hell",R.drawable.image4));
        data.add(new DataObject("gitee","how armamae you","come bye",R.drawable.image2));
        data.add(new DataObject("pradip","how aasnjare you","come bruh",R.drawable.image1));
        data.add(new DataObject("koka","how amamskre you","come bruh",R.drawable.imag3));*/

            data.add(new DataObject("angana","Report of jan","The below attachment consist of the summary of the report",R.drawable.image1));
            data.add(new DataObject("adrita","Requesting for leave","Grant me leave for 10 days as I have an emergency",R.drawable.image3));
            data.add(new DataObject("moni","Requesting update of february","Please send me th update of performances of the employees of last month",R.drawable.image4));
            data.add(new DataObject("gitee","Finance Details","PFA documents of finance",R.drawable.image4));
            data.add(new DataObject("pradip","Employee Details","PFA documents of updated employee document",R.drawable.iamge7));
            data.add(new DataObject("kamakhya","TODO for march","Please review the TODO prepared for the month of march ",R.drawable.image5));
        Adapter adapterr=new Adapter(data);
        recyclerView2.setAdapter(adapterr);

            LinearLayoutManager layoutManager=new LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,true);
        recyclerView2.setLayoutManager(layoutManager);
        return view;
    }
}