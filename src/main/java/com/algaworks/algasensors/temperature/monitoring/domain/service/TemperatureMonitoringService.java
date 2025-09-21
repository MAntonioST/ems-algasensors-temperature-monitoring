package com.algaworks.algasensors.temperature.monitoring.domain.service;

import com.algaworks.algasensors.temperature.monitoring.api.model.TemperatureLogData;



public interface TemperatureMonitoringService {

    public void processTemperatureReading(TemperatureLogData temperatureLogData);
}
