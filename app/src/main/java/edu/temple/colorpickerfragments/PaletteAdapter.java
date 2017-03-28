package edu.temple.colorpickerfragments;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.TextView;

public class PaletteAdapter extends BaseAdapter {

    static final String[] actualColors = {"White", "Red", "Yellow", "Green", "Blue", "Cyan", "Magenta", "Gray", "Aqua", "Maroon", "Navy", "Olive", "Purple", "Silver", "Teal"};
    Context context;
    String[] colors;

    public PaletteAdapter (Context c, String[] colors) {
        this.context = c;
        this.colors = colors;
    }

    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object getItem(int position) {
        return colors[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        GridLayout gl = new GridLayout(context);

        TextView colorTextView = new TextView(context);
        colorTextView.setText(colors[position]);
        colorTextView.setTextSize(25);

        gl.addView(colorTextView);
        gl.setBackgroundColor(Color.parseColor(actualColors[position]));
        return gl;
    }
}
