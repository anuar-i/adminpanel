
package kz.singularity.adminpanel.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "order")
public class Order {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "chief_id",referencedColumnName = "id")
  private Chief chief;
  @ManyToOne
  @JoinColumn(name = "client_id",referencedColumnName = "id")
  private Client client;

  private Date date;
  private int price;


}

