package com.zhandaulet.eventmanager.repository;

import com.zhandaulet.eventmanager.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
