package id.co.sisteminformasip5mbackendapi.service.impl;

import id.co.sisteminformasip5mbackendapi.repository.PolmanAstraRepository;
import id.co.sisteminformasip5mbackendapi.service.MasterKelasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class MasterKelasServiceImpl implements MasterKelasService {
    @Autowired
    PolmanAstraRepository polmanAstraRepository;

    @Override
    public String getDataKelas(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("p5m_getDataKelas", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String getDataKelasCombo(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("p5m_getDataKelasCombo", dataList.toArray(new String[0]));
        return result;
    }
    @Override
    public String getDataKelasById(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("p5m_getDataKelasById", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String createKelas(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("p5m_createKelas", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String detailKelas(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("p5m_detailKelas", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String editKelas(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("p5m_editKelas", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String setStatusKelas(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("p5m_setStatusKelas", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String getListKelas(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("p5m_getListKelas", dataList.toArray(new String[0]));
        return result;
    }
}
