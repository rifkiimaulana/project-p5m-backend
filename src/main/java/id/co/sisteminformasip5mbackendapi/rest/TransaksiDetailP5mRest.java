package id.co.sisteminformasip5mbackendapi.rest;

import id.co.sisteminformasip5mbackendapi.config.EncodeData;
import id.co.sisteminformasip5mbackendapi.service.TransaksiDetailP5mService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/api/TransaksiDetailP5m")
public class TransaksiDetailP5mRest {
    @Autowired
    private TransaksiDetailP5mService transaksiDetailP5mService;

    @Autowired
    private EncodeData encodeData;

    @PostMapping("/CreateDetailP5m")
    public ResponseEntity<String> createP5m(@RequestBody Map<String, Object> data) {
        try {
            Map<String, Object> encodedData = encodeData.htmlEncodeObject(data);
            String result = transaksiDetailP5mService.createDetailP5m(encodedData);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to create data", e);
        }
    }
}
