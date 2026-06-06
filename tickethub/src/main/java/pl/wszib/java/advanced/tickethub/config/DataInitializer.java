package pl.wszib.java.advanced.tickethub.config;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.RequiredArgsConstructor;
import pl.wszib.java.advanced.tickethub.entity.event.Event;
import pl.wszib.java.advanced.tickethub.entity.event.EventCategory;
import pl.wszib.java.advanced.tickethub.repository.EventRepository;

@Configuration
@RequiredArgsConstructor
public class DataInitializer {

  @Bean
  CommandLineRunner init(EventRepository repository) {
    return args -> {

      repository.save(
          Event.builder()
              .title("Avengers: Endgame")
              .category(EventCategory.MOVIE)
              .location("Cinema City")
              .eventDate(LocalDate.now().plusDays(3))
              .ticketPrice(new BigDecimal("29.99"))
              .build());

      repository.save(
          Event.builder()
              .title("Metallica World Tour")
              .category(EventCategory.CONCERT)
              .location("National Stadium")
              .eventDate(LocalDate.now().plusDays(14))
              .ticketPrice(new BigDecimal("249.99"))
              .build());

      repository.save(
          Event.builder()
              .title("Dune Part Two")
              .category(EventCategory.MOVIE)
              .location("Multikino")
              .eventDate(LocalDate.now().plusDays(7))
              .ticketPrice(new BigDecimal("34.99"))
              .build());
    };
  }
}
