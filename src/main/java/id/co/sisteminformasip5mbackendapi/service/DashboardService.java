package id.co.sisteminformasip5mbackendapi.service;

import java.util.Map;

public interface DashboardService {
    String getCardKelas(Map<String, Object> data);
    String getTop3MahasiswaMelanggar(Map<String, Object> data);

    String getTop3MahasiswaMelanggarHariIni(Map<String, Object> data);
    String getBarChartDataPelanggaran(Map<String, Object> data);
}
