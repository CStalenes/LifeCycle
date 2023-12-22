package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "LifeCycles";
    //logt pour le tag

    /** 1 var glo pour utiliser button dans methode**/
    Button button;

    /** 2 Methode initialisation des composant graph**/

    /** faire lien entre java et oneUI**/

    public void initUI(){
        button = findViewById(R.id.button);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /** 3 appel de la methode initUI() **/
        initUI();

        /** Gestion du clic sur le bouton**/

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "A la notre", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                // Intent est utilise pour faire le lien entre depart = mainactiv.this arrive = mainactiv2

                String resultatFormulaire = "Stan";

                intent.putExtra("key", resultatFormulaire);
                //on va mettre dans notre activ2 qui est relier par intent un int.putextra via couple (key, val) le resForm Stan

                startActivity(intent);

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        //logi pour implementer afficher Log.i(TAG, "onStart: ");
        Log.i(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: ");
    }
}