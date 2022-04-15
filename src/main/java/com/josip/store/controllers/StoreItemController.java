package com.josip.store.controllers;

import com.josip.store.entities.StoreItem;
import com.josip.store.repositories.StoreItemRepository;
import com.josip.store.services.StoreItemService;
import org.apache.catalina.Store;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(path = "/api/v1")
public class StoreItemController {

    StoreItemService storeItemService;

    @PostMapping("/addItem")
    public ResponseEntity<String> addItem(@RequestBody StoreItem storeItem) {
        return storeItemService.addItem(storeItem);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StoreItem> getItemById(@PathVariable(value = "id") int id) throws Exception{
        return storeItemService.getItemById(id);
    }
}
