package id.co.sisteminformasip5mbackendapi.service.impl;

import id.co.sisteminformasip5mbackendapi.repository.PolmanAstraRepository;
import id.co.sisteminformasip5mbackendapi.service.TransaksiDetailP5mService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class TransaksiDetailP5mServiceImpl implements TransaksiDetailP5mService {
    @Autowired
    PolmanAstraRepository polmanAstraRepository;

    @Override
    public String createDetailP5m(Map<String, Object> data) {
        List<String> dataList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            dataList.add(entry.getValue().toString());
        }
        String result = polmanAstraRepository.callProcedure("p5m_createDetailP5m", dataList.toArray(new String[0]));
        return result;
    }
}
