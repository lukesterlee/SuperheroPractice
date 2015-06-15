package lukesterlee.c4q.nyc.superheropractice;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;


public class MainActivity extends ActionBarActivity {


    // https://ajax.googleapis.com/ajax/services/search/images?v=1.0&q=batman
    private static final String ENDPOINT = "https://ajax.googleapis.com/ajax/services/search/images?v=1.0&q=";

    SuperpersonAdapter adapter;

    List<Superperson> superpersonList;

    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeViews();
        initializeDatas();

        new AsyncLoader().execute();

    }

    private void initializeDatas() {
        superpersonList = new ArrayList<>();
        List<String> batmanPower = new ArrayList<>();
        batmanPower.add("awesome car");
        batmanPower.add("wings");
        Superhero batman = new Superhero("Batman", batmanPower, "Bruce Wayne", "Joker");

        List<String> supermanPower = new ArrayList<>();
        supermanPower.add("Super strength");
        supermanPower.add("Super brain");
        Superhero superman = new Superhero("Superman", supermanPower, "Clark", "idk");

        List<String> thorPower = new ArrayList<>();
        thorPower.add("Hammer");
        thorPower.add("Hotness");
        Superhero thor = new Superhero("Thor", thorPower, "hottie", "Loki");

        superpersonList.add(batman);
        superpersonList.add(superman);
        superpersonList.add(thor);

    }

    private void initializeViews() {
        mListView = (ListView) findViewById(R.id.listView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private class AsyncLoader extends AsyncTask<Void, Void, List<Superperson>> {


        @Override
        protected List<Superperson> doInBackground(Void... params) {

            // TODO : 1. implement this method, get each character's image picture Url from json file then return the list.
            List<Superperson> list = superpersonList;








            return list;
        }

        @Override
        protected void onPostExecute(List<Superperson> superpersons) {

            // TODO : 3. implement this method.

        }
    }
}
