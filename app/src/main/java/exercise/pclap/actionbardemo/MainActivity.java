package exercise.pclap.actionbardemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.tb_app);

        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_popup, menu);


        MenuItem menuItemSearchView = menu.findItem(R.id.id_menu_search);

        SearchView searchView = (SearchView) menuItemSearchView.getActionView();
        searchView.setOnQueryTextListener(this);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

//        getMenuInflater().inflate(R.menu.menu_popup, null);

        return super.onOptionsItemSelected(item);

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        return super.onContextItemSelected(item);
    }

    //khi nhan nut enter
    @Override
    public boolean onQueryTextSubmit(String query) {
        Toast.makeText(MainActivity.this, query, Toast.LENGTH_SHORT).show();
        return true;
    }

    //khi thay doi chuoi trong textSearch
    @Override
    public boolean onQueryTextChange(String newText) {

        Toast.makeText(MainActivity.this, newText, Toast.LENGTH_SHORT).show();
        return true;
    }
}
