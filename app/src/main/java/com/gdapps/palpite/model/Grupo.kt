package com.gdapps.palpite.model

import com.gdapps.palpite.enums.EnumGrupo

class Grupo{

    val codigo:Int
    val nome:String
    val milhar:Int
    val centena:Int
    val dezena:Int
    val numeroViciado:Boolean
    val dadosGrupo: DadosGrupo?

    constructor(
        codigo:Int, nome:String, milhar:Int, centena:Int, dezena:Int,
        numeroViciado:Boolean, dadosGrupo: DadosGrupo?
    )
    {
        this.codigo = codigo
        this.nome = nome
        this.milhar = milhar
        this.centena = centena
        this.dezena = dezena
        this.numeroViciado = numeroViciado
        this.dadosGrupo = dadosGrupo
    }

    fun obterNomeGrupoPorDezena(dezena: Int) =
        when(dezena){
            EnumGrupo.AVESTRUZ.primeiraDezena,
            EnumGrupo.AVESTRUZ.segundaDezena,
            EnumGrupo.AVESTRUZ.terceiraDezena,
            EnumGrupo.AVESTRUZ.quartaDezena -> EnumGrupo.AVESTRUZ.nome
            EnumGrupo.AGUIA.primeiraDezena,
            EnumGrupo.AGUIA.segundaDezena,
            EnumGrupo.AGUIA.terceiraDezena,
            EnumGrupo.AGUIA.quartaDezena -> EnumGrupo.AGUIA.nome
            EnumGrupo.BURRO.primeiraDezena,
            EnumGrupo.BURRO.segundaDezena,
            EnumGrupo.BURRO.terceiraDezena,
            EnumGrupo.BURRO.quartaDezena -> EnumGrupo.BURRO.nome
            EnumGrupo.BORBOLETA.primeiraDezena,
            EnumGrupo.BORBOLETA.segundaDezena,
            EnumGrupo.BORBOLETA.terceiraDezena,
            EnumGrupo.BORBOLETA.quartaDezena -> EnumGrupo.BORBOLETA.nome
            EnumGrupo.CACHORRO.primeiraDezena,
            EnumGrupo.CACHORRO.segundaDezena,
            EnumGrupo.CACHORRO.terceiraDezena,
            EnumGrupo.CACHORRO.quartaDezena -> EnumGrupo.CACHORRO.nome
            EnumGrupo.CABRA.primeiraDezena,
            EnumGrupo.CABRA.segundaDezena,
            EnumGrupo.CABRA.terceiraDezena,
            EnumGrupo.CABRA.quartaDezena -> EnumGrupo.CABRA.nome
            EnumGrupo.CARNEIRO.primeiraDezena,
            EnumGrupo.CARNEIRO.segundaDezena,
            EnumGrupo.CARNEIRO.terceiraDezena,
            EnumGrupo.CARNEIRO.quartaDezena -> EnumGrupo.CARNEIRO.nome
            EnumGrupo.CAMELO.primeiraDezena,
            EnumGrupo.CAMELO.segundaDezena,
            EnumGrupo.CAMELO.terceiraDezena,
            EnumGrupo.CAMELO.quartaDezena -> EnumGrupo.CAMELO.nome
            EnumGrupo.COBRA.primeiraDezena,
            EnumGrupo.COBRA.segundaDezena,
            EnumGrupo.COBRA.terceiraDezena,
            EnumGrupo.COBRA.quartaDezena -> EnumGrupo.COBRA.nome
            EnumGrupo.COELHO.primeiraDezena,
            EnumGrupo.COELHO.segundaDezena,
            EnumGrupo.COELHO.terceiraDezena,
            EnumGrupo.COELHO.quartaDezena -> EnumGrupo.COELHO.nome
            EnumGrupo.CAVALO.primeiraDezena,
            EnumGrupo.CAVALO.segundaDezena,
            EnumGrupo.CAVALO.terceiraDezena,
            EnumGrupo.CAVALO.quartaDezena -> EnumGrupo.CAVALO.nome
            EnumGrupo.ELEFANTE.primeiraDezena,
            EnumGrupo.ELEFANTE.segundaDezena,
            EnumGrupo.ELEFANTE.terceiraDezena,
            EnumGrupo.ELEFANTE.quartaDezena -> EnumGrupo.ELEFANTE.nome
            EnumGrupo.GALO.primeiraDezena,
            EnumGrupo.GALO.segundaDezena,
            EnumGrupo.GALO.terceiraDezena,
            EnumGrupo.GALO.quartaDezena -> EnumGrupo.GALO.nome
            EnumGrupo.GATO.primeiraDezena,
            EnumGrupo.GATO.segundaDezena,
            EnumGrupo.GATO.terceiraDezena,
            EnumGrupo.GATO.quartaDezena -> EnumGrupo.GATO.nome
            EnumGrupo.JACARE.primeiraDezena,
            EnumGrupo.JACARE.segundaDezena,
            EnumGrupo.JACARE.terceiraDezena,
            EnumGrupo.JACARE.quartaDezena -> EnumGrupo.JACARE.nome
            EnumGrupo.LEAO.primeiraDezena,
            EnumGrupo.LEAO.segundaDezena,
            EnumGrupo.LEAO.terceiraDezena,
            EnumGrupo.LEAO.quartaDezena -> EnumGrupo.LEAO.nome
            EnumGrupo.MACACO.primeiraDezena,
            EnumGrupo.MACACO.segundaDezena,
            EnumGrupo.MACACO.terceiraDezena,
            EnumGrupo.MACACO.quartaDezena -> EnumGrupo.MACACO.nome
            EnumGrupo.PORCO.primeiraDezena,
            EnumGrupo.PORCO.segundaDezena,
            EnumGrupo.PORCO.terceiraDezena,
            EnumGrupo.PORCO.quartaDezena -> EnumGrupo.PORCO.nome
            EnumGrupo.PAVAO.primeiraDezena,
            EnumGrupo.PAVAO.segundaDezena,
            EnumGrupo.PAVAO.terceiraDezena,
            EnumGrupo.PAVAO.quartaDezena -> EnumGrupo.PAVAO.nome
            EnumGrupo.PERU.primeiraDezena,
            EnumGrupo.PERU.segundaDezena,
            EnumGrupo.PERU.terceiraDezena,
            EnumGrupo.PERU.quartaDezena -> EnumGrupo.PERU.nome
            EnumGrupo.TOURO.primeiraDezena,
            EnumGrupo.TOURO.segundaDezena,
            EnumGrupo.TOURO.terceiraDezena,
            EnumGrupo.TOURO.quartaDezena -> EnumGrupo.TOURO.nome
            EnumGrupo.TIGRE.primeiraDezena,
            EnumGrupo.TIGRE.segundaDezena,
            EnumGrupo.TIGRE.terceiraDezena,
            EnumGrupo.TIGRE.quartaDezena -> EnumGrupo.TIGRE.nome
            EnumGrupo.URSO.primeiraDezena,
            EnumGrupo.URSO.segundaDezena,
            EnumGrupo.URSO.terceiraDezena,
            EnumGrupo.URSO.quartaDezena -> EnumGrupo.URSO.nome
            EnumGrupo.VEADO.primeiraDezena,
            EnumGrupo.VEADO.segundaDezena,
            EnumGrupo.VEADO.terceiraDezena,
            EnumGrupo.VEADO.quartaDezena -> EnumGrupo.VEADO.nome
            EnumGrupo.VACA.primeiraDezena,
            EnumGrupo.VACA.segundaDezena,
            EnumGrupo.VACA.terceiraDezena,
            EnumGrupo.VACA.quartaDezena -> EnumGrupo.VACA.nome
            else
            -> null
        }
}