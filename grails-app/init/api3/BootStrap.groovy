package api3

class BootStrap {

    LogService logService

    def init = { servletContext ->
        logService.testarConexao()
    }
    def destroy = {
    }
}
