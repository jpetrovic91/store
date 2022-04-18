package com.josip.store.controllers;

import com.josip.store.entities.StoreItem;
import com.josip.store.services.StoreItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/api/v1")
public class StoreItemController {

    @Autowired
    StoreItemService storeItemService;

    @PostMapping("/addItem")
    public ResponseEntity<String> addItem(@RequestBody StoreItem storeItem) {
        return storeItemService.addItem(storeItem);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getItemById(@PathVariable(value = "id") int id) throws Exception{
        try {
            return storeItemService.getItemById(id);
        } catch (Exception e) {
            return ResponseEntity.status(404).body("No user with id " + id + ".");
        }
    }

    @GetMapping("/items")
    public ResponseEntity<List<StoreItem>> getItems() {
        return storeItemService.getItems();
    }
}
