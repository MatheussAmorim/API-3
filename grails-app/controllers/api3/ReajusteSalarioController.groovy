package api3

class ReajusteSalarioController {

    ReajusteSalarioService reajusteSalarioService

    static responseFormats = ["json"]
    static allowedMethods = [
            save: "POST",
            update: "PUT",
            delete: "DELETE"
    ]

    def save(){
        Map retorno = reajusteSalarioService.save()
        respond(retorno)
    }

    def update() {
        Map retorno = reajusteSalarioService.update()
        respond(retorno)
    }

    def delete(Long id) {
        Map retorno = reajusteSalarioService.delete(id)
        respond(retorno)
    }
}
