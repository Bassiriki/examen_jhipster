package com.groupeisi.HistoryDay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/historique")
public class HistoryResource {

    @Autowired
    private HistoryService historyService;

    @GetMapping("/all")
    public ResponseEntity<List<History>> getAllHistory() {
        List<History> histories = historyService.getAllHistory();
        return ResponseEntity.ok(histories);
    }
}
