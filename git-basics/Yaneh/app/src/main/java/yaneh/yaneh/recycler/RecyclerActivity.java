package yaneh.yaneh.recycler;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import yaneh.yaneh.R;
import yaneh.yaneh.utils.BaseActivity;

public class RecyclerActivity extends BaseActivity {
    Context mcontext=this;
    RecyclerView rec;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        rec = findViewById(R.id.rec);

        citysModel golpa = new citysModel();
        golpa.setName("ggg");

        citysModel golpa2 = new citysModel();
        golpa2.setName("ggghhkjb");

        citysModel golpa3 = new citysModel();
        golpa3.setName("سلام");

        List<citysModel> caar = new ArrayList<>();
        caar.add(golpa);
        caar.add(golpa2);
        caar.add(golpa3);


        recadapter adapter = new recadapter(mcontext , caar );
        rec.setAdapter(adapter);
        //        recycler.setLayoutManager(new GridLayoutManager(mContext, 2));
        //rec.setLayoutManager(new LinearLayoutManager(mcontext));
    }
}
