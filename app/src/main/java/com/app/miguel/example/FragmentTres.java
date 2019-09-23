package com.app.miguel.example;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.snackbar.Snackbar;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTres extends Fragment {

    private Button button;
    private MainActivity mainActivity;

    public FragmentTres() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_tres, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //Instanciamos la actividad que hace de contenedor a los fragmentos para
        //poder tener una referencia de la misma en caso de ser necesario. (Almacenar objetos,
        //tener acceso a métodos privados, pasar como parámetro, o utilizar de contexto, etc)
        mainActivity = (MainActivity) getContext();


        button = view.findViewById(R.id.buttonTres);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Al hacer click en el boton, mostramos un SnackBar con un Mensaje
                Snackbar snackbar = Snackbar.make(getView(), "Llegaste al paso 3!", Snackbar.LENGTH_SHORT);
                snackbar.show();
            }
        });
    }

}
