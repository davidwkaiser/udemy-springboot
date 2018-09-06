package com.example.db.Controllers;


import com.example.db.Service.SongService;
import com.example.db.domain.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SongController {

    @Autowired
    SongService songService;

    @RequestMapping("/songs")
    public Iterable<Song> returnSongs(){

        Iterable<Song> songs = songService.findAll();
        System.out.print("CONTROLLER!!!!!!");
        for (Song song : songs) {
            System.out.print(song);
        }
        return songs;
    }
}
