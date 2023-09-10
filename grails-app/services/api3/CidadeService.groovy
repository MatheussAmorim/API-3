package api3

class CidadeService {

    def resp

    Map save(){
        Map retorno = [success: true]

        resp = rest.post("http://localhost:8080/API2/cidade/save"){
            contentType "application/json"
            json {
                name = "São Leopoldo"
            }
        }

        return retorno
    }
}
