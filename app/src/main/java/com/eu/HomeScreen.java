package com.eu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.eu.entitiy.HomeItem;
import com.eu.entitiy.Post;
import com.google.gson.Gson;

import java.util.List;

public class HomeScreen extends AppCompatActivity {


    private RecyclerView mRvMainMenu;
    private LinearLayoutManager mLayoutManager;
    private HomeAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        // Find the toolbar view inside the activity layout
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(toolbar);


        initViews();
        setUpData();
    }

    private void setUpData() {
        mAdapter = new HomeAdapter();
        mRvMainMenu.setAdapter(mAdapter);

        Post post = new Post();
        post.setData();

        Gson gson = new Gson();

        Log.i("Json is", gson.toJson(post));
    }

    private void initViews() {
        mRvMainMenu = (RecyclerView) findViewById(R.id.rv_home_menu);
        mLayoutManager = new LinearLayoutManager(this);
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRvMainMenu.setLayoutManager(mLayoutManager);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    private class HomeViewHolder extends RecyclerView.ViewHolder {

        private TextView tvItem;
        private LinearLayout container;

        public HomeViewHolder(View itemView) {
            super(itemView);
            tvItem = (TextView) itemView.findViewById(R.id.tv_item);
            container = (LinearLayout) itemView.findViewById(R.id.container);
        }
    }

    private class HomeAdapter extends RecyclerView.Adapter<HomeViewHolder> {

        private List<HomeItem> mListItems;
        private String[] arrItems = {"Questions", "Quiz", "Algorithms", "Puzzles", "Score"};
        private String[] arrColors = {"#E9811A", "#EC8184", "#8CC264", "#E7BE3A",
                "#5CA1F1"};
        private int lastPosition = -1;

        public HomeAdapter() {

        }

        @Override
        public HomeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_home, parent, false);
            HomeViewHolder masonryView = new HomeViewHolder(layoutView);
            return masonryView;
        }

        @Override
        public void onBindViewHolder(HomeViewHolder holder, int position) {

            holder.tvItem.setText(arrItems[position]);
            holder.container.setBackgroundColor(Color.parseColor(arrColors[position]));

            setAnimation(holder.container, position);

        }

        private void setAnimation(View viewToAnimate, int position) {
            // If the bound view wasn't previously displayed on screen, it's animated
            if (position > lastPosition) {
                Animation animation = AnimationUtils.loadAnimation(HomeScreen.this, android.R.anim.slide_in_left);
                viewToAnimate.startAnimation(animation);
                lastPosition = position;
            }
        }

        @Override
        public int getItemCount() {
            return arrItems.length;
        }
    }
}
