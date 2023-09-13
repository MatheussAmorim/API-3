package api3

class FuncionarioController {

    FuncionarioService funcionarioService

    static responseFormats = ["json"]
    static allowedMethods = [
            save: "POST",
            list: "GET",
            update: "PUT",
            delete: "DELETE",
            get: "GET"
    ]

    def list(){
        Map retorno = funcionarioService.list()
        respond(retorno)
    }

    def get(long id){
        Map retorno = funcionarioService.get(id)
        respond(retorno)
    }

    def save(){
        Map retorno = funcionarioService.save()
        respond(retorno)
    }

    def update(Long id) {
        Map retorno = funcionarioService.update(id)
        respond(retorno)
    }

    def delete(Long id) {
        Map retorno = funcionarioService.delete(id)
        respond(retorno)
    }
}
