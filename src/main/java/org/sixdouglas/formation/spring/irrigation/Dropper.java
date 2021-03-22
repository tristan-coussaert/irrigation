package org.sixdouglas.formation.spring.irrigation;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Dropper {
    private int id;
    private String name;
    private boolean broken;
}
