package app.fizzbuzz.jade_mainframe.com.fizzbuzz;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textViewPrintList;
    private EditText editTextNumber;
    private Button buttonSubmit;
    private int number;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        textViewPrintList = (TextView) findViewById(R.id.textViewPrintList);
        editTextNumber = (EditText) findViewById(R.id.editTextNumber);
        buttonSubmit = (Button) findViewById(R.id.buttonSubmit);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String holdNumber= editTextNumber.getText().toString();

               if (holdNumber.matches("")){
                   Toast.makeText(getApplication(), "You did not enter a username", Toast.LENGTH_SHORT).show();
                   return;
               }
                textViewPrintList.setText("");
                number = Integer.parseInt(holdNumber);
                for (int i=0; i< number; i++ ){
                    fizzBuzzCalculation(i+1);
                }
            }
        });
    }

    private void fizzBuzzCalculation(int iNumber) {

        if (iNumber % 15 == 0){

            textViewPrintList.append("Fizz Buzz"+"\n");
            return;
        }
        if(iNumber  % 5 ==0){

            textViewPrintList.append("Buzz"+"\n");
            return;
        }
        if(iNumber  % 3 ==0){

            textViewPrintList.append("Fizz"+"\n");
            return;
        }

        textViewPrintList.append(String.valueOf(iNumber+"\n"));

    }
}
