package edu.temple.colorpickerfragments;


import android.graphics.Color;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public class CanvasFragment extends Fragment {

    View layout;
    public CanvasFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        layout = inflater.inflate(R.layout.fragment_canvas, container, false);
        return layout;
    }

    public void setColor(String color) {
        layout.setBackgroundColor(Color.parseColor(color));
    }
}
