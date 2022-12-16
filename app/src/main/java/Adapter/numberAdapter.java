package Adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.recyclerview.R;
import java.util.List;
public class numberAdapter extends RecyclerView.Adapter<numberAdapter.MyViewHolder> {
    public numberAdapter(List<number> number) {
        mNumber = number;
    }

    private List<number> mNumber ;


    @NonNull
    @Override
    public numberAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viewHolder = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new MyViewHolder(viewHolder);
    }

    @Override
    public void onBindViewHolder(@NonNull numberAdapter.MyViewHolder holder, int position) {
        holder.mTextView.setText(String.valueOf(mNumber.get(position).getNum()));
    }

    @Override
    public int getItemCount() {
        return mNumber.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView mTextView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextView = itemView.findViewById(R.id.item_text);
        }
    }
}
