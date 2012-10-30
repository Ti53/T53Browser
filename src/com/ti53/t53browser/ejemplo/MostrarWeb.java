package com.ti53.t53browser.ejemplo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class MostrarWeb extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_web);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_mostrar_web, menu);
        return true;
    }
    
    
}
