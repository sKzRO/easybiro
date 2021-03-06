package hackaton.smartbureaucracy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class pfizica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pfizica);

        TextView textView2 = (TextView)findViewById(R.id.email);
        textView2.setText(getSharedPreferences("Email_pfiz", MODE_PRIVATE).getString("key",""));

        TextView textView3 = (TextView)findViewById(R.id.telefon_pfizica);
        textView3.setText(getSharedPreferences("TlfX_pfiz", MODE_PRIVATE).getString("key",""));

        TextView textView4 = (TextView)findViewById(R.id.Data_nasterii);
        textView4.setText(getSharedPreferences("Data_pfiz", MODE_PRIVATE).getString("key",""));

        TextView textView5 = (TextView)findViewById(R.id.domiciliu);
        textView5.setText(getSharedPreferences("Domiciliu_pfiz", MODE_PRIVATE).getString("key",""));
    }

    public void schimba_datele(View view) {
        Intent myIntent = new Intent(pfizica.this,
                date_pfizica.class);
        startActivity(myIntent);
    }




    public void qr(View view) {

        Intent myIntent = new Intent(pfizica.this,
                QR.class);
        startActivity(myIntent);
    }

    public void scaneaza_buletin(View view) {
        Intent myIntent = new Intent(pfizica.this,
                OCR.class);
        startActivity(myIntent);
    }
}
