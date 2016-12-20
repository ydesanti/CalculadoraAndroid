package llbean.calculadoraandroid;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TextFieldsFragment extends Fragment {

    public static final String TAG = TextFieldsFragment.class.getName();
    private static TextFieldsFragment currentInstance;

    TextView operacion;
    TextView resultado;

    public static TextFieldsFragment newInstance() {
        currentInstance = new TextFieldsFragment();
        return currentInstance;
    }

    public static TextFieldsFragment getInstance() {

        if (currentInstance == null)
            currentInstance = newInstance();

        return currentInstance;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.textfields_linear, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        currentInstance = this;

        operacion = (TextView) view.findViewById(R.id.txtViewOperacion);
        resultado = (TextView) view.findViewById(R.id.txtViewResultado);
    }

    public Boolean setOperacion (String valor) {
        try {
            operacion.setText(operacion.getText() + valor);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public Boolean setResultado (String valor) {
        try {
            resultado.setText(valor);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public Boolean clearTexts() {
        try {
            operacion.setText("");
            resultado.setText("");
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
