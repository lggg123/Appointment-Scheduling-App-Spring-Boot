package main.java.codezforlife.com.model;

@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String description;
    // Constructors, Getters, Setters
}
