package sg.edu.rp.soi.p06_quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;
    TextView tvOp;
    TextView tvDis;
    Button btnReset;
    double total = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.etNum1);
        num2 = findViewById(R.id.etNum2);
        tvOp = findViewById(R.id.tvOperation);
        tvDis = findViewById(R.id.tvDis);
        btnReset = findViewById(R.id.btnReset);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, "+");
        menu.add(0, 1, 1, "-");
        return true;
    }
    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        int id = item.getItemId();
        double num1 = Double.parseDouble(num1.getText().toString());
        double num2 = Double.parseDouble(num2.getText().toString());


        if(id == 0){
            total = num1+num2;

        }else if(id == 1){
            total = num1 - num2;

        }
        tvDis.setText(Double.toString(total));

        return true;
    }

    btnReset.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            num1.setText(0);
            num2.setText(0);

        }
    });


}
