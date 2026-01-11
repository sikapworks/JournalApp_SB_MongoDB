package com.example.journalApp.service;

import com.example.journalApp.entity.JournalEntry;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//controller --> service --> repository


@Service
public class JournalEntryService {

    //since no DB
    private Map<Long, JournalEntry> journalEntries = new HashMap<>();
    private long idCounter = 1;

    public List<JournalEntry> getAll() {
        return new ArrayList<>(journalEntries.values());
    }

    public JournalEntry create(JournalEntry entry) {
        entry.setId(idCounter++);
        journalEntries.put(entry.getId(), entry);
        return entry;
    }

    public JournalEntry getById(Long id) {
        return journalEntries.get(id);
    }

    public JournalEntry update(Long id, JournalEntry entry) {
        entry.setId(id);
        journalEntries.put(id, entry);
        return entry;
    }

    public JournalEntry delete(Long id) {
        return journalEntries.remove(id);
    }
}

