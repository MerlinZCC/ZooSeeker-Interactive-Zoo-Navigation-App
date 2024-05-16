package com.example.zooseeker_jj_zaaz_team_52.ui.Map;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.zooseeker_jj_zaaz_team_52.MainActivity;
import com.example.zooseeker_jj_zaaz_team_52.databinding.FragmentHomeBinding;

public class MapFragment extends Fragment {
    private FragmentHomeBinding binding;
    private ImageView mapView;
    public static Zoomarker zoomarker;
    private ScaleGestureDetector scaleGestureDetector;
    private float scaleFactor = 1.0f;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        MapViewModel homeViewModel =
                new ViewModelProvider(this).get(MapViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        mapView = binding.map;

        // Create a new Zoomarker view
        zoomarker = new Zoomarker(getContext(), null);

        // Create layout parameters
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT, 
                RelativeLayout.LayoutParams.WRAP_CONTENT);

        // Set the margins to position the Zoomarker view
        params.leftMargin = convertDpToPixel(500, getContext()); // replace 400 with your desired x position
        params.topMargin = convertDpToPixel(400, getContext()); // replace 500 with your desired y position
        zoomarker.setLayoutParams(params);
        // Add the Zoomarker view to the RelativeLayout
        binding.relativeLayout.addView(zoomarker);

        zoomarker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.dialog.show();
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    // Method to convert dp to pixels
    public static int convertDpToPixel(float dp, Context context){
        return (int) (dp * ((float) context.getResources().getDisplayMetrics().densityDpi / DisplayMetrics.DENSITY_DEFAULT));
    }
}