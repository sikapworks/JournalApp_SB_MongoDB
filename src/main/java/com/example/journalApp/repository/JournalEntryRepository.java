package com.example.journalApp.repository;


import com.example.journalApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

//MongoRepository<"to be performed on", "datatype of id">

public interface JournalEntryRepository extends MongoRepository<JournalEntry, ObjectId> {


}
