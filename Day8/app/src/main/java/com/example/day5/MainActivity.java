package com.example.day5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Movie> movieArrayList = new ArrayList<>();
        final RelativeLayout relativeLayout = findViewById(R.id.rl);
        Toolbar toolbar = findViewById(R.id.toolbar);

        PrimaryDrawerItem item1 = new PrimaryDrawerItem().withIdentifier(1).withName("Home").withIcon(R.drawable.ic_baseline_home_24);
        PrimaryDrawerItem item2 = new PrimaryDrawerItem().withIdentifier(2).withName("Setting").withIcon(R.drawable.ic_baseline_settings_24);
        SecondaryDrawerItem item3 = new SecondaryDrawerItem().withIdentifier(3).withName("Profile");

//create the drawer and remember the `Drawer` result object
        Drawer result = new DrawerBuilder()
                .withActivity(this)
                .withToolbar(toolbar).addDrawerItems(
                        item1,
                        new DividerDrawerItem(),
                        item2,
                        new DividerDrawerItem(),
                        item3,
                        new SecondaryDrawerItem().withName("RoRo")
                )
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        // do something with the clicked item :D
                        return true;
                    }
                })
                .build();

        Movie a = new Movie("toy story", 4.0, genre.action, R.drawable.toystory);
        Movie b = new Movie("toy story2", 3, genre.comedy,R.drawable.toystory2);
        Movie c = new Movie("toy story3", 2.5, genre.horror,R.drawable.toystory3);

        movieArrayList.add(a);
        movieArrayList.add(b);
        movieArrayList.add(c);

        RecyclerView movieList = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        movieList.setHasFixedSize(true);
        movieList.setLayoutManager(lm);

        MovieAdopter ma = new MovieAdopter(movieArrayList,MainActivity.this,relativeLayout);
        movieList.setAdapter(ma);




    }
}