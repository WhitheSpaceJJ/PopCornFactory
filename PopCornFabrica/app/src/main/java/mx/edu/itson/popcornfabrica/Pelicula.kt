package mx.itson.edu.popcornfactory

import mx.edu.itson.popcornfabrica.Cliente

class Pelicula {

    var titulo: String
    var image: Int
    var header: Int
    var sinopsis: String
    var listaClientes: List<Cliente> = emptyList()
    constructor(titulo: String, image: Int, header: Int, sinopsis: String) {
        this.titulo = titulo
        this.image = image
        this.header = header
        this.sinopsis = sinopsis
    }

    constructor(titulo: String, image: Int, header: Int, sinopsis: String, listaClientes: List<Cliente>) {
        this.titulo = titulo
        this.image = image
        this.header = header
        this.sinopsis = sinopsis
        this.listaClientes = listaClientes
    }
}