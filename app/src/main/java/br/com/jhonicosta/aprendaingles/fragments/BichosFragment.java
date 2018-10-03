package br.com.jhonicosta.aprendaingles.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import br.com.jhonicosta.aprendaingles.R;

public class BichosFragment extends Fragment {

    private ImageButton cao, gato, leao, macaco, ovelha, vaca;

    public BichosFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bichos, container, false);

        cao = view.findViewById(R.id.cao);

        return view;
    }

}
