package id.co.sisteminformasip5mbackendapi.rest;

import id.co.sisteminformasip5mbackendapi.config.EncodeData;
import id.co.sisteminformasip5mbackendapi.repository.PolmanAstraRepository;
import id.co.sisteminformasip5mbackendapi.service.TransaksiP5mService;
import org.springframework.aop.scope.ScopedProxyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/api/TransaksiP5m")
public class TransaksiP5mRest {

    @Autowired
    private TransaksiP5mService transaksiP5mService;

    @Autowired
    private EncodeData encodeData;

    @PostMapping("/CreateP5m")
    public ResponseEntity<String> createP5m(@RequestBody List<Map<String, Object>> dataList) {
        //logger.info("Received data: {}", dataList);

        try {
            for (Map<String, Object> data : dataList) {
                Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
                transaksiP5mService.createP5m(encodedData);
            }
            return ResponseEntity.ok().body("All data processed successfully");
        } catch (Exception e) {
            //logger.error("Failed to create data", e);
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to create data", e);
        }
    }

    @PostMapping("/EditP5m")
    public ResponseEntity<String> editP5m(@RequestBody List<Map<String, Object>> dataList) {
        try {
            // Construct encodedDataDel with "kelas" and "currentdate"
            String kelas = (String) dataList.get(0).get("p1"); // Assuming "p1" is a String
            String currentDate = LocalDate.now().toString(); // Get current date in ISO format (yyyy-MM-dd)

            Map<String, Object> encodedDataDel = new HashMap<>();
            encodedDataDel.put("p1", kelas);
            encodedDataDel.put("currentdate", currentDate);

            // Call deleteP5mRecords with encodedDataDel
            transaksiP5mService.deleteP5mRecords(encodedDataDel);

            for (Map<String, Object> data : dataList) {
                Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
                transaksiP5mService.editP5m(encodedData);
            }
            return ResponseEntity.ok().body("All data processed successfully");
        } catch (Exception e) {
            //logger.error("Failed to create data", e);
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to create data", e);
        }
    }

    @PostMapping("/GetRiwayatP5m")
    public ResponseEntity<String> getRiwayatP5m(@RequestBody Map<String, Object> data) {
        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String result = transaksiP5mService.getRiwayatP5m(encodedData);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to get data", e);
        }
    }

    @PostMapping("/GetCetakP5m")
        public ResponseEntity<String> getCetakP5m(@RequestBody Map<String, Object> data) {
        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String result = transaksiP5mService.getCetakP5m(encodedData);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to get data", e);
        }
    }

}
