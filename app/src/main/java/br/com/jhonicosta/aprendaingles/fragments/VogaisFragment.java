package br.com.jhonicosta.aprendaingles.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.jhonicosta.aprendaingles.R;

public class VogaisFragment extends Fragment {

    public VogaisFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_vogais, container, false);
    }

}
