package com.cisnenegro.calculadorat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText TacoM, TacoH, Aguas, vMedio, coca;
    private Button btnIgul;
    private TextView Result;

    private Integer datoM=18, datoH=21, datoA=14, datoV=2, datoC=19;
    private EditText  ETacoM, ETacoH, EAguas, ECoca, EEmpaque;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TacoM = findViewById(R.id.maiz);
        TacoH = findViewById(R.id.harina);
        Aguas = findViewById(R.id.aguas);
        vMedio = findViewById(R.id.empaque);
        coca = findViewById(R.id.cocaml);
        btnIgul = findViewById(R.id.igual);
        Result = findViewById(R.id.resultado);

        ETacoM = findViewById(R.id.Emaiz);
        ETacoH = findViewById(R.id.Eharina);
        EAguas = findViewById(R.id.Eaguas);
        ECoca = findViewById(R.id.Ecocaml);
        EEmpaque = findViewById(R.id.Eempaque);


        btnIgul.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String M = TacoM.getText().toString();
        String H = TacoH.getText().toString();
        String A = Aguas.getText().toString();
        String V = vMedio.getText().toString();
        String C = coca.getText().toString();

        String EM = ETacoM.getText().toString();
        String EH = ETacoH.getText().toString();
        String EA = EAguas.getText().toString();
        String EC = ECoca.getText().toString();
        String EE = EEmpaque.getText().toString();


        if (EM.isEmpty()) {
            EM = "18";
        }
        if (EH.isEmpty()) {
            EH="21";
        }
        if (EA.isEmpty()) {
            EA = "14";
        }
        if (EC.isEmpty()) {
            EC = "19";
        }
        if (EE.isEmpty()) {
            EE = "2";
        }

        if (M.isEmpty()){
            M="0";
        }
        if (H.isEmpty()){
            H="0";
        }
        if(A.isEmpty()){
            A="0";
        }
        if (V.isEmpty()){
            V="0";
        }
        if (C.isEmpty()){
            C="0";
        }

        int dM = Integer.parseInt(M);
        int dH = Integer.parseInt(H);
        int dA = Integer.parseInt(A);
        int dV = Integer.parseInt(V);
        int dC = Integer.parseInt(C);

        int edM = Integer.parseInt(EM);
        int edH = Integer.parseInt(EH);
        int edA = Integer.parseInt(EA);
        int edC = Integer.parseInt(EC);
        int edE = Integer.parseInt(EE);

        int rta = 0;

        rta= dM*edM+dH*edH+dA*edA+dV*edE+dC*edC;

        Result.setText(""+rta);

    }

}