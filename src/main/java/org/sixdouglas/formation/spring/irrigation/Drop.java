package org.sixdouglas.formation.spring.irrigation;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.UUID;

@Data
@Builder
public class Drop {
    private final String uuid = UUID.randomUUID().toString();
    private int greenHouseId;
    private int rowId;
    private int dropperId;
    private boolean broken;
    private Instant instant;
}
