package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.ReceiverInfo;

public interface ReceiverInfoRepository extends JpaRepository<ReceiverInfo, Integer> {

}
