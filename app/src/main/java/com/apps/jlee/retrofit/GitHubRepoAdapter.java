package com.apps.jlee.retrofit;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class GitHubRepoAdapter extends RecyclerView.Adapter<GitHubRepoAdapter.ViewHolder>
{
    private List<GitHubRepo> list;

    public GitHubRepoAdapter(Context c, List<GitHubRepo> list)
    {
        this.list = list;
    }

    @Override
    public GitHubRepoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.repo_listview_item_, viewGroup, false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull GitHubRepoAdapter.ViewHolder viewHolder, int i)
    {
        GitHubRepo item = list.get(i);
        String message = item.getName();
        viewHolder.repo_name.setText(message);
    }

    @Override
    public int getItemCount()
    {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView repo_name;

        public ViewHolder(View itemView)
        {
            super(itemView);

            repo_name = itemView.findViewById(R.id.repo_name_tv);

            itemView.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {

                }
            });
        }
    }
}
