package com.example.TeamManagementSystem.managementController;

import org.springframework.ui.Model;
import com.example.TeamManagementSystem.entity.Players;
import com.example.TeamManagementSystem.service.PlayersService;
import com.example.TeamManagementSystem.service.PlayersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class Team_Controller {

    @Autowired
    private PlayersService playersService;

    public Team_Controller(PlayersService playersService){
        this.playersService=playersService;
    }

//------------- find list of players -----------------
    @GetMapping("/listOfPlayers")
    public String findListOfPlayers(Model model){
        List<Players> playersList=playersService.findAllPlayers();
        model.addAttribute("listOfPlayers",playersList);
        return "displayPlayersList";
    }
}
