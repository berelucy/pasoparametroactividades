package net.berenice.contact;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    private String[] mDataset;
    Context ctx;

    private List<Contact> contactsList;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView textView;
        public MyViewHolder(View v) {
            super(v);
            textView = v.findViewById(R.id.txttext);
        }
    }
    ArrayList<String> datos;
    public Adapter(ArrayList<String> dataSet) {
        datos=dataSet;

    }

    public Adapter(ArrayList<String> dataSet, Context ctx) {
        datos=dataSet;
        this.ctx = ctx;

    }


    @NonNull
    @Override
    public Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v =  LayoutInflater.from(parent.getContext())
                .inflate(R.layout.my_text_view, parent, false);

        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.MyViewHolder holder, int position) {
        holder.textView.setText(datos.get(position));
        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ctx, "Presionado;" + ((TextView) v).getText(), Toast.LENGTH_LONG).show();
            }
            });
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }
}
