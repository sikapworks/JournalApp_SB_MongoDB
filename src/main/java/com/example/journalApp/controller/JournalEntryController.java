package com.example.journalApp.controller;
import java.util.*;

import com.example.journalApp.entity.JournalEntry;
import com.example.journalApp.service.JournalEntryService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/_journal")
public class JournalEntryController {

    private final JournalEntryService service;

    public JournalEntryController(JournalEntryService service) {
        this.service = service;
    }

    @GetMapping
    public List<JournalEntry> getAll() {
        return service.getAll();
    }

    @PostMapping
    public JournalEntry create(@RequestBody JournalEntry entry) {
        return service.create(entry);
    }

    @GetMapping("/id/{id}")
    public JournalEntry getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping("/id/{id}")
    public JournalEntry update(@PathVariable Long id, @RequestBody JournalEntry entry) {
        return service.update(id, entry);
    }

    @DeleteMapping("/id/{id}")
    public JournalEntry delete(@PathVariable Long id) {
        return service.delete(id);
    }
}

