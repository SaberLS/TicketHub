package pl.wszib.java.advanced.tickethub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import pl.wszib.java.advanced.tickethub.entity.event.Event;
import pl.wszib.java.advanced.tickethub.entity.event.EventCategory;
import pl.wszib.java.advanced.tickethub.service.EventService;

@Controller
@RequiredArgsConstructor
public class EventController {

  private final EventService eventService;

  @ModelAttribute("categories")
  public EventCategory[] categories() {
    return EventCategory.values();
  }

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
  public String addEvent(
      @Valid @ModelAttribute("event") Event event,
      BindingResult bindingResult) {

    if (bindingResult.hasErrors()) {
      return "add-event";
    }

    eventService.saveEvent(event);
    return "redirect:/";
  }
}
