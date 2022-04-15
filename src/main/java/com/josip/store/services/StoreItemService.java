package com.josip.store.services;

import com.josip.store.entities.StoreItem;
import com.josip.store.repositories.StoreItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StoreItemService {

    StoreItemRepository storeItemRepository;

    public ResponseEntity<String> addItem(StoreItem storeItem) {
        storeItemRepository.save(storeItem);
        return ResponseEntity.ok("Store item added");
    }

    public ResponseEntity<StoreItem> getItemById(int id) throws Exception{

        StoreItem storeItem = storeItemRepository.findById(id).orElseThrow(() -> new Exception("No user with that id."));
        return ResponseEntity.ok(storeItem);
    }
}
