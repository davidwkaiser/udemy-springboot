package com.example.db.Controllers;


import com.example.db.Service.SongService;
import com.example.db.domain.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class SongController {

    @Autowired
    SongService songService;

//    @RequestMapping("/songs")
//    public Iterable<Song> returnSongs(){
//
//        Iterable<Song> songs = songService.findAll();
//        System.out.print("CONTROLLER!!!!!!");
//        for (Song song : songs) {
//            System.out.print(song);
//        }
//        return songs;
//    }

    @RequestMapping("/songs")
    public String returnSongs(Model model){
        Iterable<Song> songs = songService.findAll();
        model.addAttribute("allSongs", songs );
        return "songs";
    }





}
