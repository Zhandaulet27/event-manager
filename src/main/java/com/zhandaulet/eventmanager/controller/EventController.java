package com.zhandaulet.eventmanager.controller;

import com.zhandaulet.eventmanager.entity.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.zhandaulet.eventmanager.repository.EventRepository;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventRepository eventRepository;

    @GetMapping
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    @PostMapping
    public Event save(@RequestBody Event event) {
        return eventRepository.save(event);
    }

    @PutMapping("/{id}")
    public Event update(@PathVariable Long id, @RequestBody Event event) {
        event.setId(id);
        return eventRepository.save(event);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        eventRepository.deleteById(id);
    }

}
