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

public class RecyclerService extends RecyclerView.Adapter {

    Context context;
    ArrayList<String> listServices,nums;
    HolderService viewHolder;
    DecimalFormat df = new DecimalFormat("0.##");

    public RecyclerService(ArrayList<String> services, ArrayList<String> nums , Context context) {

        this.listServices = services;
        this.nums = nums;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        try {
            View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.card_service, parent, false);
            viewHolder = new HolderService(v, listServices,nums, context);

        }catch (Exception e){
            e.printStackTrace();
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        try {
            viewHolder = (HolderService) holder;


            viewHolder.tvNum.setText(nums.get(position));
            viewHolder.tvService.setText(listServices.get(position));
        }catch (Exception e){
            e.printStackTrace();
        }


    }

    @Override
    public int getItemCount() {
        return listServices.size();
    }
}
