package test.rock.com.test.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import test.rock.com.test.R;
import test.rock.com.test.adapters.InvitationAdapter;
import test.rock.com.test.adapters.PostAdapter;

public class HomeFragment extends Fragment {

    @BindView(R.id.rvInvitations)
    RecyclerView rvInvitations;
    @BindView(R.id.rvPosts)
    RecyclerView rvPosts;
    private InvitationAdapter groceryAdapter;
    private PostAdapter postAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this, view);

        groceryAdapter = new InvitationAdapter(null, getActivity());
        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        rvInvitations.setLayoutManager(horizontalLayoutManager);
        rvInvitations.setAdapter(groceryAdapter);


        postAdapter = new PostAdapter(null, getActivity());
        LinearLayoutManager verticalLahoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL,false);
        rvPosts.setLayoutManager(verticalLahoutManager);
        rvPosts.setHasFixedSize(true);
        rvPosts.setAdapter(postAdapter);
        return view;
    }
}
