package kz.singularity.adminpanel.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;


@Entity
@Table(name = "client")
@Getter
@Setter
@ToString
public class Client {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String fio;
  private String phone;
  private String address;

  @OneToMany(mappedBy = "client")
  private List<Order> orderList;
}

