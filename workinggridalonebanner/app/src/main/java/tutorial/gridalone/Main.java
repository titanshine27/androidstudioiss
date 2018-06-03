package tutorial.gridalone;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main extends AppCompatActivity implements View.OnClickListener{
    ViewPager viewPager;
    CustomSwipeAdapter adapter;
    TextView aboutus,admission,photos,notification,results,careers,contactus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.view_pager);
        adapter = new CustomSwipeAdapter(this);
        aboutus = findViewById(R.id.aboutus);
        admission=findViewById(R.id.admission);
        photos=findViewById(R.id.photos);
        notification=findViewById(R.id.notification);
        results=findViewById(R.id.results);
        careers=findViewById(R.id.careers);
        contactus=findViewById(R.id.contactus);

        viewPager.setAdapter(adapter);

        admission.setOnClickListener(this);
        photos.setOnClickListener(this);
        notification.setOnClickListener(this);
        aboutus.setOnClickListener(this);
        results.setOnClickListener(this);
        careers.setOnClickListener(this);
        contactus.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.aboutus : startActivity(new Intent(this,About.class));


            break;
        }

    }
}
