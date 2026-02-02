package project_service.project_service.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import project_service.project_service.domain.enums.ProjectStatus;

import java.time.LocalDate;

@Entity
@Table(name = "projects")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String projectCode;

    private String name;
    private String description;

    private LocalDate startDate;
    private LocalDate endDate;

    private ProjectStatus status;

    private Long organizationId;

    private boolean active;
}
