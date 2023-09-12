package api3

import grails.plugins.rest.client.RestBuilder
import grails.plugins.rest.client.RestResponse
import org.grails.web.json.JSONObject

import java.time.LocalDate

class ReajusteSalarioService {

    LogService logService
    RestBuilder rest = new RestBuilder()

    Map list() {
        RestResponse resp = rest.get("http://localhost:8080/API2/reajusteSalario/list")
        JSONObject respJson = resp.json as JSONObject
        return respJson
    }

    Map get(Long id) {
        RestResponse resp = rest.get("http://localhost:8080/API2/reajusteSalario/get/${id}")
        JSONObject respJson = resp.json as JSONObject
        return respJson
    }

    Map delete(Long id){
        RestResponse resp = rest.delete("http://localhost:8080/API2/reajusteSalario/delete/${id}")
        JSONObject respJson = resp.json as JSONObject
        return respJson
    }

    Map save(){
        return retorno
    }

    Map update(){
        return retorno
    }
}
