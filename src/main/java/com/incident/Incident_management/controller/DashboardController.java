package com.incident.Incident_management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.incident.Incident_management.service.IncidentService;

@Controller
public class DashboardController {

    private final IncidentService service;

    public DashboardController(IncidentService service) {
        this.service = service;
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("username", "Admin"); // later fetch from auth
        model.addAttribute("incidents", service.getAllIncidents());
        return "dashboard"; // maps to dashboard.html
    }
}
