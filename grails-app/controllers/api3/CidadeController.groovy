package api3

import grails.converters.JSON
import grails.plugins.rest.client.RestBuilder
import grails.plugins.rest.client.RestResponse
import org.grails.web.json.JSONObject

import java.time.LocalDate

class CidadeController {

    CidadeService cidadeService

    static responseFormats = ["json"]
    static allowedMethods = [
            save: "POST",
            list: "GET",
            update: "PUT",
            delete: "DELETE",
            get: "GET"
    ]

    def list(){
        Map retorno = cidadeService.list()
        respond(retorno)
    }

    def get(long id){
        Map retorno = cidadeService.get(id)
        respond(retorno)
    }

    def save(){
        Map retorno = cidadeService.save()
        respond(retorno)
    }

    def update() {
        Map retorno = cidadeService.update()
        respond(retorno)
    }

    def delete(Long id) {
        Map retorno = cidadeService.delete(id)
        respond(retorno)
    }
}
