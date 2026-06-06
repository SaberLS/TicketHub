package pl.wszib.java.advanced.tickethub.entity.event;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Event {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Size(min = 2, max = 100, message = "Title must be between 2 and 100 characters")
  private String title;

  @NotNull(message = "Category is required")
  @Enumerated(EnumType.STRING)
  private EventCategory category;

  @Size(min = 2, max = 100)
  private String location;

  @NotNull(message = "Date is required")
  @FutureOrPresent(message = "Date cannot be in the past")
  private LocalDate eventDate;

  @NotNull(message = "Price is required")
  @Positive(message = "Price must be greater than 0")
  private BigDecimal ticketPrice;
}
