package ru.myitschool.lab23;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class MoneyDialogFragment extends DialogFragment {
    private String[] spinner_choice={"Income","Expenses"};
    private Spinner spinner;
    private EditText amount;
    private Button add_button;
    private MoneyEvent moneyEvent;
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.money_dialog, null);
        spinner=view.findViewById(R.id.type_spinner);
        amount=view.findViewById(R.id.expense_amount_edit_text);
        add_button=view.findViewById(R.id.add_button);
        ArrayAdapter<String> adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_spinner_item, spinner_choice);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        builder.setTitle("Add money").setView(view);
        return builder.create();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        moneyEvent=(MoneyEvent) context;
    }
}
