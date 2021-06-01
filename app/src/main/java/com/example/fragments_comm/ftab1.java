package com.example.fragments_comm;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ftab1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ftab1 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    RecyclerView recyclerView;
    ArrayList<RecipeModel> list;


    //scroll
    //LinearLayoutManager layoutManager=new LinearLayoutManager(this);
    // recyclerView.setLayoutManager(layoutManager);

//horizontal scroll
        /*LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,true);
        recyclerView.setLayoutManager(layoutManager);*/

    //grid layout
    //GridLayout gridLayout=new GridLayout(this,2);
    //GridLayout gridLayout=new GridLayout(this, 2);


    public ftab1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ftab1.
     */
    // TODO: Rename and change types and number of parameters
    public static ftab1 newInstance(String param1, String param2) {
        ftab1 fragment = new ftab1();
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
        View view=  inflater.inflate(R.layout.fragment_ftab1, container, false);
        recyclerView=view.findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        list=new ArrayList<>();
        list.add(new RecipeModel(R.drawable.iamge7,"Caeser"));
        list.add(new RecipeModel(R.drawable.image1,"Princess"));
        list.add(new RecipeModel(R.drawable.image3,"Iykia"));
        list.add(new RecipeModel(R.drawable.image4,"Mango"));
        list.add(new RecipeModel(R.drawable.image5,"Eva"));
        list.add(new RecipeModel(R.drawable.iamge7,"Levi"));
        list.add(new RecipeModel(R.drawable.image5,"lasha"));
        PageAdapter2 adapterr=new PageAdapter2(list);
        recyclerView.setAdapter(adapterr);
       GridLayoutManager gridLayoutManager=new GridLayoutManager(requireContext(),2);
        recyclerView.setLayoutManager(gridLayoutManager);
     /*LinearLayoutManager layoutManager=new LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,true);
        recyclerView.setLayoutManager(layoutManager); */

        return view;
    }
}