package api3

import grails.converters.JSON

import java.time.LocalDate

class CidadeController {

    LogService logService

    static responseFormats = ["json"]
    static allowedMethods = [
            save: "POST",
            update: "PUT",
            delete: "DELETE"
    ]

    def save(){
        Map retorno = cidadeService.save()
        respond(retorno)
    }
}
