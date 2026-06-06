package pl.wszib.java.advanced.tickethub.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import pl.wszib.java.advanced.tickethub.entity.Event;
import pl.wszib.java.advanced.tickethub.repository.EventRepository;

@Service
@RequiredArgsConstructor
public class EventService {

  private final EventRepository eventRepository;

  public List<Event> getAllEvents() {
    return eventRepository.findAll();
  }

  public void saveEvent(Event event) {
    eventRepository.save(event);
  }
}
