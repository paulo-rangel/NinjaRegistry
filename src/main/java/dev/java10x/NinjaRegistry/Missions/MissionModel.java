package dev.java10x.NinjaRegistry.Missions;


import dev.java10x.NinjaRegistry.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missions")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MissionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private MissionRank rank;
    //a mission can be assigned to multiple ninjas
    @OneToMany(mappedBy = "mission")
    private List<NinjaModel> ninjas;
}
