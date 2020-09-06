package ru.cbr.printmanager.model;

import lombok.Data;

import java.util.Date;

@Data
public class Document {

    private String name;

    private byte[] content;

    private DocumentType docType;

    private Date submittedAt;

    private Date startedProcessingAt;

    private Date finishedAt;

}
