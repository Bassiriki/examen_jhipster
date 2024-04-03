package com.groupeisi.calendarDay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
public class DayFinderService {

    @Autowired
    private DayFinderRepository dayFinderRepository;

    public DayFinder findDayOfWeek(String dateStr) {
        LocalDate date = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        DayFinder dayFinder = new DayFinder();
        dayFinder.setDate(date);
        dayFinder.setDayOfWeek(dayOfWeek.toString());

        return dayFinderRepository.save(dayFinder);
    }
}
