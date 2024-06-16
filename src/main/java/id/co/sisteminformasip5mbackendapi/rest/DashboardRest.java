package id.co.sisteminformasip5mbackendapi.rest;
import id.co.sisteminformasip5mbackendapi.config.EncodeData;
import id.co.sisteminformasip5mbackendapi.service.DashboardService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.slf4j.Logger;

import java.util.Map;
@CrossOrigin
@RestController
@RequestMapping("/api/dashboard")

public class DashboardRest {

    @Autowired
    private DashboardService dashboardService;

    @Autowired
    private EncodeData encodeData;

    @PostMapping("/grafikbar")
    public ResponseEntity<String> getBarChartData(@RequestBody Map<String, Object> data) {
        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String result = dashboardService.getBarChartData(encodedData);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to get bar chart data", e);
        }
    }

    @PostMapping("/melanggar")
    public ResponseEntity<String> getTop3MahasiswaMelanggar(@RequestBody Map<String, Object> data) {
        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String  result = dashboardService.getTop3MahasiswaMelanggar(encodedData);
            return ResponseEntity.ok().body(result);

        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to get top 3 mahasiswa melanggar: ", e);
        }
    }
}
