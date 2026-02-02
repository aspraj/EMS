package employee_service.employee_service.domain.entities;

import employee_service.employee_service.domain.enums.EmployeeStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Basic Info
    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(unique = true, nullable = false)
    private String employeeCode;

    @Column(unique = true)
    private String email;

    // Organization Info
    private String department;
    private String designation;
    private String assignedOdc;
    private Long managerId;
    private boolean projectAssigned;

    // Employment Info
    private String employmentType; // FULL_TIME, CONTRACT

    @Enumerated(EnumType.STRING)
    private EmployeeStatus status;

    private LocalDate dateOfJoining;
    private LocalDate dateOfExit;

    // Address
    private String addressLine;
    private String city;
    private String state;
    private String country;
    private String pinCode;

    //    Audit
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String createdBy;
    private String updatedBy;

    private boolean active;
}
