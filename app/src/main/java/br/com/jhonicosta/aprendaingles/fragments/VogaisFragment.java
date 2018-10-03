package br.com.jhonicosta.aprendaingles.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import br.com.jhonicosta.aprendaingles.R;

public class VogaisFragment extends Fragment {

    private ImageButton um, dois, tres, quatro, cinco, seis;

    public VogaisFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_vogais, container, false);

        return view;
    }

}
