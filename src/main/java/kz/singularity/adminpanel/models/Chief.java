package kz.singularity.adminpanel.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name="chief")
@Getter
@Setter
@ToString
public class Chief {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String fio;
  private String description;
  private boolean isOnline;

  @ManyToMany
  @JoinTable(
          name = "Chief_Dish",
          joinColumns = @JoinColumn(name = "chief_id"),
          inverseJoinColumns = @JoinColumn(name = "dish_id")
  )
  private List<Dish> dishList;
}
