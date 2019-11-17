package com.app.chioru2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //array for the media player objects
    //private BiMap<MediaPlayer, Integer> audio = HashBiMap.create();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //creates the custom toolbar
        // Toolbar toolbar =(Toolbar) this.findViewById(R.id.app_bar);
        //setSupportActionBar(toolbar);


        //creating Media player for the particular sound
        final MediaPlayer Vineri = MediaPlayer.create(this, R.raw.vineri);
        final MediaPlayer Glumele = MediaPlayer.create(this, R.raw.gata_cu_glumele);
        final MediaPlayer scuze = MediaPlayer.create(this, R.raw.scuze);
        final MediaPlayer arfe = MediaPlayer.create(this, R.raw.arfe );
        final MediaPlayer bulgaresti = MediaPlayer.create(this, R.raw.bulgaresti);
        final MediaPlayer estiBine = MediaPlayer.create(this, R.raw.esti_bine);
        final MediaPlayer nuTie = MediaPlayer.create(this, R.raw.nu_tie);
        final MediaPlayer Hitler = MediaPlayer.create(this,R.raw.hitler);
        final MediaPlayer puscarie = MediaPlayer.create(this, R.raw.puscarie);
        final MediaPlayer curaj = MediaPlayer.create(this,R.raw.ai_curaj);
        final MediaPlayer frunte = MediaPlayer.create(this,R.raw.ce_frunte_ai);
        final MediaPlayer hua = MediaPlayer.create(this,R.raw.huaaaa);
        final MediaPlayer bere = MediaPlayer.create(this,R.raw.iesim_la_o_bere);
        final MediaPlayer injuri = MediaPlayer.create(this,R.raw.ii_injuri);
        //adding all the media player objects to the array
        //audio.put(Vineri,0);
        //audio.put(Glumele,0);
        //audio.put(scuze,0);
        //audio.put(arfe,0);

        //particular button
        Button playVineri = (Button) this.findViewById(R.id.Vineri);

        playVineri.setOnClickListener(new View.OnClickListener() {
            //plays the sound onClick if the audio is not playing or pauses it otherwise
            public void onClick(View v) {
                int k = 0;
                /*for(MediaPlayer mp: audio.keySet()){
                    if(mp.isPlaying()){
                        k++;
                    }
                }*/
                if(Vineri.isPlaying()) {
                    //audio.put(Vineri, 1);
                    Vineri.pause();
                }
                else {
                    Vineri.start();

                }
            }
        });

        //Creating Media player for the particular sound


        //particular button
        Button playGlumele = (Button) this.findViewById(R.id.Glumele);

        playGlumele.setOnClickListener(new View.OnClickListener() {
            //plays the sound onClick if the audio is not playing or pauses it otherwise
            public void onClick(View v) {
                if(Glumele.isPlaying())
                    Glumele.pause();
                else
                    Glumele.start();
            }
        });



        Button playScuze = (Button) this.findViewById(R.id.scuze);

        playScuze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(scuze.isPlaying()){
                    scuze.pause();
                }
                else{
                    scuze.start();
                }
            }
        });



        Button playArfe = (Button) this.findViewById(R.id.Arfe);

        playArfe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(arfe.isPlaying()){
                    arfe.pause();
                }
                else{
                    arfe.start();
                }
            }
        });

        Button playBulgaresti = (Button) this.findViewById(R.id.Bulgaresti);
        playBulgaresti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bulgaresti.isPlaying()){
                    bulgaresti.pause();
                }
                else{
                    bulgaresti.start();
                }
            }
        });

        Button playEstiBine = (Button) this.findViewById(R.id.EstiBine);
        playEstiBine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(estiBine.isPlaying()){
                    estiBine.pause();
                }
                else{
                    estiBine.start();
                }
            }
        });

        Button playNuTie = (Button) this.findViewById(R.id.nu_tie);
        playNuTie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nuTie.isPlaying()){
                    nuTie.pause();
                }
                else{
                    nuTie.start();
                }
            }
        });
        Button playHitler = (Button) this.findViewById(R.id.Hitler);

        playHitler.setOnClickListener(new View.OnClickListener() {
            //plays the sound onClick if the audio is not playing or pauses it otherwise
            public void onClick(View v) {
                int k = 0;
                /*for(MediaPlayer mp: audio.keySet()){
                    if(mp.isPlaying()){
                        k++;
                    }
                }*/
                if(Hitler.isPlaying()) {
                    //audio.put(Vineri, 1);
                    Hitler.pause();
                }
                else {
                    Hitler.start();

                }
            }
        });
        Button playPuscarie = (Button) this.findViewById(R.id.puscarie);

        playPuscarie.setOnClickListener(new View.OnClickListener() {
            //plays the sound onClick if the audio is not playing or pauses it otherwise
            public void onClick(View v) {
                int k = 0;
                /*for(MediaPlayer mp: audio.keySet()){
                    if(mp.isPlaying()){
                        k++;
                    }
                }*/
                if(puscarie.isPlaying()) {
                    //audio.put(Vineri, 1);
                    puscarie.pause();
                }
                else {
                    puscarie.start();

                }
            }
        });

        Button playCuraj= (Button) this.findViewById(R.id.curaj);

        playCuraj.setOnClickListener(new View.OnClickListener() {
            //plays the sound onClick if the audio is not playing or pauses it otherwise
            public void onClick(View v) {
                int k = 0;
                /*for(MediaPlayer mp: audio.keySet()){
                    if(mp.isPlaying()){
                        k++;
                    }
                }*/
                if(curaj.isPlaying()) {
                    //audio.put(Vineri, 1);
                    curaj.pause();
                }
                else {
                    curaj.start();

                }
            }
        });

        Button playFrunte = (Button) this.findViewById(R.id.frunte);

        playFrunte.setOnClickListener(new View.OnClickListener() {
            //plays the sound onClick if the audio is not playing or pauses it otherwise
            public void onClick(View v) {
                int k = 0;
                /*for(MediaPlayer mp: audio.keySet()){
                    if(mp.isPlaying()){
                        k++;
                    }
                }*/
                if(frunte.isPlaying()) {
                    //audio.put(Vineri, 1);
                    frunte.pause();
                }
                else {
                    frunte.start();

                }
            }
        });

        Button playHua = (Button) this.findViewById(R.id.hua);

        playHua.setOnClickListener(new View.OnClickListener() {
            //plays the sound onClick if the audio is not playing or pauses it otherwise
            public void onClick(View v) {
                int k = 0;
                /*for(MediaPlayer mp: audio.keySet()){
                    if(mp.isPlaying()){
                        k++;
                    }
                }*/
                if(hua.isPlaying()) {
                    //audio.put(Vineri, 1);
                    hua.pause();
                }
                else {
                    hua.start();

                }
            }
        });

        Button playBere = (Button) this.findViewById(R.id.bere);

        playBere.setOnClickListener(new View.OnClickListener() {
            //plays the sound onClick if the audio is not playing or pauses it otherwise
            public void onClick(View v) {
                int k = 0;
                /*for(MediaPlayer mp: audio.keySet()){
                    if(mp.isPlaying()){
                        k++;
                    }
                }*/
                if(bere.isPlaying()) {
                    //audio.put(Vineri, 1);
                    bere.pause();
                }
                else {
                    bere.start();

                }
            }
        });

        Button playInjuri = (Button) this.findViewById(R.id.injuri);

        playInjuri.setOnClickListener(new View.OnClickListener() {
            //plays the sound onClick if the audio is not playing or pauses it otherwise
            public void onClick(View v) {
                int k = 0;
                /*for(MediaPlayer mp: audio.keySet()){
                    if(mp.isPlaying()){
                        k++;
                    }
                }*/
                if(injuri.isPlaying()) {
                    //audio.put(Vineri, 1);
                    injuri.pause();
                }
                else {
                    injuri.start();

                }
            }
        });
    }

    /*public HashMap<MediaPlayer, Integer> reset(HashMap<MediaPlayer, Integer> map, MediaPlayer mp){

        for(Integer value: map.values()){
            if(map.)
        }
    }*/
}
