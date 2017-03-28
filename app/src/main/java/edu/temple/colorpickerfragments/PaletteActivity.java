package edu.temple.colorpickerfragments;

import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;

public class PaletteActivity extends Activity implements PaletteFragment.PaletteInterface {

    CanvasFragment canvasFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);

        canvasFragment = new CanvasFragment();
        addFragment(new PaletteFragment(), R.id.frag1);
        addFragment(canvasFragment, R.id.frag2);
    }

    private void addFragment (Fragment fragment, int containerId) {
        getFragmentManager().beginTransaction().replace(containerId, fragment).commit();
    }

    @Override
    public void sendColor(String color) {
        canvasFragment.setColor(color);
    }
}
