package test.rock.com.test.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import test.rock.com.test.R;

public class InvitationAdapter extends RecyclerView.Adapter<InvitationAdapter.InvitationViewHolder>{
    private List<String> horizontalGrocderyList;
    Context context;

    public InvitationAdapter(List<String> horizontalGrocderyList, Context context){
        this.horizontalGrocderyList= horizontalGrocderyList;
        this.context = context;
    }

    @Override
    public InvitationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflate the layout file
        View groceryProductView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_invitation, parent, false);
        InvitationViewHolder gvh = new InvitationViewHolder(groceryProductView);
        return gvh;
    }

    @Override
    public void onBindViewHolder(InvitationViewHolder holder, final int position) {

        holder.count.setText((position+1)+"");

    }

    @Override
    public int getItemCount() {
//        return horizontalGrocderyList.size();
        return 9;
    }

    public class InvitationViewHolder extends RecyclerView.ViewHolder {
//        ImageView imageView;
        TextView count;
        public InvitationViewHolder(View view) {
            super(view);
//            imageView=view.findViewById(R.id.idProductImage);
            count = view.findViewById(R.id.tvCount);
        }
    }
}
