package moezbenselem.ussddealer;


import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;



/**
 * A simple {@link Fragment} subclass.
 */
public class OrangeFragment extends Fragment {

    public static Activity activity;
    ArrayList<Button> listBt;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        try {
            activity = getActivity();
            listBt = new ArrayList<>();
            recyclerView =
                    (RecyclerView) getView().findViewById(R.id.recyclerView);

            layoutManager = new GridLayoutManager(getContext(), 2);
            recyclerView.setLayoutManager(layoutManager);


            Button bt1 = new Button(getContext());
            bt1.setText("Solde");
            bt1.setTag("*101");
            Button bt2 = new Button(getContext());
            bt2.setText("votre numero");
            bt2.setTag("*123");
            Button bt3 = new Button(getContext());
            bt3.setText("PARAM INTERNET");
            bt3.setTag("*121");
            Button bt4 = new Button(getContext());
            bt4.setText("MA LIGNE");
            bt4.setTag("*111");
            Button bt5 = new Button(getContext());
            bt5.setText("RECHARGEZ MOI");
            bt5.setTag("*114");
            Button bt6 = new Button(getContext());
            bt6.setText("TRANSFERT CREDIT");
            bt6.setTag("*116");
            Button bt7 = new Button(getContext());
            bt7.setText("SOS CREDIT");
            bt7.setTag("*122");
            Button bt8 = new Button(getContext());
            bt8.setText("BYE BYE");
            bt8.setTag("*118");
            Button bt9 = new Button(getContext());
            bt9.setText("BEST ROAMING");
            bt9.setTag("*145");
            Button bt10 = new Button(getContext());
            bt10.setText("INFO DISPO");
            bt10.setTag("*110");
            Button bt11 = new Button(getContext());
            bt11.setText("FORFAIT INTERNET");
            bt11.setTag("*124");
            Button bt12 = new Button(getContext());
            bt12.setText("RAPPELEZ MOI");
            bt12.setTag("*115");
            Button bt13 = new Button(getContext());
            bt13.setText("SUIVI FORFAIT");
            bt13.setTag("*104*3");

            listBt.add(bt1);
            listBt.add(bt2);
            listBt.add(bt3);
            listBt.add(bt4);
            listBt.add(bt5);
            listBt.add(bt6);
            listBt.add(bt7);
            listBt.add(bt8);
            listBt.add(bt9);
            listBt.add(bt10);
            listBt.add(bt11);
            listBt.add(bt12);
            listBt.add(bt13);
            adapter = new RecyclerButton(listBt, getContext());
            recyclerView.setAdapter(adapter);
        }catch (Exception e){
            e.printStackTrace();
        }

        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_orange, container, false);
    }

}
