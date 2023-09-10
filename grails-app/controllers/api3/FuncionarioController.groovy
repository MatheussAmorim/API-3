package api3

class FuncionarioController {

    FuncionarioService funcionarioService

    static responseFormats = ["json"]
    static allowedMethods = [
            save: "POST",
            update: "PUT",
            delete: "DELETE"
    ]

    def save(){
        Map retorno = funcionarioService.save()
        respond(retorno)
    }

    def update() {
        Map retorno = funcionarioService.update()
        respond(retorno)
    }

    def delete(Long id) {
        Map retorno = funcionarioService.delete(id)
        respond(retorno)
    }
}
