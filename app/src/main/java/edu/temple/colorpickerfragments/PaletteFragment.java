package edu.temple.colorpickerfragments;

import android.content.res.Resources;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridLayout;
import android.widget.GridView;


/**
 * A simple {@link Fragment} subclass.
 */
public class PaletteFragment extends Fragment {

    static final String[] actualColors = {"White", "Red", "Yellow", "Green", "Blue", "Cyan", "Magenta", "Gray", "Aqua", "Maroon",
            "Navy", "Olive", "Purple", "Silver", "Teal"};


    public PaletteFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View layout = inflater.inflate(R.layout.fragment_palette, container, false);

        GridView gridView = (GridView) layout.findViewById(R.id.grid_view);

        Resources res = getResources();
        String[] myColors = res.getStringArray(R.array.colors);


        final PaletteAdapter myAdapter = new PaletteAdapter(getActivity(), myColors);
        gridView.setAdapter(myAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                GridLayout gl = (GridLayout) view;
                String colorText = actualColors[position];
                ((PaletteInterface) getActivity()).sendColor(colorText);
            }
        });
        return layout;
    }


    public interface PaletteInterface {
        void sendColor (String color);

    }
}
