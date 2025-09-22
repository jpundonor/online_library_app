package cl.unab.libreriaonline;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class List extends Fragment {

    private Button btn, btn2, btn3;

    public List() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        btn = view.findViewById(R.id.button);
        btn2 = view.findViewById(R.id.button2);
        btn3 = view.findViewById(R.id.button3);

        btn.setOnClickListener(v -> {
            ListDirections.ActionListToDetails action =
                    ListDirections.actionListToDetails(
                            "El Resplandor",
                            getString(R.string.resplandor_long_description),
                            R.drawable.el_resplandor
                    );
            Navigation.findNavController(v).navigate(action);
        });

        btn2.setOnClickListener(v -> {
            ListDirections.ActionListToDetails action =
                    ListDirections.actionListToDetails(
                            "La niebla",
                            getString(R.string.niebla_long_description),
                            R.drawable.la_niebla
                    );
            Navigation.findNavController(v).navigate(action);
        });

        btn3.setOnClickListener(v -> {
            ListDirections.ActionListToDetails action =
                    ListDirections.actionListToDetails(
                            "Misery",
                            getString(R.string.misery_long_description),
                            R.drawable.misery
                    );
            Navigation.findNavController(v).navigate(action);
        });

        return view;
    }
}