package com.spring.team.team.model;





public class Team {


    private Long id;
    private String fromValue;
    private String toValue;
    private int moneyTeam;
    private String note;
    private String numberTeam;


    public Team() {
    }

    public Team(Long id, String fromValue, String toValue, int moneyTeam, String note, String numberTeam) {
        this.id = id;
        this.fromValue = fromValue;
        this.toValue = toValue;
        this.moneyTeam = moneyTeam;
        this.note = note;
        this.numberTeam = numberTeam;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFromValue() {
        return fromValue;
    }

    public void setFromValue(String fromValue) {
        this.fromValue = fromValue;
    }

    public String getToValue() {
        return toValue;
    }

    public void setToValue(String toValue) {
        this.toValue = toValue;
    }

    public int getMoneyTeam() {
        return moneyTeam;
    }

    public void setMoneyTeam(int moneyTeam) {
        this.moneyTeam = moneyTeam;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getNumberTeam() {
        return numberTeam;
    }

    public void setNumberTeam(String numberTeam) {
        this.numberTeam = numberTeam;
    }
}
