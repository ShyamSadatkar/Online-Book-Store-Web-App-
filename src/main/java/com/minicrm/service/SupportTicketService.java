package com.minicrm.service;

import com.minicrm.entity.SupportTicket;
import com.minicrm.repository.SupportTicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SupportTicketService {
    private final SupportTicketRepository ticketRepository;

    public List<SupportTicket> getAllTickets() {
        return ticketRepository.findAll();
    }

    public List<SupportTicket> getTicketsByCustomerId(Long customerId) {
        return ticketRepository.findByCustomerId(customerId);
    }

    public SupportTicket addTicket(SupportTicket ticket) {
        return ticketRepository.save(ticket);
    }
}