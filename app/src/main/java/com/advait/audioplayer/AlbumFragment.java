package com.advait.audioplayer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import static com.advait.audioplayer.MainActivity.albums;
import static com.advait.audioplayer.MainActivity.musicFiles;

public class AlbumFragment extends Fragment {
    RecyclerView recyclerView;
    AlbumAdapter albumAdapter;
    public AlbumFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_album,container,false);
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        if(!(albums.size()<1)){
            albumAdapter = new AlbumAdapter(getContext(),albums);
            recyclerView.setAdapter(albumAdapter);
            recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));
        }
        return view;
    }
}
