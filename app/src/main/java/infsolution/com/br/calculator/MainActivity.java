package infsolution.com.br.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calcular(View v){
        double resultado = 0;
        EditText ednum1 = (EditText)findViewById(R.id.numero1);
        EditText ednum2 = (EditText)findViewById(R.id.numero2);
        double nume1 =Double.valueOf(ednum1.getText().toString());
        double nume2 =Double.valueOf(ednum2.getText().toString());
        RadioGroup group = (RadioGroup)findViewById(R.id.operacoes);
        switch (group.getCheckedRadioButtonId()){
            case (R.id.soma):
                resultado = nume1+nume2;
                break;
            case(R.id.div):
                if(nume2==0){
                    Toast.makeText(this,"Impossivel dividir por zero",Toast.LENGTH_LONG).show();
                }else{
                resultado = nume1/nume2;}
                break;
            case(R.id.mult):
                resultado= nume1 * nume2;
                break;
            case(R.id.subt):
                resultado=nume1-nume2;
                break;
            default:
                resultado=0;
        }
        Toast.makeText(this,"Resultado"+resultado,Toast.LENGTH_LONG).show();
    }
}
