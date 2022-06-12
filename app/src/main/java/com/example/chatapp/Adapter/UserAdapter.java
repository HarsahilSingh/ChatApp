package com.example.chatapp.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.chatapp.MessageActivity;
import com.example.chatapp.Model.User;
import com.example.chatapp.R;


import java.util.List;


//Adapter class for the users
public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    //Defining the varibales
    private Context mContext;
    private List<User> mUsers;
    private boolean ischat;

    //Constructor
    public UserAdapter(Context mContext, List<User> mUsers, boolean ischat) {
        this.mContext = mContext;
        this.mUsers = mUsers;
        this.ischat = ischat;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Inflating the view
        View view = LayoutInflater.from(mContext).inflate(R.layout.user_item,parent,false);
        return  new UserAdapter.ViewHolder(view);
    }

    //Binding the view
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //Setiing the data into the fields
        User  user = mUsers.get(position);
        holder.username.setText(user.getUsername());
        if(user.getImageUrl().equals("default")){
            holder.profile_image.setImageResource(R.mipmap.ic_launcher);
        }else{
            Glide.with(mContext).load(user.getImageUrl()).into(holder.profile_image);
        }

        //Setting the on click listener on the users
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent to move to the message activity
                Intent intent = new Intent(mContext, MessageActivity.class);
                intent.putExtra("userid",user.getId());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mUsers.size();
    }

    //View holder for the User
    public class ViewHolder extends  RecyclerView.ViewHolder{
        public TextView username;
        private ImageView img_on;
        private ImageView img_off;
        public ImageView profile_image;

        public ViewHolder(View itemView){
            super(itemView);

            username = itemView.findViewById(R.id.username);
            profile_image=itemView.findViewById(R.id.profile_image);
            img_on=itemView.findViewById(R.id.img_on);
            img_off=itemView.findViewById(R.id.img_off);
        }
    }
}
