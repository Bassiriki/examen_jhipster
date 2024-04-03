package com.groupeisi.HistoryDay;

import com.groupeisi.calendarDay.DayFinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class HistoryService {

    @Autowired
    private HistoryRepository historyRepository;

    public History saveSearch(String request, DayFinder response) {
        History history = new History();
        history.setSearchDate(Instant.now());
        history.setRequest(request);
        history.setResponse(response);
        return historyRepository.save(history);
    }

    public List<History> getAllHistory() {
        return historyRepository.findAll();
    }
}
