package com.groupeisi.calendarDay;

import com.groupeisi.HistoryDay.History;
import com.groupeisi.HistoryDay.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/calendar")
public class DayFinderResource {
    @Autowired
    private DayFinderService dayFinderService;

    @Autowired
    private HistoryService historyService;

    @GetMapping ("/dayfinder")
    public ResponseEntity<DayFinder> findDayOfWeek(@RequestParam String date) {
        DayFinder dayFinder = dayFinderService.findDayOfWeek(date);
        History history = historyService.saveSearch(date, dayFinder);
        return ResponseEntity.ok(dayFinder);
    }
}
