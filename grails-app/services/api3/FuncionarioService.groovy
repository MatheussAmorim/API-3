package api3

import java.time.LocalDate

class FuncionarioService {

    def resp
    LogService logService

    Map save(){

        def requestData = request.JSON
        logService.salvarLog(data: LocalDate.now(), descricao: "Requisição SAVE para API2: ${requestData}")

        Map retorno = [success: true]

        resp = rest.post("http://localhost:8080/API2/funcionario/save"){
            contentType "application/json"
        }
        return retorno
    }

    Map update(){
        def requestData = request.JSON
        logService.salvarLog(data: LocalDate.now(), descricao: "Requisição UPDATE para API2: ${requestData}")

        Map retorno = [success: true]

        resp = rest.update("http://localhost:8080/API2/funcionario/update"){
            contentType "application/json"
        }
        return retorno
    }

    Map delete(){
        def requestData = request.JSON
        logService.salvarLog(data: LocalDate.now(), descricao: "Requisição DELETE para API2: ${requestData}")

        Map retorno = [success: true]

        resp = rest.delete("http://localhost:8080/API2/funcionario/delete"){
            contentType "application/json"
        }
        return retorno
    }
}
