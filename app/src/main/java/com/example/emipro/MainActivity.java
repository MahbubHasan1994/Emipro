package com.example.emipro;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    CardView bank_cal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bank_cal = findViewById(R.id.bank_cal_dialog);
        bank_cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openDialog();
            }
        });
    }

    public void openDialog(){
        final AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
        View mView = getLayoutInflater().inflate(R.layout.bank_cal_dialog,null);

        CardView fixed_depo = mView.findViewById(R.id.fixed_deposit_id);
        CardView provi_fund = mView.findViewById(R.id.provident_fund_id);

        alert.setView(mView);

        final AlertDialog alertDialog = alert.create();
        alertDialog.setCanceledOnTouchOutside(true);

        fixed_depo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Emi_Fixed_Deposit.class);
                startActivity(intent);
                alertDialog.dismiss();
            }
        });

        provi_fund.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Emi_Provident_Fund.class);
                startActivity(intent);
                alertDialog.dismiss();
            }
        });

        alertDialog.show();
    }
}
