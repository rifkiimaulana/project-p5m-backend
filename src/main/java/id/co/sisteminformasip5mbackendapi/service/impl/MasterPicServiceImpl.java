package id.co.sisteminformasip5mbackendapi.service.impl;

import id.co.sisteminformasip5mbackendapi.repository.PolmanAstraRepository;
import id.co.sisteminformasip5mbackendapi.service.MasterPicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class MasterPicServiceImpl implements MasterPicService {
    @Autowired
    PolmanAstraRepository polmanAstraRepository;

    @Override
    public String getDataPic(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("p5m_getDataPic", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String getDataPicById(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("p5m_getDataPicById", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String createPic(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("p5m_createPic", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String detailPic(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("p5m_detailPic", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String editPic(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("p5m_editPic", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String setStatusPic(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("p5m_setStatusPic", dataList.toArray(new String[0]));
        return result;
    }

    @Override
    public String getListPic(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("p5m_getListPic", dataList.toArray(new String[0]));
        return result;
    }
}
