package com.example.projet;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String oldNum="";
    String op="+";
    boolean newOP=true;
    TextView ed1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.resultat);
    }
    public void ajouterChiffre(View view){
        if(newOP)
            ed1.setText("");
        newOP=false;
        String number = ed1.getText().toString();
        switch (view.getId()){
            case R.id.button1:
                number +=1;
                break;
            case R.id.button2:
                number +=2;
                break;
            case R.id.button3:
                number +=3;
                break;
            case R.id.button4:
                number +=4;
                break;
            case R.id.button5:
                number +=5;
                break;
            case R.id.button6:
                number +=6;
                break;
            case R.id.button7:
                number +=7;
                break;
            case R.id.button8:
                number +=8;
                break;
            case R.id.button9:
                number +=9;
                break;
            case R.id.button0:
                number +=0;
                break;

        }
        ed1.setText(number);
    }
    public void ajouterOperateur(View view){
        newOP=true;
        oldNum=ed1.getText().toString();
        switch (view.getId()){
            case R.id.buttonplus: op="+";break;
            case R.id.buttonfois: op="*";break;
            case R.id.buttonsur: op="/";break;
            case R.id.buttonmoins: op="-";break;
        }
        ed1.setText(String.valueOf(oldNum)+op);
}
    public void calculer(View view){
       String newNum =ed1.getText().toString();
       float result=0;
       switch(op){
           case "+":
               result= Float.parseFloat(oldNum)+Float.parseFloat(newNum);
               break;
           case "-":
               result= Float.parseFloat(oldNum)-Float.parseFloat(newNum);
               break;
           case "*":
               result= Float.parseFloat(oldNum)*Float.parseFloat(newNum);
               break;
           case "/":
               result= Float.parseFloat(oldNum)/Float.parseFloat(newNum);
               break;
       }
       ed1.setText(oldNum+op+newNum+"="+result+"");
       newOP=true;
    }
    public void reset(View view) {
        ed1.setText("0");
        newOP=true;
    }
}