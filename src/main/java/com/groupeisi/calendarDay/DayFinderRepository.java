package com.groupeisi.calendarDay;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DayFinderRepository extends JpaRepository<DayFinder, Long> {
}
