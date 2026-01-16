package com.example.journalApp.entity;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Document(collection = "journal_entries")  //maps as a row
@Data  //generates all the ones given below
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
//@EqualsAndHashCode
//@Builder
public class JournalEntry {
    @Id //maps as primary key
    private ObjectId id;
    private String title;
    private String content;
    private LocalDateTime date;
}


