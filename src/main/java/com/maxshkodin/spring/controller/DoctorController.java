package com.maxshkodin.spring.controller;


import com.maxshkodin.spring.model.Client;
import com.maxshkodin.spring.model.Doctor;
import com.maxshkodin.spring.model.Speciality;
import com.maxshkodin.spring.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @RequestMapping(value="/doctors", method=RequestMethod.GET)
    public String getOrderPage(Model model) {
        model.addAttribute("doctorsList",doctorService.getAll());
        return "doctors";
    }

    @RequestMapping(value="/registerDoctor", method= RequestMethod.GET)
    public String getClientRegistrationPage(Model model) {
        return "clientRegistration";
    }

    @RequestMapping(value="/register-new-doctor", method=RequestMethod.POST)
    public String addNewClient(@RequestParam(value="fullName") String fullName,
                               @RequestParam(value="phoneNumber") String phoneNumber,
                               @RequestParam(value="email") String email,
                               @RequestParam(value="login") String login,
                               @RequestParam(value="password") String password,
                               @RequestParam(value="speciality") String speciality) {

        Speciality doctorSpeciality = Speciality.valueOf(speciality);
        Doctor doctor = new Doctor(fullName,phoneNumber,email,login,password,doctorSpeciality);
        doctorService.add(doctor);
        return "redirect:/";
    }




}
