package com.gdapps.palpite.model

open class Bicho {

    private val codigoGrupo: Int
    private val nome: String
    private val listaDezenas: ArrayList<Int>

    constructor(codigoGrupo:Int, nome:String, listaDezenas: ArrayList<Int>){
        this.codigoGrupo = codigoGrupo
        this.nome = nome
        this.listaDezenas = listaDezenas
    }
}