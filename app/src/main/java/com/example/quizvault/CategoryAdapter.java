package com.example.quizvault;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {
    private Context content;
    private List<CategoryModel> categoryList;
    Public CategoryAdapter(Context context, List<CategoryModel> categoryList){
        this.context = context;
        this.category = categoryList;
    }


    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_quiz_vault, parent, false);
        return new CategoryViewHolder(View);
    }

    public void onBindViewHolder(@NonNull CAtegoryViewHolder holder, int position){
        CategoryModel category = categoryList.get(position);

        holder.tvTitle.setText(category.getTitle());
        holder.tvSubtitle.setText(category.getQuestionCount() + " Questions");
        holder.imgSubject.setImageResource(category.getImageResId());

        if(category.getBackgroundColor() != 0){
            holder.cardSubject.setCardBackgroundColor(category.getBackGroundColor());
        }

        holder.cardSubject.setOnClickListener(v -> {
            Intent i1 = new Intent(context, QuizActivity.class);
            i1.putExtra("SELECTED_SUBJECT", category.getTitle());
                context.startActivity(i1);

        });

    }
    @Override
    public int getItemCount() {
        return categoryList.size();
    }

    public static class CategoryViewHolder extends RecyclerView.ViewHolder {
        CardView cardSubject;
        ImageView imgSubject;
        TextView tvTitle, tvSubtitle;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);


            cardSubject = itemView.findViewById(R.id.cardSubject);
            imgSubject = itemView.findViewById(R.id.imgMath);
            tvTitle = itemView.findViewById(R.id.textMath);
            tvSubtitle = itemView.findViewById(R.id.textView2);
        }
    }
}
