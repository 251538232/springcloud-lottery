package com.mz.info.repository;

import com.mz.info.entity.BallHistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryRepository extends JpaRepository<BallHistory, String> {
}
