package pl.wszib.java.advanced.tickethub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.wszib.java.advanced.tickethub.entity.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
}
