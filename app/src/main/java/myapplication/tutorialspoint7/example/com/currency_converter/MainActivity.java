package myapplication.tutorialspoint7.example.com.currency_converter;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText e1;
    RadioButton r1,r2;
    TextView t1;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.e1);
        r1 = (RadioButton) findViewById(R.id.r1);
        r2 = (RadioButton) findViewById(R.id.r2);
        t1 = (TextView) findViewById(R.id.t1);
        b1 = (Button) findViewById(R.id.b1);

    b1.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        String s = e1.getText().toString();
        Double b = Double.parseDouble(s);
        if(r1.isChecked()){
            b= b/80.13;
            t1.setText(String.valueOf(b));
        }
        else if(r2.isChecked()){
            b= b/60.13;
            t1.setText(String.valueOf(b));
        }

    }
}
