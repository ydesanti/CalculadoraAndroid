package llbean.calculadoraandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            return;
        }

        /*getSupportFragmentManager().beginTransaction().add(R.id.layout_text_fields, TextFieldsFragment.newInstance(), TextFieldsFragment.TAG)
                .commit();

        getSupportFragmentManager().beginTransaction().add(R.id.layout_numbers, NumbersFragment.newInstance(), NumbersFragment.TAG)
                .commit();

        getSupportFragmentManager().beginTransaction().add(R.id.layout_operations, OperationsFragment.newInstance(), OperationsFragment.TAG)
                .commit();*/
    }
}
