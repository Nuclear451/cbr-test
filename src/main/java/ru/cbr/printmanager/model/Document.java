package ru.cbr.printmanager.model;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "document")
public class Document {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Lob
    @Column(name = "image")
    @Type(type = "org.hibernate.type.BinaryType")
    private byte[] content;

    private DocumentType docType;

    @Column(name = "accepted_at")
    private Date acceptedAt;

    @Column(name = "started_printed_at")
    private Date startedPrintedAt;

    @Column(name = "finished_at")
    private Date finishedAt;
}
