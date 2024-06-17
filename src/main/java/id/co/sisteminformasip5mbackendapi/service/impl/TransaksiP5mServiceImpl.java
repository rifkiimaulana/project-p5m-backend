package id.co.sisteminformasip5mbackendapi.service.impl;

import id.co.sisteminformasip5mbackendapi.repository.PolmanAstraRepository;
import id.co.sisteminformasip5mbackendapi.service.TransaksiP5mService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class TransaksiP5mServiceImpl implements TransaksiP5mService {

    @Autowired
    PolmanAstraRepository polmanAstraRepository;

    @Override
    public String createP5m(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }

        return polmanAstraRepository.callProcedure("p5m_createP5m", dataList.toArray(new String[0]));

    }

    @Override
    public String editP5m(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }

        System.out.println("dataList");
        System.out.println(dataList);

        return polmanAstraRepository.callProcedure("p5m_createP5m", dataList.toArray(new String[0]));

    }
    
    @Override
    public String getRiwayatP5m(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        System.out.println("Parameters: " + dataList);

        String result = polmanAstraRepository.callProcedure("p5m_getP5mHistory", dataList.toArray(new String[0]));
        System.out.println("Result: " + result);

        return result;
    }

    @Override
    public String getCetakP5m(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        System.out.println("Parameters: " + dataList);

        String result = polmanAstraRepository.callProcedure("p5m_Cetak", dataList.toArray(new String[0]));
        System.out.println("Result: " + result);

        return result;
    }

    @Override
    public String deleteP5mRecords(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }

        System.out.println("deleteP5mRecords");
        System.out.println(dataList);
        System.out.println("deleteP5mRecords");

        return polmanAstraRepository.callProcedure("p5m_DeleteP5mRecords", dataList.toArray(new String[0]));
    }
}
