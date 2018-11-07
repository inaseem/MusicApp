package ali.naseem.musicapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import ali.naseem.musicapp.R;
import ali.naseem.musicapp.adapters.CategoryAdapter;
import ali.naseem.musicapp.models.Song;

public class SongsFragment extends Fragment {

    private CategoryAdapter adapter;
    private ArrayList<Song> songs;

    public SongsFragment() {
    }

    public static SongsFragment newInstance() {
        SongsFragment fragment = new SongsFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_songs, container, false);
        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(false);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), LinearLayoutManager.VERTICAL));
        songs = new ArrayList<>();
        adapter = new CategoryAdapter(songs, getContext());
        recyclerView.setAdapter(adapter);
        Song song1 = new Song();
        song1.setName("Tera Fitoor");
        song1.setArtist("Arijit Sing");
        song1.setLength("3:00");
        song1.setThumbnail(R.drawable.song1);
        Song song2 = new Song();
        song2.setName("Morni Banke");
        song2.setArtist("Guru Randhava");
        song2.setLength("3:30");
        song2.setThumbnail(R.drawable.song2);
        Song song3 = new Song();
        song3.setName("Akh Lad Jaave");
        song3.setArtist("Badshah");
        song3.setLength("2:30");
        song3.setThumbnail(R.drawable.song3);
        Song song4 = new Song();
        song4.setName("Kamaria");
        song4.setLength("3:30");
        song4.setArtist("Lijo George,Dj Chetas");
        song4.setThumbnail(R.drawable.song4);
        Song song5 = new Song();
        song5.setName("Urvashi");
        song5.setLength("5:00");
        song5.setArtist("Yo Yo Honey Singh");
        song5.setThumbnail(R.drawable.song5);
        Song song6 = new Song();
        song6.setName("Tera Fitoor");
        song6.setArtist("Arijit Sing");
        song6.setLength("3:00");
        song6.setThumbnail(R.drawable.song1);
        Song song7 = new Song();
        song7.setName("Morni Banke");
        song7.setArtist("Guru Randhava");
        song7.setLength("3:30");
        song7.setThumbnail(R.drawable.song2);
        Song song8 = new Song();
        song8.setName("Akh Lad Jaave");
        song8.setArtist("Badshah");
        song8.setLength("2:30");
        song8.setThumbnail(R.drawable.song3);
        Song song9 = new Song();
        song9.setName("Kamaria");
        song9.setLength("3:30");
        song9.setArtist("Lijo George,Dj Chetas");
        song9.setThumbnail(R.drawable.song4);
        Song song10 = new Song();
        song10.setName("Urvashi");
        song10.setLength("5:00");
        song10.setArtist("Yo Yo Honey Singh");
        song10.setThumbnail(R.drawable.song5);
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
        songs.add(song6);
        songs.add(song7);
        songs.add(song8);
        songs.add(song9);
        songs.add(song10);
        adapter.notifyDataSetChanged();
        return rootView;
    }

}
