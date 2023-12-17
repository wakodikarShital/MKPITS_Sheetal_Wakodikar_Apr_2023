package com.example.TeamManagementSystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class Players {
    @Id
    private int player_id;
    private String first_name;
    private String last_name;
    private Date date_of_birth;
    private String nationality;
    private String city;
    private double percentage_of_fitness;
    private String isbowler;
    private String isbatsman;
    private String isallrounder;
    private String iswicketkeeper;



    public Players() {
    }

    public Players(int player_id, String first_name, String last_name, Date date_of_birth, String nationality, String city, double percentage_of_fitness, String isbowler, String isbatsman, String isallrounder, String iswicketkeeper) {
        this.player_id = player_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.date_of_birth = date_of_birth;
        this.nationality = nationality;
        this.city = city;
        this.percentage_of_fitness = percentage_of_fitness;
        this.isbowler = isbowler;
        this.isbatsman = isbatsman;
        this.isallrounder = isallrounder;
        this.iswicketkeeper = iswicketkeeper;
    }

    public int getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(int player_id) {
        this.player_id = player_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getPercentage_of_fitness() {
        return percentage_of_fitness;
    }

    public void setPercentage_of_fitness(double percentage_of_fitness) {
        this.percentage_of_fitness = percentage_of_fitness;
    }

    public String getIsbowler() {
        return isbowler;
    }

    public void setIsbowler(String isbowler) {
        this.isbowler = isbowler;
    }

    public String getIsbatsman() {
        return isbatsman;
    }

    public void setIsbatsman(String isbatsman) {
        this.isbatsman = isbatsman;
    }

    public String getIsallrounder() {
        return isallrounder;
    }

    public void setIsallrounder(String isallrounder) {
        this.isallrounder = isallrounder;
    }

    public String getIswicketkeeper() {
        return iswicketkeeper;
    }

    public void setIswicketkeeper(String iswicketkeeper) {
        this.iswicketkeeper = iswicketkeeper;
    }
}
