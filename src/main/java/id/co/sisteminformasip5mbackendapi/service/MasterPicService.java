package id.co.sisteminformasip5mbackendapi.service;

import java.util.Map;

public interface MasterPicService {
    String getDataPic(Map<String, Object> data);
    String getDataPicById(Map<String, Object> data);
    String createPic(Map<String, Object> data);
    String detailPic(Map<String, Object> data);
    String editPic(Map<String, Object> data);
    String setStatusPic(Map<String, Object> data);
    String getListPic(Map<String, Object> data);
}
