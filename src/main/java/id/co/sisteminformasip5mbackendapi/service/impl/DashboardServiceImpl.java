package id.co.sisteminformasip5mbackendapi.service.impl;

import id.co.sisteminformasip5mbackendapi.repository.PolmanAstraRepository;
import id.co.sisteminformasip5mbackendapi.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DashboardServiceImpl implements DashboardService {
    @Autowired
    private PolmanAstraRepository polmanAstraRepository;

    @Override
    public String getCardKelas(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("p5m_getCardKelas", dataList.toArray(new String[0]));
        return result;
    }
    @Override
    public String getTop3MahasiswaMelanggar(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("p5m_getTop3MahasiswaMelanggar", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String getTop3MahasiswaMelanggarHariIni(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("p5m_getTop3MahasiswaMelanggarHariIni", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String getBarChartDataPelanggaran(Map<String, Object> data) {
        try {
            String startDate = data.get("startDate").toString();
            String endDate = data.get("endDate").toString();
            // Lakukan sesuatu dengan startDate dan endDate, misalnya lakukan validasi, atau gunakan dalam query ke database
        } catch (NullPointerException | ClassCastException | IllegalArgumentException e) {
            throw new IllegalArgumentException("startDate and endDate are required parameters");
        }

        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure ("p5m_getBarChartDataPelanggaran", dataList.toArray(new String[0]));
        return result;
    }

}
