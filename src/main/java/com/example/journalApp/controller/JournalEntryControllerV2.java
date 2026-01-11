package com.example.journalApp.controller;

import com.example.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {

    @GetMapping
    public List<JournalEntry> getAll() {
        return null;
    }

    @PostMapping
    public JournalEntry create(@RequestBody JournalEntry entry) {
        return null;
    }

    @GetMapping("/id/{id}")
    public JournalEntry getById(@PathVariable Long id) {
        return null;
    }

    @PutMapping("/id/{id}")
    public JournalEntry update(@PathVariable Long id, @RequestBody JournalEntry entry) {
        return null;
    }

    @DeleteMapping("/id/{id}")
    public JournalEntry delete(@PathVariable Long id) {
        return null;
    }
}
