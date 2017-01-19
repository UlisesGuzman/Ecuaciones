package mx.edu.utng.ecuaciones;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn_operation1;
    private Button btn_operation2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_operation1 = (Button) findViewById(R.id.btn_operation1);
        btn_operation2 = (Button) findViewById(R.id.btn_operation2);
        btn_operation2.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(MainActivity.this, operacion2.class));
            }
        });
        btn_operation1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(MainActivity.this, operacion1.class));
            }
        });
    }


}

