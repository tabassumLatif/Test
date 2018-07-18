package test.rock.com.test.adapters;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import test.rock.com.test.R;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder>{
    private List<String> horizontalGrocderyList;
    Context context;

    public PostAdapter(List<String> horizontalGrocderyList, Context context){
        this.horizontalGrocderyList= horizontalGrocderyList;
        this.context = context;
    }

    @Override
    public PostViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflate the layout file
        View groceryProductView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_post, parent, false);
        PostViewHolder gvh = new PostViewHolder(groceryProductView);
        gvh.cardView.setCardBackgroundColor(Color.TRANSPARENT);
        gvh.cardView.setBackgroundColor(Color.TRANSPARENT);

        return gvh;
    }

    @Override
    public void onBindViewHolder(PostViewHolder holder, final int position) {

//        holder.count.setText((position+1)+"");

    }

    @Override
    public int getItemCount() {
//        return horizontalGrocderyList.size();
        return 2;
    }

    public class PostViewHolder extends RecyclerView.ViewHolder {
                CardView cardView;
//        TextView count;
        public PostViewHolder(View view) {
            super(view);
            cardView=view.findViewById(R.id.cardView);
//            count = view.findViewById(R.id.tvCount);
        }
    }
}

