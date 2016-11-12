package com.upmoon.alex.moongameoflife;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class MenuFragment extends Fragment {

    private TextView menuText;

    private Button newGameButton, loadLocalButton, loadOnlineButton, resetLocalButton;

    public MenuFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu, container, false);

        menuText = (TextView) view.findViewById(R.id.menu_text);
        newGameButton = (Button) view.findViewById(R.id.new_game);
        loadLocalButton = (Button) view.findViewById(R.id.load_local);
        loadOnlineButton = (Button) view.findViewById(R.id.load_online);


        /*
        * This is me playing around with changing the ui
        *
        * */
        final int length = 10;
        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {
                for( int i=0 ; i<length; i++) {
                    getActivity().runOnUiThread(new Runnable() {

                        @Override
                        public void run() {
                            menuText.setText(Integer(i).toString());
                        }
                    }) ;
                    i++;

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        });
        t.start();

        newGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        loadLocalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        loadOnlineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return view;
    }
}
