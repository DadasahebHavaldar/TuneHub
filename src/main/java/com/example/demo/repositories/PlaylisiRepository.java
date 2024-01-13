package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Playlist;

public interface PlaylisiRepository extends JpaRepository<Playlist, Integer>
{

}
