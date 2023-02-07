package com.example.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Character> list=new ArrayList<>();
        list.add('+');
        list.add('-');
        list.add('*');
        list.add('/');
        list.add('%');
        System.out.println(list);

        Button zero=findViewById(R.id.zero);
        Button one=findViewById(R.id.one);
        Button two=findViewById(R.id.two);
        Button three=findViewById(R.id.three);
        Button four=findViewById(R.id.four);
        Button five=findViewById(R.id.five);
        Button six=findViewById(R.id.six);
        Button seven=findViewById(R.id.seven);
        Button eight=findViewById(R.id.eight);
        Button nine=findViewById(R.id.nine);
        Button add=findViewById(R.id.add);
        Button subtract=findViewById(R.id.subtract);
        Button multiply=findViewById(R.id.multiply);
        Button division=findViewById(R.id.divide);
        Button mod=findViewById(R.id.mod);
        Button equals=findViewById(R.id.result);
        Button remove=findViewById(R.id.remove);
        Button clear=findViewById(R.id.C);
        TextView resultText=findViewById(R.id.resultText);
        String result="";
//        zero
        zero.setOnClickListener(v->{
            String temp=resultText.getText().toString();
                if( !(String.valueOf(temp.charAt(temp.length()-1)).equals("0")))
                    resultText.setText(resultText.getText().toString().concat("0"));

        });

        // one
        one.setOnClickListener(v->
        {
            String temp=resultText.getText().toString();
            if(resultText.getText().toString().equals("0")){
                resultText.setText("1");
            }else if(temp.length()>1&&!list.contains(temp.charAt(temp.length()-2))&&temp.charAt(temp.length()-1)!=0) {
                resultText.setText(resultText.getText().toString()+"1");
            }else if((temp.length()==1&&!temp.equals("0")))
                resultText.setText(resultText.getText().toString()+"1");
        });
        //two
        two.setOnClickListener(v->
        {
            String temp=resultText.getText().toString();
            if(resultText.getText().toString().equals("0")){
                resultText.setText("2");
            }else if(temp.length()>1&&!list.contains(temp.charAt(temp.length()-2))&&temp.charAt(temp.length()-1)!=0){
                resultText.setText(resultText.getText().toString()+"2");
            }else if((temp.length()==1&&!temp.equals("0")))
                resultText.setText(resultText.getText().toString()+"2");
        });

        //three

        three.setOnClickListener(v->
        {
            String temp=resultText.getText().toString();
            if(resultText.getText().toString().equals("0")){
                resultText.setText("3");
            }else if(temp.length()>1&&!list.contains(temp.charAt(temp.length()-2))&&temp.charAt(temp.length()-1)!=0){
                resultText.setText(resultText.getText().toString()+"3");
            }else if((temp.length()==1&&!temp.equals("0")))
                resultText.setText(resultText.getText().toString()+"3");
        });

        //four
        four.setOnClickListener(v->
        {
            String temp=resultText.getText().toString();
            if(resultText.getText().toString().equals("0")){
                resultText.setText("4");
            }else if(temp.length()>1&&!list.contains(temp.charAt(temp.length()-2))&&temp.charAt(temp.length()-1)!=0){
                resultText.setText(resultText.getText().toString()+"4");
            }else if((temp.length()==1&&!temp.equals("0")))
                resultText.setText(resultText.getText().toString()+"4");
        });

        //five
        five.setOnClickListener(v->
        {
            String temp=resultText.getText().toString();
            if(resultText.getText().toString().equals("0")){
                resultText.setText("5");
            }else if(temp.length()>1&&!list.contains(temp.charAt(temp.length()-2))&&temp.charAt(temp.length()-1)!=0){
                resultText.setText(resultText.getText().toString()+"5");
            }else if((temp.length()==1&&!temp.equals("0")))
                resultText.setText(resultText.getText().toString()+"5");
        });

        //six
        six.setOnClickListener(v->
        {
            String temp=resultText.getText().toString();
            if(resultText.getText().toString().equals("0")){
                resultText.setText("6");
            }else if(temp.length()>1&&!list.contains(temp.charAt(temp.length()-2))&&temp.charAt(temp.length()-1)!=0){
                resultText.setText(resultText.getText().toString()+"6");
            }else if((temp.length()==1&&!temp.equals("0")))
                resultText.setText(resultText.getText().toString()+"6");
        });

        //seven
        seven.setOnClickListener(v->
        {
            String temp=resultText.getText().toString();
            if(resultText.getText().toString().equals("0")){
                resultText.setText("7");
            }else if(temp.length()>1&&!list.contains(temp.charAt(temp.length()-2))&&temp.charAt(temp.length()-1)!=0){
                resultText.setText(resultText.getText().toString()+"7");
            }else if((temp.length()==1&&!temp.equals("0")))
                resultText.setText(resultText.getText().toString()+"7");
        });

        //eight
        eight.setOnClickListener(v->
        {
            String temp=resultText.getText().toString();
            if(resultText.getText().toString().equals("0")){
                resultText.setText("8");
            }else if(temp.length()>1&&!list.contains(temp.charAt(temp.length()-2))&&temp.charAt(temp.length()-1)!=0){
                resultText.setText(resultText.getText().toString()+"8");
            }else if((temp.length()==1&&!temp.equals("0")))
                resultText.setText(resultText.getText().toString()+"8");
        });

        //nine
        nine.setOnClickListener(v->
        {
            String temp=resultText.getText().toString();
            if(resultText.getText().toString().equals("0")){
                resultText.setText("9");
            }else if(temp.length()>1&&!list.contains(temp.charAt(temp.length()-2))&&temp.charAt(temp.length()-1)!=0){
                resultText.setText(resultText.getText().toString()+"9");
            }else if((temp.length()==1&&!temp.equals("0")))
                resultText.setText(resultText.getText().toString()+"9");
        });

        //add
        add.setOnClickListener(view->{
           String temp=resultText.getText().toString();
            if(!temp.equals("0")&&!list.contains(temp.charAt(temp.length()-1)))
                temp+='+';
            resultText.setText(temp);
        });

        //subtract
        subtract.setOnClickListener(view->{
            String temp=resultText.getText().toString();
            if(!temp.equals("0")&&!list.contains(temp.charAt(temp.length()-1))) {
                temp += '-';
                resultText.setText(temp);
            }

        });

        //multiply
        multiply.setOnClickListener(view->{
            String temp=resultText.getText().toString();
            if(!temp.equals("0")&&!list.contains(temp.charAt(temp.length()-1)))
                temp+='*';
            resultText.setText(temp);
        });

        //divide
        division.setOnClickListener(view->{
            String temp=resultText.getText().toString();
            if(!temp.equals("0")&&!list.contains(temp.charAt(temp.length()-1)))
                temp+='/';
            resultText.setText(temp);
        });

        //mod
        mod.setOnClickListener(view->{
            String temp=resultText.getText().toString();
            if(!temp.equals("0")&&!list.contains(temp.charAt(temp.length()-1)))
                temp+='%';
            resultText.setText(temp);
        });

        //remove
       remove.setOnClickListener(view->{
           String temp=resultText.getText().toString();
           if(temp.length()==1) {
               resultText.setText("0");
           }
          else {
               temp = temp.substring(0, temp.length() - 1);
               resultText.setText(temp);
           }

       });

       //Clear
        clear.setOnClickListener(view->{
            resultText.setText("0");
        });

        //equals
        equals.setOnClickListener(view-> {
            String s=resultText.getText().toString();
            int index=0;
            String res="";
            String num1="";
            String num2="";
            char c='#';
            while (index<s.length()) {

                if(c=='#'&&Character.isDigit(s.charAt(index))&&num1==""){
                    while (index<s.length()&& Character.isDigit(s.charAt(index))) {
                        num1+=s.charAt(index++);

                    }
                }else if(num2==""){
                    while (index<s.length()&& Character.isDigit(s.charAt(index))) {
                        num2+=s.charAt(index++);
                    }
                }
                if(index<s.length()&&c=='#')
                    c=s.charAt(index++);
                if(num1!=""&&num2!=""){
                    switch (c) {
                        case '+':

                            res=String.valueOf(Long.parseLong(num1)+Long.parseLong(num2));
                            num1=res;
                            num2="";
                            c='#';
                            break;
                        case '-':
                            res=String.valueOf(Long.parseLong(num1)-Long.parseLong(num2));
                            num1=res;
                            num2="";
                            c='#';
                            break;
                        case '*':
                            res=String.valueOf(Long.parseLong(num1)*Long.parseLong(num2));
                            num1=res;
                            num2="";
                            c='#';
                            break;
                        case '/':
                            res=String.valueOf(Long.parseLong(num1)/Long.parseLong(num2));
                            num1=res;
                            num2="";
                            c='#';
                            break;
                        case '%':
                            res=String.valueOf(Long.parseLong(num1)%Long.parseLong(num2));
                            num1=res;
                            num2="";
                            c='#';
                            break;
                        default:
                            break;
                    }
                }
            }
            resultText.setText(res);
            System.out.println(res);

    });


}
}





