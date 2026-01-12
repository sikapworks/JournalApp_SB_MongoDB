package com.example.journalApp.controller;
import java.util.*;

import com.example.journalApp.entity.JournalEntry;
import com.example.journalApp.service.JournalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping
    public List<JournalEntry> getAll() {
        return null;
    }

    @PostMapping
    public boolean create(@RequestBody JournalEntry entry) {
        journalEntryService.saveEntry(entry);
        return true;
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

