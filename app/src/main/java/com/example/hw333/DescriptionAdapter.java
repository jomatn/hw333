package com.example.hw333;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DescriptionAdapter extends RecyclerView.Adapter<DescriptionAdapter.DescriptionViewHolder> {
    private List<Description> desList;

    public DescriptionAdapter(List<Description> desList) {
        this.desList = desList;
    }

    @NonNull
    @Override
    public DescriptionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_images, parent, false);
        return new DescriptionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DescriptionViewHolder holder, int position) {
        Description description = desList.get(position);
        holder.textViewDescription.setText(description.getTitle());
    }

    @Override
    public int getItemCount() {
        return desList.size();
    }

    public static class DescriptionViewHolder extends RecyclerView.ViewHolder {
        TextView textViewDescription;

        public DescriptionViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewDescription = itemView.findViewById(R.id.tv_description);
        }
    }
}
