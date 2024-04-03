package com.groupeisi.HistoryDay;


import com.groupeisi.calendarDay.DayFinder;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.Instant;

@Entity
    @Table(name = "history")
    public class History implements Serializable{

        @Id
        @GeneratedValue (strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "search_date")
        private Instant searchDate;

        @Column(name = "request")
        private String request;

        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "response_id", referencedColumnName = "id")
        private DayFinder response;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getSearchDate() {
        return searchDate;
    }

    public void setSearchDate(Instant searchDate) {
        this.searchDate = searchDate;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public DayFinder getResponse() {
        return response;
    }

    public void setResponse(DayFinder response) {
        this.response = response;
    }
// Getters et setters
    }

