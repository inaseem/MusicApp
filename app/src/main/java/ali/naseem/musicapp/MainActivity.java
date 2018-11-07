package ali.naseem.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.mancj.slideup.SlideUp;
import com.mancj.slideup.SlideUpBuilder;

import ali.naseem.musicapp.adapters.SectionsPagerAdapter;

public class MainActivity extends AppCompatActivity {

    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;
    private View bottomContainer, slideUp;
    private ImageView playPauseButton;
    private ImageView playPauseBottomButton;
    private boolean isPlaying = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomContainer = findViewById(R.id.bottomContainer);
        slideUp = findViewById(R.id.slideUp);
        playPauseButton = findViewById(R.id.playPauseButton);
        playPauseBottomButton = findViewById(R.id.playPauseBottomButton);
        if (isPlaying) {
            playPauseButton.setImageResource(R.drawable.ic_pause_circle_outline_black_24dp);
            playPauseBottomButton.setImageResource(R.drawable.ic_pause_circle_outline_black_24dp);
        } else {
            playPauseButton.setImageResource(R.drawable.ic_play_circle_outline_black_24dp);
            playPauseBottomButton.setImageResource(R.drawable.ic_play_circle_outline_black_24dp);
        }
        playPauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPlaying) {
                    playPauseButton.setImageResource(R.drawable.ic_play_circle_outline_black_24dp);
                    playPauseBottomButton.setImageResource(R.drawable.ic_play_circle_outline_black_24dp);
                    isPlaying = false;
                } else {
                    playPauseButton.setImageResource(R.drawable.ic_pause_circle_outline_black_24dp);
                    playPauseBottomButton.setImageResource(R.drawable.ic_pause_circle_outline_black_24dp);
                    isPlaying = true;
                }
            }
        });
        playPauseBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPlaying) {
                    playPauseButton.setImageResource(R.drawable.ic_play_circle_outline_black_24dp);
                    playPauseBottomButton.setImageResource(R.drawable.ic_play_circle_outline_black_24dp);
                    isPlaying = false;
                } else {
                    playPauseButton.setImageResource(R.drawable.ic_pause_circle_outline_black_24dp);
                    playPauseBottomButton.setImageResource(R.drawable.ic_pause_circle_outline_black_24dp);
                    isPlaying = true;
                }
            }
        });
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));
        new SlideUpBuilder(slideUp)
                .withStartState(SlideUp.State.HIDDEN)
                .withStartGravity(Gravity.BOTTOM)
                .withSlideFromOtherView(bottomContainer)
                .withGesturesEnabled(true)
                .withTouchableAreaPx(getResources().getDisplayMetrics().heightPixels)
                .build();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.menu_about:
                Intent intent = new Intent(this, About.class);
                startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

}
