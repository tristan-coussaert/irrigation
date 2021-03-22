package org.sixdouglas.formation.spring.irrigation;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Data
@Builder
public class DetailedDrop {
    private String uuid;
    private GreenHouse greenHouse;
    private Instant instant;
}
