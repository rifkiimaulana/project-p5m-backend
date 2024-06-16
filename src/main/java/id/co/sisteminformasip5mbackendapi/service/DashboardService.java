package id.co.sisteminformasip5mbackendapi.service;

import java.util.Map;

public interface DashboardService {
    String getBarChartData(Map<String, Object> data);
    String getTop3MahasiswaMelanggar(Map<String, Object> data);
}
