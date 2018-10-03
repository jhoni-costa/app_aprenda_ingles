package br.com.jhonicosta.aprendaingles.fragments;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import br.com.jhonicosta.aprendaingles.R;

public class NumerosFragment extends Fragment implements View.OnClickListener {

    private ImageButton um, dois, tres, quatro, cinco, seis;
    private MediaPlayer mediaPlayer;

    public NumerosFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_numeros, container, false);

        um = view.findViewById(R.id.um);
        dois = view.findViewById(R.id.dois);
        tres = view.findViewById(R.id.tres);
        quatro = view.findViewById(R.id.quatro);
        cinco = view.findViewById(R.id.cinco);
        seis = view.findViewById(R.id.seis);

        um.setOnClickListener(this);
        dois.setOnClickListener(this);
        tres.setOnClickListener(this);
        quatro.setOnClickListener(this);
        cinco.setOnClickListener(this);
        seis.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.um:
                tocarSom(R.raw.one);
                break;
            case R.id.dois:
                tocarSom(R.raw.two);
                break;
            case R.id.tres:
                tocarSom(R.raw.three);
                break;
            case R.id.quatro:
                tocarSom(R.raw.four);
                break;
            case R.id.cinco:
                tocarSom(R.raw.five);
                break;
            case R.id.seis:
                tocarSom(R.raw.six);
                break;
        }
    }

    private void tocarSom(int som) {
        mediaPlayer = MediaPlayer.create(getActivity(), som);
        if (mediaPlayer != null) {
            mediaPlayer.start();
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mediaPlayer.release();
                }
            });
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if(mediaPlayer != null){
            mediaPlayer.release();
        }
    }
}
