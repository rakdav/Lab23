package ru.myitschool.lab23;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ru.myitschool.lab23.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements MoneyEvent {
    private static final String CUSTOM="custom";
    private ActivityMainBinding binding;
    private MoneyDialogFragment dialogFragment;
    private List<Money> list;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        list=new ArrayList<>();
        dialogFragment=new MoneyDialogFragment();
        binding.addFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogFragment.show(getSupportFragmentManager(),CUSTOM);
            }
        });
    }
    @Override
    public void add(String type, double money, Date date) {
        list.add(new Money(type,money, date));
    }
}
