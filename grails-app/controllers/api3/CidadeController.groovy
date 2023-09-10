package api3

import grails.converters.JSON

import java.time.LocalDate

class CidadeController {

    CidadeService cidadeService

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

    def update() {
        Map retorno = cidadeService.update()
        respond(retorno)
    }

    def delete(Long id) {
        Map retorno = cidadeService.delete(id)
        respond(retorno)
    }
}
