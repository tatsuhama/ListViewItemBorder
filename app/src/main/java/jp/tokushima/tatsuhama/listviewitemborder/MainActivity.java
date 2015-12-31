package jp.tokushima.tatsuhama.listviewitemborder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list = (ListView) findViewById(R.id.list_view);
        list.setAdapter(createAdapter());
        list.setDivider(null);
    }

    private MyAdapter createAdapter() {
        MyAdapter adapter = new MyAdapter(this);
        for (int i = 0; i < 30; i++) {
            adapter.add(i % 6 < 3);
        }
        return adapter;
    }
}
