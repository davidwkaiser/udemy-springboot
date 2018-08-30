package com.example.db.Repositories;

import com.example.db.domain.Song;
import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository <Song, Long> {
}
