package com.booking.certificacion.models;

public class SearchCriteria {
    private String destination;
    private String checkin;
    private String checkout;

    public SearchCriteria(String destination, String checkin, String checkout) {
        this.destination = destination;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public String getDestination() {
        return destination;
    }

    public String getCheckin() {
        return checkin;
    }

    public String getCheckout() {
        return checkout;
    }
}
