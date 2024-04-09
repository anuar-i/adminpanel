package kz.singularity.adminpanel.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="chief_dish")
@Getter
@Setter
@ToString
public class ChiefDish {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

}