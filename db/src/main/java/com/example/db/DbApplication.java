package com.example.db;

import com.example.db.Repositories.ArtistRepository;
import com.example.db.Repositories.SongRepository;
import com.example.db.domain.Artist;
import com.example.db.domain.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;

import static java.util.Arrays.asList;

@SpringBootApplication
public class DbApplication {

    @Autowired
    private ArtistRepository artistRepository;

    @Autowired
    private SongRepository songRepository;


	public static void main(String[] args) {
		SpringApplication.run(DbApplication.class, args);
	}

	@PostConstruct
	private void loadData(){
		Artist a1 = new Artist("John", 42);
        artistRepository.save(a1);

        Song s1 = new Song("Stairway", a1);
        Song s2 = new Song("blerrg", a1);
        List<Song> songList = asList(s1, s2);
        songRepository.saveAll(songList);


	}





}
