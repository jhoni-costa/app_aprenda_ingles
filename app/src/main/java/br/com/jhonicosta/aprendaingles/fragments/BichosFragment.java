package br.com.jhonicosta.aprendaingles.fragments;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import br.com.jhonicosta.aprendaingles.R;

public class BichosFragment extends Fragment implements View.OnClickListener {

    private ImageButton cao, gato, leao, macaco, ovelha, vaca;
    private MediaPlayer mediaPlayer;

    public BichosFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bichos, container, false);

        cao = view.findViewById(R.id.cao);
        gato = view.findViewById(R.id.gato);
        leao = view.findViewById(R.id.leao);
        macaco = view.findViewById(R.id.macaco);
        ovelha = view.findViewById(R.id.ovelha);
        vaca = view.findViewById(R.id.vaca);

        cao.setOnClickListener(this);
        gato.setOnClickListener(this);
        leao.setOnClickListener(this);
        macaco.setOnClickListener(this);
        ovelha.setOnClickListener(this);
        vaca.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cao:
                tocarSom(R.raw.dog);
                break;
            case R.id.gato:
                tocarSom(R.raw.cat);
                break;
            case R.id.leao:
                tocarSom(R.raw.lion);
                break;
            case R.id.macaco:
                tocarSom(R.raw.monkey);
                break;
            case R.id.ovelha:
                tocarSom(R.raw.sheep);
                break;
            case R.id.vaca:
                tocarSom(R.raw.cow);
                break;
            default:
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
}
