package com.example.db.Repositories;

import com.example.db.domain.Artist;
import org.springframework.data.repository.CrudRepository;

public interface ArtistRepository extends CrudRepository<Artist, Long>{
}
