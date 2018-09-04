package com.example.cnec.menu1;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout lay = findViewById(R.id.tela_principal);

        registerForContextMenu(lay);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.iSalvar:
                Toast.makeText(getApplicationContext(), "Salvar",
                        Toast.LENGTH_LONG).show();
                break;
            case R.id.iExcluir:
                Toast.makeText(getApplicationContext(), "Excluir",
                        Toast.LENGTH_LONG).show();
                break;
        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater m = getMenuInflater();
        m.inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.iSalvar:
                Toast.makeText(getApplicationContext(), "Salvar",
                        Toast.LENGTH_LONG).show();
                break;
            case R.id.iExcluir:
                Toast.makeText(getApplicationContext(), "Excluir",
                        Toast.LENGTH_LONG).show();
                break;
        }

        return true;
    }


}
