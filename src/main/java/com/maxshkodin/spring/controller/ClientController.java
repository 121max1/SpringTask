package com.maxshkodin.spring.controller;

import com.maxshkodin.spring.model.Client;
import com.maxshkodin.spring.service.AppointmentService;
import com.maxshkodin.spring.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClientController {

    @Autowired
    private ClientService clientService;

    @RequestMapping(value="/clients", method=RequestMethod.GET)
    public String getOrderPage(Model model) {
        model.addAttribute("clientList",clientService.getAll());
        return "clients";
    }

    @RequestMapping(value="/registerClient", method=RequestMethod.GET)
    public String getClientRegistrationPage(Model model) {
        return "clientRegistration";
    }

    @RequestMapping(value="/register-new-client", method=RequestMethod.POST)
    public String addNewClient(@RequestParam(value="fullName") String fullName,
                               @RequestParam(value="phoneNumber") String phoneNumber,
                               @RequestParam(value="email") String email,
                               @RequestParam(value="login") String login,
                               @RequestParam(value="password") String password) {
        Client client = new Client(fullName,phoneNumber,email,login,password);
        clientService.add(client);
        return "redirect:/";
    }


}
