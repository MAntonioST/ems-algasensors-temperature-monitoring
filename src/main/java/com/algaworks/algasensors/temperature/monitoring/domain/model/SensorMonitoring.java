package com.algaworks.algasensors.temperature.monitoring.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SensorMonitoring {

    @EmbeddedId
    @AttributeOverride(name = "value", column = @Column(name = "id", columnDefinition = "BIGINT"))
    private SensorId id;
    private Double lastTemperature;
    private OffsetDateTime updatedAt;
    private Boolean enabled;

    public boolean isEnabled() {
        return Boolean.TRUE.equals(enabled);
    }
}