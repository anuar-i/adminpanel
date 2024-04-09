package kz.singularity.adminpanel.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="dish")
public class Dish {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private byte[] photo;
  private String description;
  private String composition;

@ManyToMany(mappedBy = "dishList")
  private List<Chief> chiefList;
}
