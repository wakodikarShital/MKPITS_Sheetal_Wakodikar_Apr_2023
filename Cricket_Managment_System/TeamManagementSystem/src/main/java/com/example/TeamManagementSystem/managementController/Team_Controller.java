package com.example.TeamManagementSystem.managementController;

import com.example.TeamManagementSystem.service.PlayersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Team_Controller {

    @Autowired
    private PlayersService playersService;

    public Team_Controller(PlayersService playersService){
        this.playersService=playersService;
    }

    @GetMapping("/adminLogin")
    public String Admin_Login_Form(){
        return "adminLoginForm";
    }























////------------- find list of players -----------------
//    @GetMapping("/listOfPlayers")
//    public String findListOfPlayers(Model model){
//        List<Players> playersList=playersService.findAllPlayers();
//        model.addAttribute("listOfPlayers",playersList);
//        return "displayPlayersList";
//    }

}
