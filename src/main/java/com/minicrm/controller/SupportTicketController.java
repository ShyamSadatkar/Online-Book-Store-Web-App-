package com.minicrm.controller;

import com.minicrm.entity.SupportTicket;
import com.minicrm.service.SupportTicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tickets")
@RequiredArgsConstructor
public class SupportTicketController {
    private final SupportTicketService ticketService;

    @GetMapping
    public List<SupportTicket> getAll() {
        return ticketService.getAllTickets();
    }

    @GetMapping("/customer/{customerId}")
    public List<SupportTicket> getByCustomer(@PathVariable Long customerId) {
        return ticketService.getTicketsByCustomerId(customerId);
    }

    @PostMapping
    public SupportTicket add(@RequestBody SupportTicket ticket) {
        return ticketService.addTicket(ticket);
    }
}