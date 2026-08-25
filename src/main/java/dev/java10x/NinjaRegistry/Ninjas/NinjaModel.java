package dev.java10x.NinjaRegistry.Ninjas;

import dev.java10x.NinjaRegistry.Missions.MissionModel;
import jakarta.annotation.sql.DataSourceDefinition;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table( name = "tb_ninjas_registry")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(unique = true)
    private String email;
    private int age;

    //a ninja can be associated to only one mission
    @ManyToOne
    @JoinColumn(name = "mission_id")
    private MissionModel mission;
}
