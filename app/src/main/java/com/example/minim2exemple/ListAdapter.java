package com.example.minim2exemple;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.minim2exemple.API.Followers;
import com.example.minim2exemple.API.User;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyViewHolder> {

    private List<User> dades;
    private LayoutInflater mInflater;
    private Context context;

    public ListAdapter(List<User> reposList, Context context) {
        this.dades = reposList;
        this.mInflater = LayoutInflater.from((Context) context);
        this.context = (Context) context;
    }


    @Override
    public ListAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = mInflater.inflate(R.layout.activity_followers_list, null);
        return new ListAdapter.MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ListAdapter.MyViewHolder holder, int position) {
        holder.bindData(dades.get(position));
    }

    @Override
    public int getItemCount() {
        return dades.size();
    }

    public void setItems(List<User> items){
        dades=items;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView username;

        MyViewHolder(View itemView){
            super(itemView);
            username=itemView.findViewById(R.id.NameTextView);
            image=itemView.findViewById(R.id.imageView2);
        }

        void bindData(final User repo){
            username.setText(repo.getLogin());
            Picasso.get().load(repo.getAvatar_url()).into(image);

        }

    }
}
