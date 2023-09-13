package api3

class ReajusteSalarioController {

    ReajusteSalarioService reajusteSalarioService

    static responseFormats = ["json"]
    static allowedMethods = [
            save: "POST",
            list: "GET",
            update: "PUT",
            delete: "DELETE",
            get: "GET"
    ]

    def list(){
        Map retorno = reajusteSalarioService.list()
        respond(retorno)
    }

    def get(long id){
        Map retorno = reajusteSalarioService.get(id)
        respond(retorno)
    }

    def save(){
        Map retorno = reajusteSalarioService.save()
        respond(retorno)
    }

    def update(Long id) {
        Map retorno = reajusteSalarioService.update(id)
        respond(retorno)
    }

    def delete(Long id) {
        Map retorno = reajusteSalarioService.delete(id)
        respond(retorno)
    }
}
