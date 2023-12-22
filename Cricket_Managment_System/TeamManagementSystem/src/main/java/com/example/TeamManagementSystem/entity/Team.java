package com.example.TeamManagementSystem.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int team_id;
    private String team_name;
    private String team_description;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Players> playersList;

    public Team() {
    }

    public Team(String team_name, String team_description, List<Players> playersList) {

        this.team_name = team_name;
        this.team_description = team_description;
        this.playersList = playersList;
    }

    public int getTeam_id() {
        return team_id;
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public String getTeam_description() {
        return team_description;
    }

    public void setTeam_description(String team_description) {
        this.team_description = team_description;
    }

    public List<Players> getPlayersList() {
        return playersList;
    }

    public void setPlayersList(List<Players> playersList) {
        this.playersList = playersList;
    }
}
