package llbean.calculadoraandroid;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class NumbersFragment extends Fragment implements View.OnClickListener {

    public static final String TAG = NumbersFragment.class.getName();

    public static NumbersFragment newInstance() {
        return new NumbersFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.numbers_table, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button btn0 = (Button) view.findViewById(R.id.number0);
        Button btn1 = (Button) view.findViewById(R.id.number1);
        Button btn2 = (Button) view.findViewById(R.id.number2);
        Button btn3 = (Button) view.findViewById(R.id.number3);
        Button btn4 = (Button) view.findViewById(R.id.number4);
        Button btn5 = (Button) view.findViewById(R.id.number5);
        Button btn6 = (Button) view.findViewById(R.id.number6);
        Button btn7 = (Button) view.findViewById(R.id.number7);
        Button btn8 = (Button) view.findViewById(R.id.number8);
        Button btn9 = (Button) view.findViewById(R.id.number9);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.number0:
                TextFieldsFragment.getInstance().setOperacion("0");
                break;
            case R.id.number1:
                TextFieldsFragment.getInstance().setOperacion("1");
                break;
            case R.id.number2:
                TextFieldsFragment.getInstance().setOperacion("2");
                break;
            case R.id.number3:
                TextFieldsFragment.getInstance().setOperacion("3");
                break;
            case R.id.number4:
                TextFieldsFragment.getInstance().setOperacion("4");
                break;
            case R.id.number5:
                TextFieldsFragment.getInstance().setOperacion("5");
                break;
            case R.id.number6:
                TextFieldsFragment.getInstance().setOperacion("6");
                break;
            case R.id.number7:
                TextFieldsFragment.getInstance().setOperacion("7");
                break;
            case R.id.number8:
                TextFieldsFragment.getInstance().setOperacion("8");
                break;
            case R.id.number9:
                TextFieldsFragment.getInstance().setOperacion("9");
                break;
        }
    }
}
