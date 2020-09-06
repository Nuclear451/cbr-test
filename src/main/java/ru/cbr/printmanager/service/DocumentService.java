package ru.cbr.printmanager.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.cbr.printmanager.model.Document;
import ru.cbr.printmanager.repository.DocumentRepository;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@Slf4j
@Service
public class DocumentService {

    private DocumentRepository docRepository;

    private BlockingQueue<Document> queue = new LinkedBlockingQueue<>();

    public void acceptToPrint(Document doc) {
        docRepository.save(doc);
        queue.add(doc);
        // log.info("документ {} принят в печать");
    }

    public void getPrintedListByPrintOrder() {
    }

    public void getPrintedListByDocumentType() {
    }

    public void getPrintedListByPrintDuration() {
    }

    public void getPrintedListByDocumentFormat() {
    }

    public double getAveragePrintDuration() { return Double.NaN;}


    public void stopAll() {
    }

    public void cancel(Document doc) {
    }
}
