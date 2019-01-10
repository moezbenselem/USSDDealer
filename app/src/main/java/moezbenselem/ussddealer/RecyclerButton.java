package moezbenselem.ussddealer;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Created by Moez on 23/07/2018.
 */

public class RecyclerButton extends RecyclerView.Adapter {

    Context context;
    ArrayList<Button> listBt;
    HolderButton viewHolder;
    DecimalFormat df = new DecimalFormat("0.##");

    public RecyclerButton(ArrayList<Button> forecasts , Context context) {

        this.listBt = forecasts;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        try {
            View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.card_item, parent, false);
            viewHolder = new HolderButton(v, listBt, context);

        }catch (Exception e){
            e.printStackTrace();
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        try {
            viewHolder = (HolderButton) holder;

            viewHolder.bt.setText(listBt.get(position).getText());
            viewHolder.tv.setText(listBt.get(position).getText());
            viewHolder.bt.setTag(listBt.get(position).getTag());
        }catch (Exception e){
            e.printStackTrace();
        }


    }

    @Override
    public int getItemCount() {
        return listBt.size();
    }
}
