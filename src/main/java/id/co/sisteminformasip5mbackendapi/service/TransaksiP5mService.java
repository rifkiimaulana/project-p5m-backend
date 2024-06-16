package id.co.sisteminformasip5mbackendapi.service;

import java.util.Map;

public interface TransaksiP5mService {

     String createP5m(Map<String, Object> data);

     String editP5m(Map<String, Object> data);
     String getRiwayatP5m(Map<String, Object> data);
     String getCetakP5m(Map<String, Object> data);
}
