package com.example.javaademos2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            System.out.println("A");
            int num = 99 / 0;
            System.out.println("B");
        } catch (ArithmeticException e) {
            System.out.println("C");
        } catch (Exception e) {
            System.out.println("D");
        } finally {
            System.out.println("E");
        }
    }// output will be=ACE
}
