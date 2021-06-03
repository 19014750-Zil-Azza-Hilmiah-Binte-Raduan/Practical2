//Zil Azza 19014750

package sg.edu.rp.c346.id19014750.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnLoc1, btnLoc2, btnLoc3, btnLoc4, btnLoc5, btnLoc6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLoc1 = findViewById(R.id.btnLocation1);
        btnLoc2 = findViewById(R.id.btnLocation2);
        btnLoc3 = findViewById(R.id.btnLocation3);
        btnLoc4 = findViewById(R.id.btnLocation4);
        btnLoc5 = findViewById(R.id.btnLocation5);
        btnLoc6 = findViewById(R.id.btnLocation6);

        btnLoc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("select", "Loc1");
                startActivity(intent);
            }
        });

        btnLoc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("select", "Loc2");
                startActivity(intent);
            }
        });

        btnLoc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("select", "Loc3");
                startActivity(intent);
            }
        });

        btnLoc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("select", "Loc4");
                startActivity(intent);
            }
        });

        btnLoc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("select", "Loc5");
                startActivity(intent);
            }
        });

        btnLoc6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("select", "Loc6");
                startActivity(intent);
            }
        });

    }
}