package com.example.db.Service;

import com.example.db.Repositories.SongRepository;
import com.example.db.domain.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SongService {


    SongRepository songRepository;

    @Autowired
    public SongService( SongRepository songRepository){
        this.songRepository = songRepository;
    }


    public Iterable<Song> findAll(){

        Iterable<Song> songs = songRepository.findAll();
        System.out.print("SERVICE!!!!!!");
        for (Song song : songs) {
            System.out.print(song);
        }


        return songs;
    };


}
