package com.josip.store.repositories;

import com.josip.store.entities.StoreItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StoreItemRepository extends JpaRepository<StoreItem, Integer> {

}
