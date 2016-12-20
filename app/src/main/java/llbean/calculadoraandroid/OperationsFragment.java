package llbean.calculadoraandroid;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class OperationsFragment extends Fragment implements View.OnClickListener {

    public static final String TAG = OperationsFragment.class.getName();

    public static OperationsFragment newInstance() {
        return new OperationsFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.operations_table, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button btnC = (Button) view.findViewById(R.id.btnC);
        Button btnCE = (Button) view.findViewById(R.id.btnCE);
        Button btnSuma = (Button) view.findViewById(R.id.btnSuma);
        Button btnMult = (Button) view.findViewById(R.id.btnMult);
        Button btnResta = (Button) view.findViewById(R.id.btnResta);
        Button btnDivision = (Button) view.findViewById(R.id.btnDivision);
        Button btnIgual = (Button) view.findViewById(R.id.btnIgual);

        btnC.setOnClickListener(this);
        btnCE.setOnClickListener(this);
        btnSuma.setOnClickListener(this);
        btnMult.setOnClickListener(this);
        btnResta.setOnClickListener(this);
        btnDivision.setOnClickListener(this);
        btnIgual.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnC:
                TextFieldsFragment.getInstance().clearTexts();
                break;
            case R.id.btnCE:
                TextFieldsFragment.getInstance().clearTexts();
                break;
            case R.id.btnSuma:
                TextFieldsFragment.getInstance().setOperacion("+");
                break;
            case R.id.btnMult:
                TextFieldsFragment.getInstance().setOperacion("*");
                break;
            case R.id.btnResta:
                TextFieldsFragment.getInstance().setOperacion("-");
                break;
            case R.id.btnDivision:
                TextFieldsFragment.getInstance().setOperacion("/");
                break;
            case R.id.btnIgual:
                TextFieldsFragment.getInstance().setResultado("DEMO");
                Toast.makeText(getContext(), "Only Available on Pro Version", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
