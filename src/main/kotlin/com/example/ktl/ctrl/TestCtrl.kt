package com.example.ktl.ctrl;

import com.example.ktl.ctrl.dto.QueryDTO
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController;

@RestController
class TestCtrl {

    @GetMapping(path = ["/"], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun accounts(filter: QueryDTO): String {
        return "success ${filter.values?.get(0)}"
    }
    
    @GetMapping(path = ["/list"], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun accountsLiast(@RequestParam values: List<String>): String {
        return "success ${values[0]}"
    }
}
