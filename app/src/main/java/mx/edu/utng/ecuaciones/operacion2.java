package mx.edu.utng.ecuaciones;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by ulises on 19/01/2017.
 */
public class operacion2 extends AppCompatActivity {

    private EditText edt_number_2;
    private Button btn_calculate;
    private TextView txvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.operacion2);
        edt_number_2 = (EditText) findViewById(R.id.edt_number_2);
        btn_calculate = (Button) findViewById(R.id.btn_calculate);
        txvResult = (TextView)  findViewById(R.id.txv_result);
        btn_calculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v) {

                float number2 = Float.parseFloat(edt_number_2.getText().toString());

                float result = 0;

                result = (number2*number2+2*(number2))*(number2*number2*number2-2*(number2*number2)+1) ;

                txvResult.setText(""+result);
            }
        });
    }
}