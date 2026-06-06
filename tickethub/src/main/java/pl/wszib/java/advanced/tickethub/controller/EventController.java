package pl.wszib.java.advanced.tickethub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;
import pl.wszib.java.advanced.tickethub.entity.Event;
import pl.wszib.java.advanced.tickethub.service.EventService;

@Controller
@RequiredArgsConstructor
public class EventController {

  private final EventService eventService;

  @GetMapping("/")
  public String showEvents(Model model) {
    model.addAttribute("events", eventService.getAllEvents());
    return "events";
  }

  @GetMapping("/add")
  public String showAddForm(Model model) {
    model.addAttribute("event", new Event());
    return "add-event";
  }

  @PostMapping("/add")
  public String addEvent(@ModelAttribute Event event) {
    eventService.saveEvent(event);
    return "redirect:/";
  }
}
