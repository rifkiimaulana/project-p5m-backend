package id.co.sisteminformasip5mbackendapi.service;

import java.util.Map;

public interface MasterKelasService {
    String getDataKelas(Map<String, Object> data);
    String getDataKelasCombo(Map<String, Object> data);
    String getDataKelasById(Map<String, Object> data);
    String createKelas(Map<String, Object> data);
    String detailKelas(Map<String, Object> data);
    String editKelas(Map<String, Object> data);
    String setStatusKelas(Map<String, Object> data);
    String getListKelas(Map<String, Object> data);
}
