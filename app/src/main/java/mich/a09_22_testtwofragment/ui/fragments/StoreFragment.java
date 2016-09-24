package mich.a09_22_testtwofragment.ui.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;

import mich.a09_22_testtwofragment.Config;
import mich.a09_22_testtwofragment.R;
import mich.a09_22_testtwofragment.model.StoreTest;
import mich.a09_22_testtwofragment.ui.adapters.StoreAdapter;

public class StoreFragment extends Fragment {
    private Context context = getActivity();
    private RecyclerView recycler;
    private ArrayList<StoreTest> stores;

    private StoreAdapter adapter;


    //private OnFragmentInteractionListener mListener;

    public StoreFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_store, container, false);
        stores = Config.getStoreData();
        recycler = (RecyclerView) v.findViewById(R.id.recycler_view_store);
        recycler.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recycler.setLayoutManager(linearLayoutManager);

        adapter = new StoreAdapter(context, stores);
        recycler.setAdapter(adapter);

        // временно
        Button btnToToolsFragment = (Button) v.findViewById(R.id.boton_to_tools_fragment);
        btnToToolsFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                Fragment fragmentTools = new ToolsFragment();
                fragmentTransaction.replace(R.id.container, fragmentTools);
                fragmentTransaction.commit();
            }
        });

        return v;
    }
}
