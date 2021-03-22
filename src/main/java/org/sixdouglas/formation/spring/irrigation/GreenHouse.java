package org.sixdouglas.formation.spring.irrigation;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.List;

@Data
@Builder
public class GreenHouse {
    private int id;
    private String name;
    @Singular
    private List<Row> rows;
}
