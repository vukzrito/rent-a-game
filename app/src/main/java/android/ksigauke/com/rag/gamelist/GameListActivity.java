package android.ksigauke.com.rag.gamelist;

import android.ksigauke.com.rag.R;
import android.ksigauke.com.rag.utils.ActivityUtils;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class GameListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_list);

        GameListFragment gamelistFragment = (GameListFragment) getSupportFragmentManager().findFragmentById(R.id.contentFrame);
        if (gamelistFragment == null) {
            gamelistFragment = GameListFragment.newInstance();
        }
        final ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);

        }

        ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), gamelistFragment, R.id.contentFrame);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.game_list_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //TODO: Handle menu item clicks
        return super.onOptionsItemSelected(item);
    }
}

